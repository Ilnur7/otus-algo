package lesson3.example;

public class SimplePrimes {
    public static void main(String[] args) {
        int res = getCountPrimeNums(1000000);
        System.out.println(res);
    }

    private static int getCountPrimeNums(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime1(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 1;
    }

    private static boolean isPrime1(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
