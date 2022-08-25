package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;

    public static void gameInfo(String[] gameInfo) {
        var rules = "What number is missing in the progression?";
        gameInfo[0] = rules;
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
    static int[] generateProgression() {
        var progression = new int[PROGRESSION_LENGTH];
        var step = RandomUtils.nextInt(LOWER_STEP_BOUND, UPPER_STEP_BOUND);
        var startNumber = RandomUtils.nextInt(Engine.LOWER_RANDOM_BOUND, Engine.UPPER_RANDOM_BOUND);

        for (int i = 0; i < progression.length; i++) {
            progression[i] = startNumber + step * i;
        }

        return progression;
    }
}
