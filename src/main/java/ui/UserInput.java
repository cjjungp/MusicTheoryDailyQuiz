package ui;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String chooseYourKeySignature(){
        System.out.println("Choose your KEY SIGNATURE");
        System.out.println();
        System.out.println("Press 'C', 'D', 'E', 'F', 'G', 'A', or 'B'");

        String selectedOption = scanner.nextLine().toLowerCase();
        String option = selectedOption.trim();

        if (option.equals("c")){
            return "C major";
        }

        else if (option.equals("d")){
            return "D major";
        }

        else if (option.equals("e")){
            return "E major";
        }

        else if (option.equals("f")){
            return "F major";
        }

        else if (option.equals("g")){
            return "G major";
        }

        else if (option.equals("a")){
            return "A major";
        }

        else if (option.equals("b")){
            return "B major";
        }

        else
        {
            return "";
        }
    }




//    public static String randomizeQuestions (){
//
//    }

}
