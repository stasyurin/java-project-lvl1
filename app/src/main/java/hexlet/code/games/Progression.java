package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.QUESTION_ID;

public class Progression {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;
    public static String rules() {
        return "What number is missing in the progression?";
    }
    public static String[] questionAnswer() {
        var progression = generateProgression();
        var missNumberIndex = RandomUtils.nextInt(1, progression.length - 1);

        var question = generateQuestion(progression, missNumberIndex);
        var answer = Integer.toString(progression[missNumberIndex]);

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
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
    static String generateQuestion(int[] progression, int missNumberIndex) {
        var question = new StringBuilder();
        for (int j = 0; j < progression.length; j++) {
            if (j == missNumberIndex) {
                question.append(".. ");
            } else {
                question.append(progression[j]);
                question.append(" ");
            }
        }
        return question.toString();
    }
}
