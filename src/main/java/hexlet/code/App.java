package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var cli = new Cli();
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
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
        if (noOfGame.equals("3")) {
            gameName = GameName.Calc;
        } else if (noOfGame.equals("4")) {
            gameName = GameName.GCD;
        } else {
            gameName = GameName.Even;
        }
        Engine engine = new Engine();
        engine.startGame(gameName, cli);
    }
}
