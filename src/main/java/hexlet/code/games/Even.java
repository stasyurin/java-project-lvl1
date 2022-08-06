package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Even {
    public static void startGame() {
        int pointsToWin = 3;
        for (int i = 0; i < pointsToWin; i++) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
            var question = RandomUtils.nextInt(1, 100);
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
