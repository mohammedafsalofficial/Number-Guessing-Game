import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.print("Choose a difficulty. Type 'easy' or 'hard': ");
        String choice = input.next();

        int randomNumber = random.nextInt(1, 101);
        int attempts = (Objects.equals(choice, "easy")) ? 10 : 5;

        System.out.println(randomNumber);
        int i = 0;
        while (attempts > i) {
            System.out.println("You have " + attempts + " attempts remaining to guess the number");
            System.out.print("Make a guess: ");
            int guess = input.nextInt();
            if (guess == randomNumber) {
                System.out.println("You got it! The answer was " + guess);
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low, Guess again.");
                attempts--;
            } else if (guess > randomNumber) {
                System.out.println("Too high, Guess again.");
                attempts--;
            }
        }
    }
}