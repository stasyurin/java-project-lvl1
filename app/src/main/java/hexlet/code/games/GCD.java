package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;
import static hexlet.code.Constants.POINTS_TO_WIN;

public class GCD {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final String RULES = "Find the greatest common divisor of given numbers.";
    public static void startGame(String userName) {
        var rules = rules();
        String[][] questionsAnswers = new String[2][POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            String[] questionAnswer = questionAnswer();
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(rules, questionsAnswers, userName);
    }
    static String rules() {
        return RULES;
    }
    static String[] questionAnswer() {
        var num1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
        var num2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        var question = num1 + " " + num2;
        var answer = Integer.toString(gcd(num1, num2));

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
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
