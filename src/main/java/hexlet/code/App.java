package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Game;
import hexlet.code.games.GameName;

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
        if (noOfGame.equals("0")) {
            return;
        }
        System.out.println();
        cli.init();
        if (noOfGame.equals("1")) {
            return;
        }
        GameName gameName;
        switch (noOfGame) {
            default -> gameName = GameName.Even;
            case "3" -> gameName = GameName.Calc;
        }
        Game game = new Game();
        game.startGame(gameName, cli);
    }
}
