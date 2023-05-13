//package models;
//
//import java.util.Map;
//import java.util.Random;
//import java.util.Scanner;
//
//public class QuizGenerator {
//
//
//    public static void playCMajor (Map<String, Chord> soundFilesMap) {
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
//                if (userQuestion.equalsIgnoreCase("y")) {
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
//                if (userQuestion.equalsIgnoreCase("y")) {
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
//                if (userQuestion.equalsIgnoreCase("y")) {
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
//                if (userQuestion.equalsIgnoreCase("y")) {
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
//                if (userQuestion.equalsIgnoreCase("y")) {
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
//                if (userQuestion.equalsIgnoreCase("Y")) {
//                    soundFilesMap.get("BDF").play();
//                }
//
//            } else {
//                System.out.println("Incorrect!");
//                playRandomWrongTracks(soundFilesMap);
//            }
//        }
//
//    }}
