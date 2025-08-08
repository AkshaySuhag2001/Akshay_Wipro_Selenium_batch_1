//Abstraction
package wipro_train;
import java.util.Scanner;

abstract class GameFramework {
    public abstract void startGame();
    public abstract void playGame();
    public abstract void endGame();
    public void runGame() {
        startGame();
        playGame();
        endGame();
    }
}

// Concrete class: Cricket Game
class CricketGame extends GameFramework {
    public void startGame() {
        System.out.println("Cricket Game is about to start.");
    }

    public void playGame() {
        System.out.println("Cricket Game is in progress...");
    }

    public void endGame() {
        System.out.println("Cricket Game has ended.");
    }
}

// Concrete class: Football Game
class FootballGame extends GameFramework {
    public void startGame() {
        System.out.println("Football Game is about to start.");
    }

    public void playGame() {
        System.out.println("Football Game is in progress...");
    }

    public void endGame() {
        System.out.println("Football Game has ended.");
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a game to play:");
        System.out.println("1. Cricket");
        System.out.println("2. Football");
        int choice = sc.nextInt();

        GameFramework game;

        if (choice == 1) {
            game = new CricketGame();
        } else if (choice == 2) {
            game = new FootballGame();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        game.runGame();
    }
}
