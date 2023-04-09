package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.QUESTION_ID;

public class Even {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String rules() {
        return RULES;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static String[] questionAnswer() {
        var randomInt = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        var question = Integer.toString(randomInt);
        var answer = isEven(randomInt) ? "yes" : "no";

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
}
