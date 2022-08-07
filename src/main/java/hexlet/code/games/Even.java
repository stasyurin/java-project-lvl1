package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void fillIteration(Engine engine) {
        var question = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);
        engine.setQuestion(Integer.toString(question));
        engine.setRightAnswer(isEven(question) ? "yes" : "no");
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
