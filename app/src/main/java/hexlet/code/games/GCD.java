package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.QUESTIONS_ID;
import static hexlet.code.Constants.RIGHT_ANSWERS_ID;

public class GCD {
    public static String rules() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static String[][] questionsRightAnswers() {
        String[] questions = new String[POINTS_TO_WIN];
        String[] rightAnswers = new String[POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var num1 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            var num2 = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            var question = num1 + " " + num2;
            questions[i] = question;
            var answer = gcd(num1, num2);
            rightAnswers[i] = Integer.toString(answer);
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        questionsRightAnswers[QUESTIONS_ID] = questions;
        questionsRightAnswers[RIGHT_ANSWERS_ID] = rightAnswers;
        return questionsRightAnswers;
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
