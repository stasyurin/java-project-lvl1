package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;

public class Calc {
    static final int NO_OF_OPERATIONS = 3;
    public static void startGame(String clientName) {
        var rules = rules();
        String[][] questionsAnswers = new String[2][POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            String[] questionAnswer = questionAnswer();
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(rules, questionsAnswers, clientName);
    }
    static String rules() {
        return "What is the result of the expression?";
    }
    static String[] questionAnswer() {
        var operation = RandomUtils.nextInt(0, NO_OF_OPERATIONS);
        var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        int operationResult;
        String operationResultRepresentation;
        switch (operation) {
            default -> {
                operationResult = operand1 + operand2;
                operationResultRepresentation = operand1 + " + " + operand2;
            }
            case 1 -> {
                operationResult = operand1 - operand2;
                operationResultRepresentation = operand1 + " - " + operand2;
            }
            case 2 -> {
                operationResult = operand1 * operand2;
                operationResultRepresentation = operand1 + " * " + operand2;
            }
        }

        var question = operationResultRepresentation;
        var answer = Integer.toString(operationResult);

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
}
