package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.ITask;

import java.math.BigInteger;
import java.util.List;

public class FiboRecursively implements ITask {
    @Override
    public List<String> run(List<String> inputData) {
        int n = Integer.parseInt(inputData.get(0));
        BigInteger res = getRecursiveFibbNum(n);
        return List.of(String.valueOf(res));
    }

    private static BigInteger getRecursiveFibbNum(int n) {
        if (n == 0) {
            return BigInteger.ZERO;
        }
        if (n == 1) {
            return BigInteger.ONE;
        }
        return getRecursiveFibbNum(n - 1).add(getRecursiveFibbNum(n - 2));
    }
}
