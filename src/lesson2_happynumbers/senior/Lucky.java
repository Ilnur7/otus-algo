package lesson2_happynumbers.senior;

import lesson2_happynumbers.senior.tester.ITask;

import java.util.Arrays;
import java.util.List;

public class Lucky implements ITask {

    private static long count = 0;
    @Override
    public List<String> run(List<String> inputData) {
        int n = Integer.parseInt(inputData.get(0));
        long res = luckyTickets(n);
        return List.of(String.valueOf(res));
    }

    // Функция для вычисления количества счастливых билетов для num-разрядных чисел
    private static long luckyTickets(int num) {
        long[] arr = new long[10]; // Первый массив
        Arrays.fill(arr, 1); // Заполняем первый массив единицами

        for (int i = 0; i < num - 1; i++) {
            arr = getNextArr(arr); // Строим следующие массивы num - 1 раз
        }

        long result = 0;
        for (long v : arr) {
            result += v * v; // Сводим квадраты значений в получившемся массиве
        }
        return result;
    }

    // Функция для построения следующего массива из предыдущего
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
}
