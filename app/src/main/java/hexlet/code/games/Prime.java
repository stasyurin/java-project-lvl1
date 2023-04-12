package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;
import static hexlet.code.Constants.POINTS_TO_WIN;

public class Prime {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame(String userName) {
        String[][] questionsAnswers = new String[2][POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            String[] questionAnswer = questionAnswer();
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(RULES, questionsAnswers, userName);
    }
    static String[] questionAnswer() {
        var randomInt = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        var question = Integer.toString(randomInt);
        var answer = isPrime(randomInt) ? "yes" : "no";

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
    static boolean isPrime(int num) {
        if (num < 2) {
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
