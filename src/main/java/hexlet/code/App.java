package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.YesNoGames;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int GAME_INFO_LENGTH = 3;

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
        if (noOfGame.equals("1")) {
            return;
        }
        String[] gameInfo = new String[GAME_INFO_LENGTH];
        switch (noOfGame) {
            case "2" -> YesNoGames.gameInfo(gameInfo, "Even");
            case "3" -> Calc.gameInfo(gameInfo);
            case "4" -> GCD.gameInfo(gameInfo);
            case "5" -> Progression.gameInfo(gameInfo);
            case "6" -> YesNoGames.gameInfo(gameInfo, "Prime");
            default -> {
                return;
            }
        }
        Engine.startGame(gameInfo, clientName);
    }

}
