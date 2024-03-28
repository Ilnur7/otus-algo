package lesson3.example;

import java.math.BigInteger;

public class Fibbonachi {
    public static void main(String[] args) {
        //int res = getRecursiveFibbNum(10);
        BigInteger res = getFibbNum(100);
        System.out.println(res.toString());
    }

    private static int getRecursiveFibbNum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getRecursiveFibbNum(n - 1) + getRecursiveFibbNum(n - 2);
    }

    private static BigInteger getFibbNum(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger fib0 = BigInteger.valueOf(0);
        BigInteger fib1 = BigInteger.valueOf(1);
        BigInteger res = BigInteger.valueOf(0);
        for (int i = 1; i < n; i++) {
            res = fib0.add(fib1);
            fib0 = fib1;
            fib1 = res;
        }
        return res;
    }


}
