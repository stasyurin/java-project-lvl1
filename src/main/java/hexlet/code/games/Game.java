package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Game {
    static final int POINTS_TO_WIN = 3;
    static final int LOWER_RANDOM_BOUND = 1;
    static final int UPPER_RANDOM_BOUND = 10;

    String rules;
    String question;
    String rightAnswer;

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

    void initGame (GameName gameName) {
        if (gameName == GameName.Even) {
            this.rules = "Answer 'yes' if number even otherwise answer 'no'.";
        } else if (gameName == GameName.Calc) {
            this.rules = "What is the result of the expression?";
        }
    }

    void createIteration (GameName gameName) {
        if (gameName == GameName.Even) {
            Even.fillIteration(this);
        } else if (gameName == GameName.Calc) {
            Calc.fillIteration(this);
        }
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
}
