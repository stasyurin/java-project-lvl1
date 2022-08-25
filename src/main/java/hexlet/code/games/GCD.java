package hexlet.code.games;

import hexlet.code.Constants;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void gameInfo(String[] gameInfo) {
        gameInfo[0] = rules();
        var num1 = RandomUtils.nextInt(Constants.LOWER_RANDOM_BOUND, Constants.UPPER_RANDOM_BOUND);
        var num2 = RandomUtils.nextInt(Constants.LOWER_RANDOM_BOUND, Constants.UPPER_RANDOM_BOUND);
        var question = num1 + " " + num2;
        gameInfo[1] = question;
        var answer = gcd(num1, num2);
        gameInfo[2] = Integer.toString(answer);
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
