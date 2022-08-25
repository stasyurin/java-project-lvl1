package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.games.Even.isEven;
import static hexlet.code.games.Prime.isPrime;

public class YesNoGames {
    public static void gameInfo(String[] gameInfo, String gameName) {
        if (gameName.equals("Even")) {
            gameInfo[RULES_ID] = Even.rules();
        } else {
            gameInfo[RULES_ID] = Prime.rules();
        }
        var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        gameInfo[QUESTION_ID] = Integer.toString(question);
        String answer;
        if (gameName.equals("Even")) {
            answer = isEven(question) ? "yes" : "no";
        } else {
            answer = isPrime(question) ? "yes" : "no";
        }
        gameInfo[ANSWER_ID] = answer;
    }
}
