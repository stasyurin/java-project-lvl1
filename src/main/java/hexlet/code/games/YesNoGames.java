package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;
import static hexlet.code.games.Even.isEven;
import static hexlet.code.games.Prime.isPrime;

public class YesNoGames {
    public static String[][] questionsRightAnswers(String gameName) {
        String[] questions = new String[POINTS_TO_WIN];
        String[] rightAnswers = new String[POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var question = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);
            questions[i] = Integer.toString(question);
            String answer;
            if (gameName.equals("Even")) {
                answer = isEven(question) ? "yes" : "no";
            } else {
                answer = isPrime(question) ? "yes" : "no";
            }
            rightAnswers[i] = answer;
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        questionsRightAnswers[QUESTIONS_ID] = questions;
        questionsRightAnswers[RIGHT_ANSWERS_ID] = rightAnswers;
        return questionsRightAnswers;
    }
}
