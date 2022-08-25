package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;

public class Prime {
    public static void gameInfo(String[] gameInfo) {
        gameInfo[RULES_ID] = rules();
        var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        gameInfo[QUESTION_ID] = Integer.toString(question);
        var answer = isPrime(question) ? "yes" : "no";
        gameInfo[ANSWER_ID] = answer;
    }
    static String rules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
