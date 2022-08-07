package hexlet.code.games;

import hexlet.code.Cli;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Calc {
    static final int POINTS_TO_WIN = 3;
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 10;
    static final int NO_OF_OPERATIONS = 3;

    public static void startGame(Cli cli) {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var operand1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            var operand2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
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
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var answer = in.nextLine();
            if (answer.equals(Integer.toString(rightAnswer))) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }
}
