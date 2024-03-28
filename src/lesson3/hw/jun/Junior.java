package lesson3.hw.jun;

public class Junior {
    public static void main(String[] args) {
        int pow = pow(2, 5);
        System.out.println("Возведение в степень: " + pow);

        int fibbNum = getFibbNum(10);
        System.out.println("Число Фибоначчи итеративно: " + fibbNum);

        int recursiveFibbNum = getRecursiveFibbNum(10);
        System.out.println("Число Фибоначчи рекурсивно: " + recursiveFibbNum);

    }

    // TODO итеративный O(N) алгоритм возведения числа в степень
    public static int pow(int base, int rate) {
        int result = 1;
        for (int i = 0; i < rate; i++) {
            result = result * base;
        }
        return result;
    }

    // TODO рекурсивный O(2^N) алгоритм поиска чисел Фибоначчи
    private static int getRecursiveFibbNum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return getRecursiveFibbNum(n - 1) + getRecursiveFibbNum(n - 2);
    }

    // TODO итеративный O(N) алгоритм поиска чисел Фибоначчи
    private static int getFibbNum(int n) {
        int fib0 = 0;
        int fib1 = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = fib0 + fib1;
            fib0 = fib1;
            fib1 = res;
        }
        return res;
    }
}
