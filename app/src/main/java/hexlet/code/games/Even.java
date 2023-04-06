package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.POINTS_TO_WIN;
import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.QUESTIONS_ID;
import static hexlet.code.Constants.RIGHT_ANSWERS_ID;

public class Even {
    public static String rules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static String[][] questionsRightAnswers() {
        String[] questions = new String[POINTS_TO_WIN];
        String[] rightAnswers = new String[POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            questions[i] = Integer.toString(question);
            String answer = isEven(question) ? "yes" : "no";
            rightAnswers[i] = answer;
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        questionsRightAnswers[QUESTIONS_ID] = questions;
        questionsRightAnswers[RIGHT_ANSWERS_ID] = rightAnswers;
        return questionsRightAnswers;
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
