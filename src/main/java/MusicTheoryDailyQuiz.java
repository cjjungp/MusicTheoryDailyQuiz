import SoundFiles.*;
import ui.UserInput;
import ui.UserOutput;

import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class MusicTheoryDailyQuiz {

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");

    public static void main(String[] args) {

        boolean isExit = false;

        while (!isExit) {
            Scanner scanner = new Scanner(System.in);
            boolean play = true;
            UserOutput.openingGraphics();

            String choice = UserInput.chooseYourKeySignature();
            System.out.println(choice);


            switch (choice) {
                case "C major":
                    System.out.println("You are now in C major");
                    System.out.println();
                    break;
                case "D major":
                    System.out.println("You are now in D major");
                    System.out.println();
                    break;
                case "E major":
                    System.out.println("You are now in E major");
                    System.out.println();
                    break;
                case "F major":
                    System.out.println("You are now in F major");
                    System.out.println();
                    break;
                case "G major":
                    System.out.println("You are now in G major");
                    System.out.println();
                    break;
                case "A major":
                    System.out.println("You are now in A major");
                    System.out.println();
                    break;
                case "B major":
                    System.out.println("You are now in B major");
                    System.out.println();
                    break;
                case "":
                    isExit = true;
                    break;
            }

            if (isExit){
                break;
            }



            // Randomize question

            int randomNumber = new Random().nextInt(7);

            if (randomNumber == 0) {
                System.out.println("Spell the notes for Chord I");
                String userQuestion = scanner.nextLine();


                if (userQuestion.equalsIgnoreCase("CEG")) {
                    System.out.println("Correct!");

                    Correct.play();
//                    playSound("Correct");
//                    logger.write(dateTimeFormatter.format(LocalDateTime.now());

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();


                    if (userQuestion.equalsIgnoreCase("y")) {
                        C_I.play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();}

            }



            if (randomNumber == 1) {
                System.out.println("Spell the notes for Chord ii");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("DFA")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        C_ii.play();
                    }


                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }
            }

            if (randomNumber == 2) {
                System.out.println("Spell the notes for Chord iii");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("EGB")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        C_iii.play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }
            }

            if (randomNumber == 3) {
                System.out.println("Spell the notes for Chord IV");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("FAC")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        C_IV.play();
                    }

                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }
            }

            if (randomNumber == 4) {
                System.out.println("Spell the notes for Chord V");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("GBD")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        C_V.play();
                    }


                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }
            }

            if (randomNumber == 5) {
                System.out.println("Spell the notes for Chord vi");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("ACE")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("y")){
                        C_vi.play();
                    }


                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }
            }

            if (randomNumber == 6) {
                System.out.println("Spell the notes for Chord viio");
                String userQuestion = scanner.nextLine();

                if (userQuestion.equalsIgnoreCase("BDF")) {
                    System.out.println("Correct!");
                    Correct.play();
//                    playSound("Correct");

                    System.out.println("Would you like to hear the chord?");
                    System.out.println("Press (Y)es or (N)o");
                    userQuestion = scanner.nextLine();

                    if (userQuestion.equalsIgnoreCase("Y")){
                        C_viio.play();
                    }


                } else {
                    System.out.println("Incorrect!");
                    Wrong.play();
                }










            }

        }
        UserOutput.closingGraphics();
    }

//    public static void playSound(String choice) {
//        new SoundPlayer("C:\\Users\\Student\\workspace\\side-projects\\MusicTheoryDailyQuiz\\" + choice + ".wav").play();
//    }
}


