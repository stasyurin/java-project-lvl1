package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.QUESTION_ID;

public class Games {
    public static void startGame(String noOfGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        var clientName = in.nextLine();
        System.out.println("Hello, " + clientName + "!");

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
        Engine.startGame(rules, questionsAnswers, clientName);
    }
}
