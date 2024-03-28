package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.ITask;

import java.util.Arrays;
import java.util.List;

public class EratosphenePrime implements ITask {
    @Override
    public List<String> run(List<String> inputData) {
        int n = Integer.parseInt(inputData.get(0));
        long res = getEratosphenePrimeNums(n);
        return List.of(String.valueOf(res));
    }

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
