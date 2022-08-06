package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Even {
    static final int POINTS_TO_WIN = 3;
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 100;

    public static void startGame() {
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
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
                System.out.println("Let's try again, Bill!");
                break;
            }
        }
        System.out.println("Congratulations, Bill!");
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
