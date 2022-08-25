package hexlet.code.games;

import hexlet.code.Constants;
import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void gameInfo(String[] gameInfo) {
        var rules = "Answer 'yes' if number even otherwise answer 'no'.";
        gameInfo[0] = rules;
        var question = RandomUtils.nextInt(Constants.LOWER_RANDOM_BOUND, Constants.UPPER_RANDOM_BOUND);
        gameInfo[1] = Integer.toString(question);
        var answer = isEven(question) ? "yes" : "no";
        gameInfo[2] = answer;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
