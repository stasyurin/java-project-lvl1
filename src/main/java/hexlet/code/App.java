package hexlet.code;

import hexlet.code.games.*;

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
        if (noOfGame.equals("1")) {
            return;
        }
        String rules;
        String[][] questionsRightAnswers;
        switch (noOfGame) {
            case "2" -> {
                rules = Even.rules();
                questionsRightAnswers = YesNoGames.questionsRightAnswers("Even");
            }
            case "3" -> {
                rules = Calc.rules();
                questionsRightAnswers = Calc.questionsRightAnswers();
            }
            case "4" -> {
                rules = GCD.rules();
                questionsRightAnswers = GCD.questionsRightAnswers();
            }
            case "5" -> {
                rules = Progression.rules();
                questionsRightAnswers = Progression.questionsRightAnswers();
            }
            default -> {
                rules = Prime.rules();
                questionsRightAnswers = YesNoGames.questionsRightAnswers("Prime");
            }
        }
        Engine.startGame(rules, questionsRightAnswers, clientName);
    }

}
