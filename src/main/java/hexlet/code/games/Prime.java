package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Prime {
    public static void fillIteration(Engine engine) {
        var question = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        engine.setQuestion(Integer.toString(question));
        engine.setRightAnswer(isPrime(question) ? "yes" : "no");
    }
    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
