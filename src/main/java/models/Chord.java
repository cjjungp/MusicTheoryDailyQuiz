package models;

import SoundFiles.SoundPlayer;

public class Chord {

    private String fileName;
    private SoundPlayer player;

    public Chord (String fileName){
        this.fileName = fileName;
        this.player = new SoundPlayer(fileName);
    }

    public void play() {
        this.player.play();
    }

    public void stop() {
        this.player.stop();
    }
}
