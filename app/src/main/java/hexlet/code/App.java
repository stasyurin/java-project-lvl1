package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
        } else if (noOfGame.equals("1")) {
            Cli.greet();
            return;
        }

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var userName = in.nextLine();
        System.out.println("Hello, " + userName + "!");

        switch (noOfGame) {
            case "2" -> {
                Even.startGame(userName);
            }
            case "3" -> {
                Calc.startGame(userName);
            }
            case "4" -> {
                GCD.startGame(userName);
            }
            case "5" -> {
                Progression.startGame(userName);
            }
            case "6" -> {
                Prime.startGame(userName);
            }
            default -> {
                throw new RuntimeException("Unknown game number input: " + noOfGame);
            }
        }
    }
}
