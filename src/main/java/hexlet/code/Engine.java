package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public final class Engine {
    public static final int POINTS_TO_WIN = 3;
    public static final int LOWER_RANDOM_BOUND = 1;
    public static final int UPPER_RANDOM_BOUND = 101;

    private String rules;
    private String question;
    private String rightAnswer;

    public void startGame(GameName gameName, Cli cli) {
        initGame(gameName);
        System.out.println(rules);
        for (int i = 0; i < POINTS_TO_WIN; i++) {
            createIteration(gameName);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            Scanner in = new Scanner(System.in);
            var answer = in.nextLine();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                System.out.println("Let's try again, " + cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + cli.getName() + "!");
    }

    void initGame(GameName gameName) {
        if (gameName == GameName.Even) {
            this.rules = "Answer 'yes' if number even otherwise answer 'no'.";
        } else if (gameName == GameName.Calc) {
            this.rules = "What is the result of the expression?";
        } else if (gameName == GameName.GCD) {
            this.rules = "Find the greatest common divisor of given numbers.";
        } else if (gameName == GameName.Progression) {
            this.rules = "What number is missing in the progression?";
        }
    }

    void createIteration(GameName gameName) {
        if (gameName == GameName.Even) {
            Even.fillIteration(this);
        } else if (gameName == GameName.Calc) {
            Calc.fillIteration(this);
        } else if (gameName == GameName.GCD) {
            GCD.fillIteration(this);
        } else if (gameName == GameName.Progression) {
            Progression.fillIteration(this);
        }
    }

    public void setQuestion(String pQuestion) {
        this.question = pQuestion;
    }

    public void setRightAnswer(String pRightAnswer) {
        this.rightAnswer = pRightAnswer;
    }
}
