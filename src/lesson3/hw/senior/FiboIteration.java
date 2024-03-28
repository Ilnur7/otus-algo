package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.ITask;

import java.math.BigInteger;
import java.util.List;

public class FiboIteration implements ITask {
    @Override
    public List<String> run(List<String> inputData) {
        int n = Integer.parseInt(inputData.get(0));
        BigInteger res = getFibbNum(n);
        return List.of(String.valueOf(res));
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
