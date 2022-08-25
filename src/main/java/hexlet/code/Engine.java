package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int POINTS_TO_WIN = 3;
    public static final int LOWER_RANDOM_BOUND = 1;
    public static final int UPPER_RANDOM_BOUND = 101;

    private final String clientName;

    Engine(String pClientName) {
        this.clientName = pClientName;
    }

    public void startGame(String[] gameInfo) {
        String rules = gameInfo[0];
        String question = gameInfo[1];
        String rightAnswer = gameInfo[2];
        System.out.println(rules);
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var clientAnswer = in.nextLine();
            if (clientAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + clientAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + clientName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + clientName + "!");
    }
}
