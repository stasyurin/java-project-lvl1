package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;

public class Even {
    public static void gameInfo(String[] gameInfo) {
        gameInfo[RULES_ID] = rules();
        var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        gameInfo[1] = Integer.toString(question);
        var answer = isEven(question) ? "yes" : "no";
        gameInfo[2] = answer;
    }
    static String rules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
