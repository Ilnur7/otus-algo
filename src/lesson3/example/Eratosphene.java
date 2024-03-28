package lesson3.example;

import java.util.Arrays;

public class Eratosphene {
    public static void main(String[] args) {
        int res = getPrimeNums(11);
        System.out.println(res);
    }

    private static int getPrimeNums(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        int count = 0;
        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                count++;
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return count;
    }
}
