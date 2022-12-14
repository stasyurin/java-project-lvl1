package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;

public class Calc {
    static final int NO_OF_OPERATIONS = 3;

    public static void gameInfo(String[] gameInfo) {
        gameInfo[RULES_ID] = rules();
        var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operation = RandomUtils.nextInt(0, NO_OF_OPERATIONS);
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
        gameInfo[QUESTION_ID] = question;
        gameInfo[ANSWER_ID] = Integer.toString(answer);
    }
    static String rules() {
        return "What is the result of the expression?";
    }
}
