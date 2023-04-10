package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;

public class Calc {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final String RULES = "What is the result of the expression?";
    static final String[] OPERATORS = {"+", "-", "*"};
    public static String rules() {
        return RULES;
    }
    public static String[] questionAnswer() {
        var operation = RandomUtils.nextInt(0, OPERATORS.length - 1);
        var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        int operationResult;
        switch (operation) {
            default -> {
                operationResult = operand1 + operand2;
            }
            case 1 -> {
                operationResult = operand1 - operand2;
            }
            case 2 -> {
                operationResult = operand1 * operand2;
            }
        }

        var question = operand1 + " " + OPERATORS[operation] + " " + operand2;
        var answer = Integer.toString(operationResult);

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
}
