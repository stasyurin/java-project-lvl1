package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;

public class GCD {
    public static void gameInfo(String[] gameInfo) {
        gameInfo[RULES_ID] = rules();
        var num1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var num2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var question = num1 + " " + num2;
        gameInfo[QUESTION_ID] = question;
        var answer = gcd(num1, num2);
        gameInfo[ANSWER_ID] = Integer.toString(answer);
    }
    static String rules() {
        return "Find the greatest common divisor of given numbers.";
    }
    static int gcd(int num1, int num2) {
        int gcd = 1;
        int minNum = Math.min(num1, num2);

        for (int i = 2; i <= minNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
