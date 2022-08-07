package hexlet.code;

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
        if ("3".equals(noOfGame)) {
            gameName = GameName.Calc;
        } else {
            gameName = GameName.Even;
        }
        Engine engine = new Engine();
        engine.startGame(gameName, cli);
    }
}
