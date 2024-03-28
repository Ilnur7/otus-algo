package lesson3.hw.senior;

import lesson2_happynumbers.senior.tester.Tester;

public class PrimeNumbersTest {
    public static void main(String[] args) {
        /**
         * Test 10 passed successfully for TimeMs: 58
         * Test 11 passed successfully for TimeMs: 1454
         * Test 12 passed successfully for TimeMs: 38099
         * Test 13 passed successfully for TimeMs: 1041885
         * Test 14 passed successfully for TimeMs: 51629
         */
        Prime prime = new Prime();
        Tester tester = new Tester(prime, "/Users/i.gaisin/Downloads/5.Primes/");
        tester.runTests();

        /**
         * Test 10 passed successfully for TimeMs: 4
         * Test 11 passed successfully for TimeMs: 30
         * Test 12 passed successfully for TimeMs: 668
         * Test 13 passed successfully for TimeMs: 9909
         * Test 14 passed successfully for TimeMs: 849
         */
        EratosphenePrime eratosphenePrime = new EratosphenePrime();
        Tester eratospheneTester = new Tester(eratosphenePrime, "/Users/i.gaisin/Downloads/5.Primes/");
        eratospheneTester.runTests();
    }
}
