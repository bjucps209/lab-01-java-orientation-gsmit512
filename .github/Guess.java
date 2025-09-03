import java.util.*;

public class Guess {    
    public static void main(String[] args) {
        Random random = new Random();    // Generate secret number
        Scanner scan = new Scanner(System.in);
        int secretNum = random.nextInt(10) + 1;  // Options: 1-10
        int numGuesses = 0;

        System.out.print("Enter your guess: ");
        int guess = Integer.parseInt(scan.nextLine());
        // while (guess != secretNum){

        // }
    }
}