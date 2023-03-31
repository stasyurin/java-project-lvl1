package hexlet.code;

import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public final class Cli {

    public static void printWelcomeMsg() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static String askName() {
        System.out.print("May I have your name? ");
        Scanner in = new Scanner(System.in, UTF_8);
        return in.nextLine();
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
