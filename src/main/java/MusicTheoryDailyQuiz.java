import SoundFiles.*;
import logger.Logger;
import models.Chord;
import ui.UserInput;
import ui.UserOutput;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MusicTheoryDailyQuiz {

    private static Logger logger = new Logger("Logger.txt");
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");

    public static void main(String[] args) {

        Map<String, Chord> soundFilesMap = new HashMap<>();
        File csvFile = new File("SoundFilePaths.csv");

        try (Scanner fileScanner = new Scanner(csvFile)) {
            while (fileScanner.hasNext()) {

                String line = fileScanner.nextLine();
                String[] lineArray = line.split(" ");

                if (lineArray.length > 1) {
                    soundFilesMap.put(lineArray[0], new Chord(lineArray[1]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        boolean isExit = false;

        while (!isExit) {
            Scanner scanner = new Scanner(System.in);
            UserOutput.openingGraphics();

            String choice = UserInput.chooseYourKeySignature();
            System.out.println(choice);

            if (choice.isBlank()) {
                break;
            }

            System.out.println("You are now in " + choice);
            System.out.println();
            logger.write(choice, dateTimeFormatter.format(LocalDateTime.now()));


            // Randomize question

            int randomNumber = new Random().nextInt(14);

            if (randomNumber == 0) {
                System.out.println("Spell the notes for Chord I in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEG";

                if (userQuestion.equalsIgnoreCase("CEG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("CEG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                }
            }



            if (randomNumber == 1) {
                System.out.println("Spell the notes for Chord ii in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DFA";

                if (userQuestion.equalsIgnoreCase("DFA")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("DFA").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 2) {
                System.out.println("Spell the notes for Chord iii in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EGB";

                if (userQuestion.equalsIgnoreCase("EGB")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("EGB").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 3) {
                System.out.println("Spell the notes for Chord IV in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "FAC";

                if (userQuestion.equalsIgnoreCase("FAC")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("FAC").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 4) {
                System.out.println("Spell the notes for Chord V in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GBD";

                if (userQuestion.equalsIgnoreCase("GBD")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("GBD").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 5) {
                System.out.println("Spell the notes for Chord vi in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "ACE";

                if (userQuestion.equalsIgnoreCase("ACE")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("ACE").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 6) {
                System.out.println("Spell the notes for Chord viio in C");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BDF";

                if (userQuestion.equalsIgnoreCase("BDF")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("BDF").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }

            // Db Major

            if (randomNumber == 7) {
                System.out.println("Spell the notes for Chord I in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DbFAb";

                if (userQuestion.equalsIgnoreCase("DbFAb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("DbFAb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 8) {
                System.out.println("Spell the notes for Chord ii in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EbGbBb";

                if (userQuestion.equalsIgnoreCase("EbGbBb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("EbGbBb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 9) {
                System.out.println("Spell the notes for Chord iii in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "FAbC";

                if (userQuestion.equalsIgnoreCase("FAbC")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("FAbC").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 10) {
                System.out.println("Spell the notes for Chord IV in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GbBbDb";

                if (userQuestion.equalsIgnoreCase("GbBbDb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("GbBbDb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 11) {
                System.out.println("Spell the notes for Chord V in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AbCEb";

                if (userQuestion.equalsIgnoreCase("AbCEb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("AbCEb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 12) {
                System.out.println("Spell the notes for Chord vi in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BbDbF";

                if (userQuestion.equalsIgnoreCase("BbDbF")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BbDbF").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 13) {
                System.out.println("Spell the notes for Chord viio in Db");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEbGb";

                if (userQuestion.equalsIgnoreCase("CEbGb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("CEbGb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }


        }
        UserOutput.closingGraphics();
    }

//
//    public static void playCMajor (Map<String, Chord> soundFilesMap){
//
//        int playCMajor = new Random().nextInt(7);
//        Scanner scanner = new Scanner(System.in);
//
//        if (playCMajor == 0) {
//            System.out.println("Spell the notes for Chord I in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("CEG")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")) {
//                    soundFilesMap.get("CEG").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 1) {
//            System.out.println("Spell the notes for Chord ii in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("DFA")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")){
//                    soundFilesMap.get("DFA").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 2) {
//            System.out.println("Spell the notes for Chord iii in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("EGB")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")){
//                    soundFilesMap.get("EGB").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 3) {
//            System.out.println("Spell the notes for Chord IV in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("FAC")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")){
//                    soundFilesMap.get("FAC").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 4) {
//            System.out.println("Spell the notes for Chord V in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("GBD")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")){
//                    soundFilesMap.get("GBD").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 5) {
//            System.out.println("Spell the notes for Chord vi in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("ACE")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("y")){
//                    soundFilesMap.get("ACE").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//        if (playCMajor == 6) {
//            System.out.println("Spell the notes for Chord viio in C");
//            String userQuestion = scanner.nextLine();
//
//            if (userQuestion.equalsIgnoreCase("BDF")) {
//                System.out.println("Correct!");
//                playRandomCorrectTracks(soundFilesMap);
//
//                System.out.println("Would you like to hear the chord?");
//                System.out.println("Press (Y)es or (N)o");
//                userQuestion = scanner.nextLine();
//
//                if (userQuestion.equalsIgnoreCase("Y")){
//                    soundFilesMap.get("BDF").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//
//
//    }
//
//
//


    public static void playRandomCorrectTracks (Map<String, Chord> soundFilesMap) {

        int playRandomCorrectTracks = new Random().nextInt(3);

        if (playRandomCorrectTracks == 0) {
            soundFilesMap.get("Correct").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Correct").stop();
        }

        if (playRandomCorrectTracks == 1) {
            soundFilesMap.get("Correct2").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Correct2").stop();
        }

        if (playRandomCorrectTracks == 2) {
            soundFilesMap.get("Correct3").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Correct3").stop();
        }
    }


    public static void playRandomWrongTracks (Map<String, Chord> soundFilesMap) {

        int playRandomWrongTracks = new Random().nextInt(3);

        if (playRandomWrongTracks == 0) {
            soundFilesMap.get("Wrong").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Wrong").stop();
        }

        if (playRandomWrongTracks == 1) {
            soundFilesMap.get("Wrong2").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Wrong2").stop();
        }

        if (playRandomWrongTracks == 2) {
            soundFilesMap.get("Wrong3").play();
            System.out.println("Press Enter to Continue");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            soundFilesMap.get("Wrong3").stop();
        }
    }
}


