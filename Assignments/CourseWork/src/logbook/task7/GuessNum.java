package logbook.task7;
import java.util.Scanner;
import java.util.Random;


public class GuessNum {

    static void generateRandomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Guess Number Game!");

        // Prompt user to guess the number
        while (true) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        generateRandomNumber();;
    }


}
