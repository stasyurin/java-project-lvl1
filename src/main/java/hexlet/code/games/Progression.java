package hexlet.code.games;

import hexlet.code.Constants;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.GAME_INFO_RULES_ID;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;

    public static void gameInfo(String[] gameInfo) {
        gameInfo[GAME_INFO_RULES_ID] = rules();
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
        gameInfo[1] = question.toString();
        var answer = Integer.toString(progression[missNumberIndex]);
        gameInfo[2] = answer;
    }
    static String rules() {
        return "What number is missing in the progression?";
    }
    static int[] generateProgression() {
        var progression = new int[PROGRESSION_LENGTH];
        var step = RandomUtils.nextInt(LOWER_STEP_BOUND, UPPER_STEP_BOUND);
        var startNumber = RandomUtils.nextInt(Constants.LOWER_RANDOM_BOUND, Constants.UPPER_RANDOM_BOUND);

        for (int i = 0; i < progression.length; i++) {
            progression[i] = startNumber + step * i;
        }

        return progression;
    }
}
