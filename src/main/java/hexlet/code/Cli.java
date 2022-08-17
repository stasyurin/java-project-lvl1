package hexlet.code;

import java.util.Scanner;

public final class Cli {

    public void printWelcomeMsg() {
        System.out.println("Welcome to the Brain Games!");
    }

    public String askName() {
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
