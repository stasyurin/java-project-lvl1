package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        var noOfGame = Integer.parseInt(in.nextLine());
        System.out.println();
        if (noOfGame == 1) {
            Cli.greet();
        }
    }
}
