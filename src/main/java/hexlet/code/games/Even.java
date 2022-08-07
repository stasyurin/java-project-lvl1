package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Even {
    public static void fillIteration(Game game) {
        var question = RandomUtils.nextInt(Game.LOWER_RANDOM_BOUND, Game.UPPER_RANDOM_BOUND);
        game.question = Integer.toString(question);
        game.rightAnswer = Even.isEven(question) ? "yes" : "no";
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
