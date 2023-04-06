package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.QUESTIONS_ID;
import static hexlet.code.Constants.RIGHT_ANSWERS_ID;

public class Calc {
    static final int NO_OF_OPERATIONS = 3;
    public static String rules() {
        return "What is the result of the expression?";
    }
    public static String[][] questionsRightAnswers() {
        var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operation = RandomUtils.nextInt(0, NO_OF_OPERATIONS);
        String[] questions = new String[POINTS_TO_WIN];
        String[] rightAnswers = new String[POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            int answer;
            String question;
            switch (operation) {
                default -> {
                    answer = operand1 + operand2;
                    question = operand1 + " + " + operand2;
                }
                case 1 -> {
                    answer = operand1 - operand2;
                    question = operand1 + " - " + operand2;
                }
                case 2 -> {
                    answer = operand1 * operand2;
                    question = operand1 + " * " + operand2;
                }
            }
            questions[i] = question;
            rightAnswers[i] = Integer.toString(answer);
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        questionsRightAnswers[QUESTIONS_ID] = questions;
        questionsRightAnswers[RIGHT_ANSWERS_ID] = rightAnswers;
        return questionsRightAnswers;
    }
}
