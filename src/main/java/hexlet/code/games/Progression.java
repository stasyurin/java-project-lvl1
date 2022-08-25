package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.LOWER_RANDOM_BOUND;
import static hexlet.code.Constants.UPPER_RANDOM_BOUND;
import static hexlet.code.Constants.RULES_ID;
import static hexlet.code.Constants.QUESTION_ID;
import static hexlet.code.Constants.ANSWER_ID;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;

    public static void gameInfo(String[] gameInfo) {
        gameInfo[RULES_ID] = rules();
        var progression = generateProgression();
        var missNumberIndex = RandomUtils.nextInt(1, progression.length - 1);
        var question = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == missNumberIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]);
                question.append(" ");
            }
        }
        gameInfo[QUESTION_ID] = question.toString();
        var answer = Integer.toString(progression[missNumberIndex]);
        gameInfo[ANSWER_ID] = answer;
    }
    static String rules() {
        return "What number is missing in the progression?";
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
