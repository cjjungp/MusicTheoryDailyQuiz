package SoundFiles;

public class Correct2 {
    private static SoundPlayer sound = new SoundPlayer("C:\\Users\\Student\\workspace\\side-projects\\MusicTheoryDailyQuiz\\Correct2.wav");


    public static void play() {
        sound.play();
    }

    public static void stop() {
        sound.stop();
    }
}
