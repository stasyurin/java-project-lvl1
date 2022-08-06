package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.print("May I have your name? ");

        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
