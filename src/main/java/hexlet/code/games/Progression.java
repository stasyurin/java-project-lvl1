package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.*;
import static hexlet.code.Constants.POINTS_TO_WIN;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;
    public static String rules() {
        return "What number is missing in the progression?";
    }
    public static String[][] questionsRightAnswers() {
        String[] questions = new String[POINTS_TO_WIN];
        String[] rightAnswers = new String[POINTS_TO_WIN];
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            var progression = generateProgression();
            var missNumberIndex = RandomUtils.nextInt(1, progression.length - 1);
            var question = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j == missNumberIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]);
                    question.append(" ");
                }
            }
            questions[i] = question.toString();
            var answer = Integer.toString(progression[missNumberIndex]);
            rightAnswers[i] = answer;
        }
        String[][] questionsRightAnswers = new String[2][POINTS_TO_WIN];
        questionsRightAnswers[QUESTIONS_ID] = questions;
        questionsRightAnswers[RIGHT_ANSWERS_ID] = rightAnswers;
        return questionsRightAnswers;
    }
    static int[] generateProgression() {
        var progression = new int[PROGRESSION_LENGTH];
        var step = RandomUtils.nextInt(LOWER_STEP_BOUND, UPPER_STEP_BOUND);
        var startNumber = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        for (int i = 0; i < progression.length; i++) {
            progression[i] = startNumber + step * i;
        }

        return progression;
    }
}
