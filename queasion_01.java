import java.util.Random;
import java.util.Scanner;
 class Game {
    private int number;
    private int noOfGuesses;
    private int inputNumber;

    // Getter
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1; // 1 to 100
    }

    // Take user input
    public int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        inputNumber = sc.nextInt();
        return inputNumber;
    }

    // Check the number
    public boolean isCorrectNumber(int num) {
        noOfGuesses++;
        if (num == number) {
            System.out.println(" You guessed it right in " + noOfGuesses + " tries!");
            return true;
        } else if (num < number) {
            System.out.println("Too low...");
        } else {
            System.out.println("Too high...");
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        Game g = new Game();
        boolean correct = false;
        System.out.println("Guess the number between 1 and 100!");

        while (!correct) {
            int userGuess = g.takeInput();
            correct = g.isCorrectNumber(userGuess);
        }
    }
}
