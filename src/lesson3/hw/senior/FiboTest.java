package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.Tester;

public class FiboTest {
    public static void main(String[] args) {
        /**
         * Test 7 passed successfully for TimeMs: 0
         * Test 8 passed successfully for TimeMs: 1
         * Test 9 passed successfully for TimeMs: 5
         * Test 10 passed successfully for TimeMs: 139
         * Test 11 passed successfully for TimeMs: 8905
         * Test 12 passed successfully for TimeMs: 828477
         */
//        FiboIteration fiboIteration = new FiboIteration();
//        Tester fiboIterationTester = new Tester(fiboIteration, "/Users/i.gaisin/Downloads/4.Fibo/");
//        fiboIterationTester.runTests();

        /**
         *
         */
        FiboRecursively fiboRecursively = new FiboRecursively();
        Tester fiboRecursivelyTester = new Tester(fiboRecursively, "/Users/i.gaisin/Downloads/4.Fibo/");
        fiboRecursivelyTester.runTests();
    }
}
