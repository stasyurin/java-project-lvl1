package hexlet.code;

import java.util.Scanner;

public class Cli {
    private String name;

    public void init() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner in = new Scanner(System.in);
        this.name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public String getName() {
        return name;
    }
}
