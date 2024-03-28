package lesson3.hw.middle;

import java.util.Arrays;

public class Middle {
    public static void main(String[] args) {
        long pow = pow(2, 5);
        System.out.println("Возведение в степень: " + pow);

        int countPrimeNums = getCountPrimeNums(100);
        System.out.println("Count prime numbers: " + countPrimeNums);

        int countEratosphenePrimeNums = getEratosphenePrimeNums(100);
        System.out.println("Count Eratosphene prime numbers: " + countEratosphenePrimeNums);
    }

    //TODO пункт 12; Алгоритм возведения в степень через двоичное разложение показателя степени O(2LogN) = O(LogN).
    public static int pow(int base, int rate) {
        int result = 1;
        while (rate > 0) {
            if (rate % 2 == 1) {
                result *= base;
            }
            base *= base;
            rate /= 2;
        }
        return result;
    }

    //TODO пункт 15; Алгоритм поиска простых чисел с оптимизациями поиска и делением только на простые числа, O(N * Sqrt(N) / Ln (N)).
    private static int getCountPrimeNums(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //TODO пункт 16; Алгоритм "Решето Эратосфена" для быстрого поиска простых чисел O(N Log Log N).
    private static int getEratosphenePrimeNums(int n) {
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
