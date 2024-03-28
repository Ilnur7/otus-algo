package lesson3.example;

public class SimplePow {
    public static void main(String[] args) {

    }

    // TODO O(n)
    public static int pow(int base, int rate) {
        int result = 1;
        for (int i = 0; i < rate; i++) {
            result = result * base;
        }
        return result;
    }

    //TODO log n
    public static int recursivePow(int base, int rate) {
        if (rate == 1) {
            return 1;
        }

        if (rate % 2 == 0) {
            int result = recursivePow(base, rate / 2);
            return result * result;
        } else {
            int result = recursivePow(base, rate - 1);
            return result * base;
        }
    }
}
