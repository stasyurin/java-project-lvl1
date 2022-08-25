package hexlet.code.games;

public class Even {
    static String rules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
