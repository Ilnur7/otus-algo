package lesson2_happynumbers.senior.tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    private ITask task;
    private String path;


    public Tester(ITask task, String path) {
        this.path = path;
        this.task = task;
    }

    public void runTests() {
        for (int i = 0; ; i++) {
            String inputFile = path + "test." + i + ".in";
            String outputFile = path + "test." + i + ".out";

            try (BufferedReader inReader = new BufferedReader(new FileReader(inputFile));
                 BufferedReader outReader = new BufferedReader(new FileReader(outputFile))) {

                // Чтение входных данных из файла
                String inputLine;
                List<String> inputData = new ArrayList<>();
                while ((inputLine = inReader.readLine()) != null) {
                    inputData.add(inputLine);
                }

                // Чтение выходных данных из файла
                String outputLine;
                List<String> outputData = new ArrayList<>();
                while ((outputLine = outReader.readLine()) != null) {
                    outputData.add(outputLine);
                }

                // Получение результата работы вашего алгоритма
                long start = System.currentTimeMillis();
                List<String> actual = task.run(inputData);
                long end = System.currentTimeMillis() - start;
                if (outputData.equals(actual)) {
                    System.out.println("Test " + i + " passed successfully for TimeMs: " + end);
                } else {
                    System.out.println("Test " + i + " passed unsuccessfully.");
                }
            } catch (Exception e) {
                // Если произошла ошибка, выводим информацию об этом
                System.err.println("Error occurred while processing test " + i + ": " + e.getMessage());
                break; // Прерываем цикл, так как тесты закончились
            }
        }
    }
}
