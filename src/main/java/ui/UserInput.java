package ui;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String chooseYourKeySignature(){
        System.out.println("Choose your KEY SIGNATURE");
        System.out.println();
        System.out.println("Press 'C', 'Db', 'D', 'Eb', 'E', 'F', 'Gb', 'G', 'Ab', 'A', 'Bb', or 'B'");

        String selectedOption = scanner.nextLine().toLowerCase();
        String option = selectedOption.trim();

        if (option.equals("c")){
            return "C major";
        }

        else if (option.equals("db")){
            return "Db major";
        }

        else if (option.equals("d")){
            return  "D major";
        }

        else if (option.equals("eb")){
            return "Eb major";
        }

        else if (option.equals("e")){
            return "E major";
        }

        else if (option.equals("f")){
            return "F major";
        }

        else if (option.equals("gb")){
            return "Gb major";
        }

        else if (option.equals("g")){
            return "G major";
        }

        else if (option.equals("ab")){
            return "Ab major";
        }

        else if (option.equals("a")){
            return "A major";
        }

        else if (option.equals("bb")){
            return "Bb major";
        }

        else if (option.equals("b")){
            return "B major";
        }

        else
        {
            return "";
        }
    }
}
