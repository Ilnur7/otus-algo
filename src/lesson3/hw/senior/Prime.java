package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.ITask;

import java.util.List;

public class Prime implements ITask {

    @Override
    public List<String> run(List<String> inputData) {
        int n = Integer.parseInt(inputData.get(0));
        long res = getCountPrimeNums(n);
        return List.of(String.valueOf(res));
    }

    // Алгоритм поиска простых чисел с оптимизациями поиска и делением только на простые числа, O(N * Sqrt(N) / Ln (N)).
    private static long getCountPrimeNums(int n) {
        long count = 0;
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
}
