package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        var noOfGame = in.nextLine();
        if (noOfGame.equals("0")) {
            return;
        }
        System.out.println();
        Cli.printWelcomeMsg();
        var clientName = Cli.askName();
        Cli.printGreeting(clientName);
        switch (noOfGame) {
            case "2" -> {
                Even.startGame(clientName);
            }
            case "3" -> {
                Calc.startGame(clientName);
            }
            case "4" -> {
                GCD.startGame(clientName);
            }
            case "5" -> {
                Progression.startGame(clientName);
            }
            case "6" -> {
                Prime.startGame(clientName);
            }
            default -> {
                throw new RuntimeException("Unknown game number input: " + noOfGame);
            }
        }
    }

}
