package hexlet.code.games;

import hexlet.code.Cli;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Even {
    static final int POINTS_TO_WIN = 3;
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 100;

    public static void startGame(Cli cli) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var answer = in.nextLine();
            var questionIsEven = isEven(question);
            if (questionIsEven && answer.equals("yes") || !questionIsEven && answer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
