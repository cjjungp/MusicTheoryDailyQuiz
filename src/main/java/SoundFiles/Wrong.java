package SoundFiles;

public class Wrong {
    private static SoundPlayer sound = new SoundPlayer("C:\\Users\\Student\\workspace\\side-projects\\MusicTheoryDailyQuiz\\Wrong.wav");


    public static void play() {
        sound.play();
    }

    public static void stop() {
        sound.stop();
    }
}
