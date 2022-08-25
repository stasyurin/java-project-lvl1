package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    static final int NO_OF_OPERATIONS = 3;

    public static void gameInfo(String[] gameInfo) {
        String rules = "What is the result of the expression?";
        gameInfo[0] = rules;
        var operand1 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
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
        gameInfo[1] = question;
        gameInfo[2] = Integer.toString(answer);
    }
}
