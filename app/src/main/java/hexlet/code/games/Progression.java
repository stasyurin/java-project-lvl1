package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Constants.ANSWER_ID;
import static hexlet.code.Constants.QUESTION_ID;

public class Progression {
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 101;
    static final int PROGRESSION_LENGTH = 10;
    static final int LOWER_STEP_BOUND = 1;
    static final int UPPER_STEP_BOUND = 6;
    static final String RULES = "What number is missing in the progression?";
    public static void startGame() {
        String[][] questionsAnswers = new String[2][Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            String[] questionAnswer = questionAnswer();
            questionsAnswers[QUESTION_ID][i] = questionAnswer[QUESTION_ID];
            questionsAnswers[ANSWER_ID][i] = questionAnswer[ANSWER_ID];
        }
        Engine.startGame(RULES, questionsAnswers);
    }
    static String[] questionAnswer() {
        var progression = generateProgression();
        var hiddenMemberIndex = RandomUtils.nextInt(1, progression.length - 1);

        var answer = progression[hiddenMemberIndex];
        var question = generateQuestion(progression, hiddenMemberIndex);

        var questionAnswer = new String[2];
        questionAnswer[QUESTION_ID] = question;
        questionAnswer[ANSWER_ID] = answer;
        return questionAnswer;
    }
    static String[] generateProgression() {
        var step = RandomUtils.nextInt(LOWER_STEP_BOUND, UPPER_STEP_BOUND);
        var first = RandomUtils.nextInt(LOWER_RANDOM_BOUND, UPPER_RANDOM_BOUND);

        return makeProgression(first, step, PROGRESSION_LENGTH);
    }
    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
    static String generateQuestion(String[] progression, int hiddenMemberIndex) {
        progression[hiddenMemberIndex] = "..";
        return String.join(" ", progression);
    }
}
