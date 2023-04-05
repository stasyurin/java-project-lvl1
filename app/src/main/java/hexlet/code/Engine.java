package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Constants.*;

public final class Engine {

    public static void startGame(String rules, String[][] questionsRightAnswers, String clientName) {
        System.out.println(rules);
        String[] questions = questionsRightAnswers[QUESTIONS_ID];
        String[] rightAnswers = questionsRightAnswers[RIGHT_ANSWERS_ID];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var clientAnswer = in.nextLine();
            if (clientAnswer.equals(rightAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + clientAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + rightAnswers[i] + "'");
                System.out.println("Let's try again, " + clientName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + clientName + "!");
    }
}
