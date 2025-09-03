import java.util.*;

public class Guess {    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNum = random.nextInt(10) + 1;  // Generate secret number (options: 1-10)
        int numGuesses = 0;
        int guess = 0;

        // Give feedback on guess
        while (guess != secretNum){
            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(scan.nextLine());
            if (guess < secretNum){
                System.out.println("Your guess is too low.");
                numGuesses += 1;
            } else if (guess > secretNum){
                System.out.println("Your guess is too high.");
                numGuesses += 1;
            } else {
                System.out.println("You got it!!");
            }
        }
        System.out.println("It took you " + (numGuesses + 1) + " guesses.");
        scan.close();
    }
}