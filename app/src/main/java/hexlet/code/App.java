package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Constants.*;
import static hexlet.code.Constants.ANSWER_ID;

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
            case "6" -> {
                rules = Prime.rules();
            }
            default -> {
                throw new RuntimeException("Unknown game number: " + noOfGame);
            }
        }
        String[][] questionsAnswers = new String[2][POINTS_TO_WIN];
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
                case "6" -> {
                    questionAnswer = Prime.questionAnswer();
                }
                default -> {
                    throw new RuntimeException("Unknown game number: " + noOfGame);
                }
            }
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(rules, questionsAnswers, userName);
    }
}
