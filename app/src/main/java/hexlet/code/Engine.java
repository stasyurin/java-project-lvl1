package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.QUESTION_ID;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void startGame(String rules, String[][] questionsAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        var userName = in.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rules);
        String[] questions = questionsAnswers[QUESTION_ID];
        String[] answers = questionsAnswers[ANSWER_ID];
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            var userAnswer = in.nextLine();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + answers[i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
