import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 */
public class Magic8Ball {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        if (play) {

            System.out.println("Please enter a question");
            String userQuestion = scanner.nextLine();

            int randomNumber = new Random().nextInt(4);


            if (randomNumber == 0) {
                System.out.println("YES");
            }

            if (randomNumber == 1) {
                System.out.println("NO");
            }

            if (randomNumber == 2) {
                System.out.println("YOU ARE CLOSE");
            }

            if (randomNumber == 3) {
                System.out.println("BETTER LUCK NEXT TIME");
            }

        }
    }
}



    // 1. Make a main method that includes all the steps below


        // 2. Get the user to enter a question for the magic 8-ball to answer
        //    Scanner scanner = new Scanner(System.in);
        //    String userQuestion = scanner.nextLine();




        // 3. Make a variable and initialize it to a random number.
        //
        //    // Get random a number from: [0, 1, 2, 3]
        //    int randNumber = new Random().nextInt(4);



        // 4. If the random number is 0

        // Tell the user "Yes"


        // 5. If the random number is 1

        // Tell the user "No"




            // 6. If the random number is 2

            // Tell the user a custom response



                // 7. If the random number is 3

                // Tell the user a custom response
