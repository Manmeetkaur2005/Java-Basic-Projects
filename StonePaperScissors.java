import java.util.Scanner;
import java.util.Random;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Stone Paper Scissors Game!");
        System.out.println("Enter your move (stone, paper, scissors): ");
        String userMove = sc.nextLine().toLowerCase();

        // Generate computer's move
        String[] options = {"stone", "paper", "scissors"};
        String computerMove = options[rand.nextInt(3)];

        System.out.println("Computer chose: " + computerMove);

        if (userMove.equals(computerMove)) {
            System.out.println("It's a draw!");
        } else if (
            (userMove.equals("stone") && computerMove.equals("scissors")) ||
            (userMove.equals("paper") && computerMove.equals("stone")) ||
            (userMove.equals("scissors") && computerMove.equals("paper"))
        ) {
            System.out.println("You win!");
        } else if (
            (userMove.equals("stone") || userMove.equals("paper") || userMove.equals("scissors"))
        ) {
            System.out.println("You lose!");
        } else {
            System.out.println("Invalid input. Please enter stone, paper, or scissors.");
        }

        sc.close();
    }
}
