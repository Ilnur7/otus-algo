package lesson2_happynumbers;

import java.math.BigInteger;
import java.util.Arrays;

public class MiddleHappyNumbers {
    private static long count = 0;
    public static void main(String[] args) {
        for (int i = 2; i <= 5; i++) {
            long start = System.currentTimeMillis();
            luckyRecursive(i);
            long end = System.currentTimeMillis() - start;
            System.out.println(i + " - Count: " + count + ", TimeMs: " + end);
            count = 0;
        }
    }

    private static BigInteger luckyTickets(int num) {
        long[] arr = new long[10]; // Первый массив
        Arrays.fill(arr, 1); // Заполняем первый массив единицами

        for (int i = 0; i < num - 1; i++) {
            arr = getNextArr(arr); // Строим следующие массивы num - 1 раз
        }

        BigInteger result = BigInteger.ZERO;
        for (long v : arr) {
            BigInteger squaredValue = BigInteger.valueOf(v).pow(2);
            result = result.add(squaredValue);
        }
        return result;
    }

    // TODO Функция для построения следующего массива из предыдущего
    private static long[] getNextArr(long[] prevArr) {
        int newLen = prevArr.length + 9; // Длина следующего массива будет больше на 9
        long[] arr = new long[newLen]; // Заготовка результата

        for (int i = 0; i < newLen; i++) {
            long q = 0; // Заготовка нового значения
            for (int j = 0; j < 10; j++) { // Берем 10 нужных значений
                if (i - j >= 0 && i - j < prevArr.length) { // Проверяем, что индекс не выходит за границы массива
                    q += prevArr[i - j]; // Добавляем значение, если оно существует в предыдущем массиве
                }
            }
            arr[i] = q;
        }
        return arr;
    }


    //TODO рекурсивный счетчик количества одинкаовых сумм
    private static void luckyRecursive(int n) {
        next(n, 0, 0);
    }

    private static void next(int n, int sumA, int sumB) {
        if (n == 0) {
            if (sumA == sumB) {
                count++;
            }
            return;
        }
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9 ; b++) {
                next(n - 1, sumA + a, sumB + b);
            }
        }
    }

    //TODO рекурсивный счетчик количества одинкаовых сумм O(n) = 100 ^ n
    private static void luckyAbsRecursive(int n) {
        nextAbs(n, 0, 0);
    }

    private static void nextAbs(int n, int sumA, int sumB) {
        if (n == 1) {
            int abs = Math.abs(sumA - sumB);
            if (abs <= 9) {
                count += 10 - abs;
            }
            return;
        }
        for (int a = 0; a <= 9; a++) {
            for (int b = 0; b <= 9 ; b++) {
                nextAbs(n - 1, sumA + a, sumB + b);
            }
        }
    }
}
