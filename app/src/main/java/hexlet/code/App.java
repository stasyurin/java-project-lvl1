package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.QUESTIONS_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.RIGHT_ANSWERS_ID;

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
        switch (noOfGame) {
            case "2" -> {
                rules = Even.rules();
            }
            case "3" -> {
                rules = Calc.rules();
            }
            case "4" -> {
                rules = GCD.rules();
            }
            case "5" -> {
                rules = Progression.rules();
            }
            default -> {
                rules = Prime.rules();
            }
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            String[] questionAnswer;
            switch (noOfGame) {
                case "2" -> {
                    questionAnswer = Even.questionAnswer();
                }
                case "3" -> {
                    questionAnswer = Calc.questionAnswer();
                }
                case "4" -> {
                    questionAnswer = GCD.questionAnswer();
                }
                case "5" -> {
                    questionAnswer = Progression.questionAnswer();
                }
                default -> {
                    questionAnswer = Prime.questionAnswer();
                }
            }
            questionsRightAnswers[QUESTIONS_ID][i] = questionAnswer[QUESTION_ID];
            questionsRightAnswers[RIGHT_ANSWERS_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(rules, questionsRightAnswers, clientName);
    }

}
