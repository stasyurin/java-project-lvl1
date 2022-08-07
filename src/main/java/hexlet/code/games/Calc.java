package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Calc {
    static final int NO_OF_OPERATIONS = 3;

    public static void fillIteration(Engine engine) {
        var operand1 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        var operand2 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        var operation = RandomUtils.nextInt(0, NO_OF_OPERATIONS);
        int rightAnswer;
        String question;
        switch (operation) {
            default -> {
                rightAnswer = operand1 + operand2;
                question = operand1 + " + " + operand2;
            }
            case 1 -> {
                rightAnswer = operand1 - operand2;
                question = operand1 + " - " + operand2;
            }
            case 2 -> {
                rightAnswer = operand1 * operand2;
                question = operand1 + " * " + operand2;
            }
        }
        engine.setQuestion(question);
        engine.setRightAnswer(Integer.toString(rightAnswer));
    }
}
