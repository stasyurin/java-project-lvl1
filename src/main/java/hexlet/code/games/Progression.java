package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;

    public static void fillIteration(Engine engine) {
        var progression = generateProgression();
        fillQuestionAndRightAnswer(engine, progression);
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

    static void fillQuestionAndRightAnswer(Engine engine, int[] progression) {
        var question = new StringBuilder();
        var missNumberIndex = RandomUtils.nextInt(1, progression.length - 1);

        for (int i = 0; i < progression.length; i++) {
            if (i == missNumberIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]);
                question.append(" ");
            }
        }

        engine.setQuestion(question.toString());
        engine.setRightAnswer(Integer.toString(progression[missNumberIndex]));
    }
}
