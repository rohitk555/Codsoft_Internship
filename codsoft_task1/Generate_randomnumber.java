package codsoft_task1;
import java.util.Random;
import java.util.Scanner;

public class Generate_randomnumber
{
    
    public static int playGame() {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 7;
        int attemptsTaken = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (attempts > 0) {
            System.out.print("Enter your guess (1 to 100): ");
            int guess = scanner.nextInt();
            attemptsTaken++;
            attempts--;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Attempts remaining: " + attempts);
            } else {
                System.out.println("Your guess is too high. Attempts remaining: " + attempts);
            }
        }
        
        if (attempts == 0 && numberToGuess != attemptsTaken) {
            System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess + ".");
        }
        
        return numberToGuess == attemptsTaken ? attemptsTaken : -1;
    }

    public static void main(String[] args) {
        int rounds = 1;
        int totalScore = 0;
        String playAgain = "yes";
        Scanner scanner = new Scanner(System.in);

        while (playAgain.equalsIgnoreCase("yes")) {
            System.out.println("\n### Round " + rounds + " ###");
            int attemptsTaken = playGame();

            if (attemptsTaken != -1) {
                totalScore += attemptsTaken;
                System.out.println("You guessed the number in " + attemptsTaken + " attempts.");
            } else {
                System.out.println("No score for this round.");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            rounds++;
        }

        System.out.println("\nGame over! Your total score over " + (rounds - 1) + " rounds is: " + totalScore);
    }
}



