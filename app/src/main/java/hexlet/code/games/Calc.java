package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;
import static hexlet.code.Constants.POINTS_TO_WIN;

public class Calc {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final String RULES = "What is the result of the expression?";
    static final String[] OPERATORS = {"+", "-", "*"};
    public static void startGame(String userName) {
        var rules = rules();
        String[][] questionsAnswers = new String[2][POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            String[] questionAnswer = questionAnswer();
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(rules, questionsAnswers, userName);
    }
    static String rules() {
        return RULES;
    }
    static String[] questionAnswer() {
        var operatorIndex = RandomUtils.nextInt(0, OPERATORS.length - 1);
        var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        int operationResult;
        switch (operatorIndex) {
            case 0 -> {
                operationResult = operand1 + operand2;
            }
            case 1 -> {
                operationResult = operand1 - operand2;
            }
            case 2 -> {
                operationResult = operand1 * operand2;
            }
            default -> {
                throw new RuntimeException("Unknown operator index: " + operatorIndex);
            }
        }

        var question = operand1 + " " + OPERATORS[operatorIndex] + " " + operand2;
        var answer = Integer.toString(operationResult);

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
}
