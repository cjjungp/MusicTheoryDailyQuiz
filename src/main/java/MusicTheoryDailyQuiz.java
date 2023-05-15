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

            int[] questions = getQuestionRangeFromKey(choice);


            // C major
            int randomNumber = new Random().nextInt(questions[1] - questions[0])+ questions[0];

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


            // D Major

            if (randomNumber == 14) {
                System.out.println("Spell the notes for Chord I in D");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DF#A";

                if (userQuestion.equalsIgnoreCase("DF#A")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("DF#A").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 15) {
                System.out.println("Spell the notes for Chord ii in D");
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



            if (randomNumber == 16) {
                System.out.println("Spell the notes for Chord iii in D");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "F#AC#";

                if (userQuestion.equalsIgnoreCase("F#AC#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("F#AC#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 17) {
                System.out.println("Spell the notes for Chord IV in D");
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



            if (randomNumber == 18) {
                System.out.println("Spell the notes for Chord V in D");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AC#E";

                if (userQuestion.equalsIgnoreCase("AC#E")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("AC#E").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 19) {
                System.out.println("Spell the notes for Chord vi in D");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BDF#";

                if (userQuestion.equalsIgnoreCase("BDF#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BDF#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 20) {
                System.out.println("Spell the notes for Chord viio in D");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "C#EG";

                if (userQuestion.equalsIgnoreCase("C#EG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("C#EG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }






            // Eb Major

            if (randomNumber == 21) {
                System.out.println("Spell the notes for Chord I in Eb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EbGBb";

                if (userQuestion.equalsIgnoreCase("EbGBb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("EbGBb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 22) {
                System.out.println("Spell the notes for Chord ii in Eb");
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



            if (randomNumber == 23) {
                System.out.println("Spell the notes for Chord iii in Eb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GBbD";

                if (userQuestion.equalsIgnoreCase("GBbD")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("GBbD").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 24) {
                System.out.println("Spell the notes for Chord IV in Eb");
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



            if (randomNumber == 25) {
                System.out.println("Spell the notes for Chord V in Eb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BbDF";

                if (userQuestion.equalsIgnoreCase("BbDF")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BbDF").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 26) {
                System.out.println("Spell the notes for Chord vi in Eb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEbG";

                if (userQuestion.equalsIgnoreCase("CEbG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("CEbG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 27) {
                System.out.println("Spell the notes for Chord viio in Eb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DFAb";

                if (userQuestion.equalsIgnoreCase("DFAb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("DFAb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            // E Major

            if (randomNumber == 28) {
                System.out.println("Spell the notes for Chord I in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EG#B";

                if (userQuestion.equalsIgnoreCase("EG#B")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("EG#B").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 29) {
                System.out.println("Spell the notes for Chord ii in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "F#AC#";

                if (userQuestion.equalsIgnoreCase("F#AC#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("F#AC#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 30) {
                System.out.println("Spell the notes for Chord iii in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "G#BD#";

                if (userQuestion.equalsIgnoreCase("G#BD#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("G#BD#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 31) {
                System.out.println("Spell the notes for Chord IV in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AC#E";

                if (userQuestion.equalsIgnoreCase("AC#E")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("AC#E").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 32) {
                System.out.println("Spell the notes for Chord V in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BD#F#";

                if (userQuestion.equalsIgnoreCase("BD#F#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BD#F#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 33) {
                System.out.println("Spell the notes for Chord vi in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "C#EG#";

                if (userQuestion.equalsIgnoreCase("C#EG#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("C#EG#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 34) {
                System.out.println("Spell the notes for Chord viio in E");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "D#F#A";

                if (userQuestion.equalsIgnoreCase("D#F#A")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("D#F#A").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            // F Major

            if (randomNumber == 35) {
                System.out.println("Spell the notes for Chord I in F");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "FAC";

                if (userQuestion.equalsIgnoreCase("FAC")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("FAC").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 36) {
                System.out.println("Spell the notes for Chord ii in F");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GBbD";

                if (userQuestion.equalsIgnoreCase("GBbD")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("GBbD").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 37) {
                System.out.println("Spell the notes for Chord iii in F");
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



            if (randomNumber == 38) {
                System.out.println("Spell the notes for Chord IV in F");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BbDF";

                if (userQuestion.equalsIgnoreCase("BbDF")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BbDF").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 39) {
                System.out.println("Spell the notes for Chord V in F");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEG";

                if (userQuestion.equalsIgnoreCase("CEG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("CEG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 40) {
                System.out.println("Spell the notes for Chord vi in F");
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



            if (randomNumber == 41) {
                System.out.println("Spell the notes for Chord viio in F");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EGBb";

                if (userQuestion.equalsIgnoreCase("EGBb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("EGBb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }








            // Gb Major

            if (randomNumber == 42) {
                System.out.println("Spell the notes for Chord I in Gb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GbBbDb";

                if (userQuestion.equalsIgnoreCase("GbBbDb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("GbBbDb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 43) {
                System.out.println("Spell the notes for Chord ii in Gb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AbCbEb";

                if (userQuestion.equalsIgnoreCase("AbCbEb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("AbCbEb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 44) {
                System.out.println("Spell the notes for Chord iii in Gb");
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



            if (randomNumber == 45) {
                System.out.println("Spell the notes for Chord IV in Gb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CbEbGb";

                if (userQuestion.equalsIgnoreCase("CbEbGb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("CbEbGb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 46) {
                System.out.println("Spell the notes for Chord V in Gb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DbFAb";

                if (userQuestion.equalsIgnoreCase("DbFAb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("DbFAb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 47) {
                System.out.println("Spell the notes for Chord vi in Gb");
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



            if (randomNumber == 48) {
                System.out.println("Spell the notes for Chord viio in Gb");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "FAbCb";

                if (userQuestion.equalsIgnoreCase("FAbCb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("FAbCb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }





            // G Major

            if (randomNumber == 49) {
                System.out.println("Spell the notes for Chord I in G");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GBD";

                if (userQuestion.equalsIgnoreCase("GBD")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("GBD").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 50) {
                System.out.println("Spell the notes for Chord ii in G");
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



            if (randomNumber == 51) {
                System.out.println("Spell the notes for Chord iii in G");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BDF#";

                if (userQuestion.equalsIgnoreCase("BDF#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BDF#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 52) {
                System.out.println("Spell the notes for Chord IV in G");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEG";

                if (userQuestion.equalsIgnoreCase("CEG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("CEG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 53) {
                System.out.println("Spell the notes for Chord V in G");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DF#A";

                if (userQuestion.equalsIgnoreCase("DF#A")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("DF#A").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 54) {
                System.out.println("Spell the notes for Chord vi in G");
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



            if (randomNumber == 55) {
                System.out.println("Spell the notes for Chord viio in G");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "F#AC";

                if (userQuestion.equalsIgnoreCase("F#AC")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("F#AC").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }





            // Ab Major

            if (randomNumber == 56) {
                System.out.println("Spell the notes for Chord I in Ab");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AbCEb";

                if (userQuestion.equalsIgnoreCase("AbCEb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("AbCEb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 57) {
                System.out.println("Spell the notes for Chord ii in Ab");
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



            if (randomNumber == 58) {
                System.out.println("Spell the notes for Chord iii in Ab");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "CEbG";

                if (userQuestion.equalsIgnoreCase("CEbG")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("CEbG").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 59) {
                System.out.println("Spell the notes for Chord IV in Ab");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DbFAb";

                if (userQuestion.equalsIgnoreCase("DbFAb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("DbFAb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 60) {
                System.out.println("Spell the notes for Chord V in Ab");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EbGBb";

                if (userQuestion.equalsIgnoreCase("EbGBb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("EbGBb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 61) {
                System.out.println("Spell the notes for Chord vi in Ab");
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



            if (randomNumber == 62) {
                System.out.println("Spell the notes for Chord viio in Ab");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "GBbDb";

                if (userQuestion.equalsIgnoreCase("GBbDb")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("GBbDb").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }




            // A Major

            if (randomNumber ==  63) {
                System.out.println("Spell the notes for Chord I in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "AC#E";

                if (userQuestion.equalsIgnoreCase("AC#E")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("AC#E").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 64) {
                System.out.println("Spell the notes for Chord ii in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BDF#";

                if (userQuestion.equalsIgnoreCase("BDF#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("BDF#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 65) {
                System.out.println("Spell the notes for Chord iii in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "C#EG#";

                if (userQuestion.equalsIgnoreCase("C#EG#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("C#EG#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 66) {
                System.out.println("Spell the notes for Chord IV in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "DF#A";

                if (userQuestion.equalsIgnoreCase("DF#A")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("DF#A").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 67) {
                System.out.println("Spell the notes for Chord V in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EG#B";

                if (userQuestion.equalsIgnoreCase("EG#B")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("EG#B").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 68) {
                System.out.println("Spell the notes for Chord vi in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "F#AC#";

                if (userQuestion.equalsIgnoreCase("F#AC#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("F#AC#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 69) {
                System.out.println("Spell the notes for Chord viio in A");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "G#BD";

                if (userQuestion.equalsIgnoreCase("G#BD")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("G#BD").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            // Bb Major

            if (randomNumber == 70) {
                System.out.println("Spell the notes for Chord I in Bb");
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



            if (randomNumber == 71) {
                System.out.println("Spell the notes for Chord ii in Bb");
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



            if (randomNumber == 72) {
                System.out.println("Spell the notes for Chord iii in Bb");
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



            if (randomNumber == 73) {
                System.out.println("Spell the notes for Chord IV in Bb");
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



            if (randomNumber == 74) {
                System.out.println("Spell the notes for Chord V in Bb");
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



            if (randomNumber == 75) {
                System.out.println("Spell the notes for Chord vi in Bb");
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



            if (randomNumber == 76) {
                System.out.println("Spell the notes for Chord viio in Bb");
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






            // B Major

            if (randomNumber == 77) {
                System.out.println("Spell the notes for Chord I in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "BD#F#";

                if (userQuestion.equalsIgnoreCase("BD#F#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")) {
                        soundFilesMap.get("BD#F#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 78) {
                System.out.println("Spell the notes for Chord ii in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "C#EG#";

                if (userQuestion.equalsIgnoreCase("C#EG#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("C#EG#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 79) {
                System.out.println("Spell the notes for Chord iii in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "D#F#A#";

                if (userQuestion.equalsIgnoreCase("D#F#A#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("D#F#A#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 80) {
                System.out.println("Spell the notes for Chord IV in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "EG#B";

                if (userQuestion.equalsIgnoreCase("EG#B")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("EG#B").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 81) {
                System.out.println("Spell the notes for Chord V in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "F#A#C#";

                if (userQuestion.equalsIgnoreCase("F#A#C#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("F#A#C#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 82) {
                System.out.println("Spell the notes for Chord vi in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "G#BD#";

                if (userQuestion.equalsIgnoreCase("G#BD#")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        soundFilesMap.get("G#BD#").play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    playRandomWrongTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));
                }
            }



            if (randomNumber == 83) {
                System.out.println("Spell the notes for Chord viio in B");
                String userQuestion = scanner.nextLine();
                String correctAnswer = "A#C#E";

                if (userQuestion.equalsIgnoreCase("A#C#E")) {
                    System.out.println("Correct!");
                    playRandomCorrectTracks(soundFilesMap);
                    logger.write2(choice, userQuestion, correctAnswer, dateTimeFormatter.format(LocalDateTime.now()));

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        soundFilesMap.get("A#C#E").play();
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

    private static int[] getQuestionRangeFromKey(String choice) {

        switch (choice.split(" ")[0]) {
            case "C": return new int[] {0, 6};
            case "Db": return new int[] {7, 13};
            case "D": return new int[] {14, 20};
            case "Eb": return new int[] {21, 27};
            case "E": return new int[] {28, 34};
            case "F": return new int[] {35, 41};
            case "Gb": return new int[] {42, 48};
            case "G": return new int[] {49, 55};
            case "Ab": return new int[] {56, 62};
            case "A": return new int[] {63, 69};
            case "Bb": return new int[] {70, 76};
            case "B": return new int[] {77, 83};
        }
            return new int[] {0, 84};
    }


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


