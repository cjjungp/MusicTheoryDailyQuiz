package SoundFiles;

public class Correct {
    private static SoundPlayer sound = new SoundPlayer("C:\\Users\\Student\\workspace\\side-projects\\MusicTheoryDailyQuiz\\Correct.wav");

    public static void play() {
        sound.play();
    }

    public static void stop() {
        sound.stop();
    }
}
