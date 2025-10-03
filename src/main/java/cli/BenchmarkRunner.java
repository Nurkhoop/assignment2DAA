package cli;

import algorithms.BoyerMoore;
import metrics.PerformanceTracker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) throws IOException {
        int[] sizes = {1000, 10000, 100000, 1000000};
        FileWriter writer = new FileWriter("results.csv");
        writer.write("ArraySize,Type,Time(ns),Comparisons,Accesses,Majority\n");

        for (int size : sizes) {
            // 1. Случайный массив
            int[] randomArray = generateRandomArray(size);
            runBenchmark(writer, randomArray, "Random");

            // 2. Массив с большинством
            int[] majorityArray = generateArrayWithMajority(size);
            runBenchmark(writer, majorityArray, "WithMajority");
        }

        writer.close();
        System.out.println("Benchmark completed. Results saved in results.csv");
    }

    private static void runBenchmark(FileWriter writer, int[] array, String type) throws IOException {
        PerformanceTracker tracker = new PerformanceTracker();
        long startTime = System.nanoTime();
        Integer result = BoyerMoore.findMajority(array, tracker);
        long endTime = System.nanoTime();

        writer.write(array.length + ","
                + type + ","
                + (endTime - startTime) + ","
                + tracker.getComparisons() + ","
                + tracker.getAccesses() + ","
                + result + "\n");
    }

    private static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    private static int[] generateArrayWithMajority(int n) {
        Random rand = new Random();
        int majority = rand.nextInt(10);
        int[] arr = new int[n];

        // первые 60% делаем одинаковыми
        for (int i = 0; i < n * 0.6; i++) {
            arr[i] = majority;
        }
        // остальные случайные
        for (int i = (int)(n * 0.6); i < n; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }
}
