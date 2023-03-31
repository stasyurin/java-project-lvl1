package hexlet.code.games;

public class Prime {
    public static String rules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
