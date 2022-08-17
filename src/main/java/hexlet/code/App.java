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
        cli.init();
        if (noOfGame.equals("1")) {
            return;
        }
        GameName gameName = switch (noOfGame) {
            case "2" -> GameName.Even;
            case "3" -> GameName.Calc;
            case "4" -> GameName.GCD;
            case "5" -> GameName.Progression;
            case "6" -> GameName.Prime;
            default -> null;
        };
        if (gameName != null) {
            Engine engine = new Engine();
            engine.startGame(gameName, cli);
        }
    }
}
