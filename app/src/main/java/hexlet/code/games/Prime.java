package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;

public class Prime {
    public static String rules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String[] questionAnswer() {
        var randomInt = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        var question = Integer.toString(randomInt);
        var answer = isPrime(randomInt) ? "yes" : "no";

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
