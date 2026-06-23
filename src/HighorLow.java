import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();

        int answer = generator.nextInt(10) + 1;

        String trash = "";
        boolean done = false;
        int userInput = 0;

        System.out.println("--- Number Guessing Game Initialized ---");

        do {
            System.out.print("Guess a number 1-10: ");

            if (input.hasNextInt()) {
                userInput = input.nextInt();
                input.nextLine();

                if (userInput >= 1 && userInput <= 10) {
                    done = true;
                } else {
                    System.out.println("Out of Bounds! Your guess must be between 1 and 10. Try again!");
                }
            } else {
                trash = input.nextLine();
                System.out.println("Invalid input: " + trash + ". Please try again");
            }
        } while (!done);

        System.out.println("The number was... " + answer + "!");

        if (userInput > answer) {
            System.out.println("Too High! Better luck next time! ");
        } else if (userInput < answer) {
            System.out.println("Too Low! Better luck next time! ");
        } else
            System.out.println("Right on the money! You win!");
        }

    }