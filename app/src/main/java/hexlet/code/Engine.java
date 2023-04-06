package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.QUESTION_ID;

public final class Engine {

    public static void startGame(String rules, String[][] questionsAnswers, String clientName) {
        System.out.println(rules);
        String[] questions = questionsAnswers[QUESTION_ID];
        String[] answers = questionsAnswers[ANSWER_ID];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var userAnswer = in.nextLine();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + answers[i] + "'");
                System.out.println("Let's try again, " + clientName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + clientName + "!");
    }
}
