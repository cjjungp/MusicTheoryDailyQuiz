package SoundFiles;

import javax.sound.sampled.*;
import java.io.File;

public class SoundPlayer {
    public static final int PLAY_ENTIRE_SOUND = 0;

    Clip clip = null;
    String pathFileName = null;
    volatile Thread playThread = null;  // volatile b/c this is used by isPlaying(),
    // which can be called in a loop in the main thread

    class Listener implements LineListener {
        // Don't cache/optimize this variable for loop checking
        volatile LineEvent.Type soundEvent = null;

        @Override
        public void update(LineEvent event) {
            soundEvent = event.getType();
        }
    }

    public SoundPlayer(String path, String fileName) {
        this(path + fileName);
    }

    public SoundPlayer(String pathAndFilename){
        this.pathFileName = pathAndFilename;

        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(pathFileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + pathFileName);
            e.printStackTrace();
        }
    }

    public boolean isPlaying() {
        return this.playThread != null;
    }

    public void stop() {
        this.clip.stop();
        this.playThread = null;
    }

    public void play(){
        play(PLAY_ENTIRE_SOUND);
    }

    public void play(int durationSeconds) {
        stop();
        this.clip.setFramePosition(0);
        Runnable clipStart = null;

        if (durationSeconds == PLAY_ENTIRE_SOUND) {
            Listener l = new Listener();
            this.clip.addLineListener(l);

            clipStart = () -> {
                this.clip.start();

                // Block thread until thread/sound is done
                while (l.soundEvent != LineEvent.Type.STOP) {
                    // Wait/poll
                }

                stop();
            };
        } else {
            clipStart = () -> {
                this.clip.start();

                try {
                    Thread.sleep(durationSeconds * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                stop();
            };
        }

        this.playThread = new Thread(clipStart);
        this.playThread.start();
    }
}

