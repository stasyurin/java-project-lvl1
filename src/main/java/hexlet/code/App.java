package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var cli = new Cli();
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        var noOfGame = in.nextLine();
        System.out.println();
        switch (noOfGame) {
            case "1" -> cli.init();
            case "2" -> {
                cli.init();
                Even.startGame(cli);
            }
            case "3" -> {
                cli.init();
                Calc.startGame(cli);
            }
            default -> {
            }
        }
    }
}
