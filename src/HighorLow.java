import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Computer picks a number from 1 to 10 inclusive
        int secret = rand.nextInt(10) + 1;

        int guess;

        // Bulletproof the guess: must be an int from 1 to 10
        do {
            System.out.print("Guess a number from 1 to 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Invalid input: guess must be between 1 and 10.");
                    guess = -1;
                }
            } else {
                System.out.println("Invalid input: \"" + in.next() + "\" is not a whole number.");
                guess = -1;
            }
        } while (guess < 1 || guess > 10);

        System.out.println("The number was: " + secret);

        if (guess > secret) {
            System.out.println("Your guess was too high.");
        } else if (guess < secret) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("You guessed it. On the money!");
        }

        in.close();
    }
}