package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class GCD {
    public static void fillIteration(Engine engine) {
        var num1 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        var num2 = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        engine.setQuestion(num1 + " " + num2);
        var rightAnswer = gcd(num1, num2);
        engine.setRightAnswer(Integer.toString(rightAnswer));
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
