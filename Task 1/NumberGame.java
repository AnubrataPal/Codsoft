import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int maxAttempts = 10;
        int score = 0;
        System.out.println("Welcome to the Game!");
        while (true) {
            int number = random.nextInt(max - min + 1) + min;
            int attempts = 0;

            System.out.println("I've selected a number between " + min+ " and " + max + ". Try to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == number) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score=11-attempts;
                    System.out.println("Score:"+score+"/10");
                    break;
                } else if (userGuess < number) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + number);
                    System.out.println("Score:0/10");
                }
            }
        
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Your score is: " + score);
                break;
            }
        }

        scanner.close();
    }
}