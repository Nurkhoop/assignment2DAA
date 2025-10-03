package algorithms;

import metrics.PerformanceTracker;

public class BoyerMoore {
    public static Integer findMajority(int[] arr, PerformanceTracker tracker) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // шаг 1: находим кандидата
        int candidate = findCandidate(arr, tracker);
        // шаг 2: проверяем, правда ли он большинство
        if (isMajority(arr, candidate, tracker)) {
            return candidate;
        }
        return null;
    }

    private static int findCandidate(int[] arr, PerformanceTracker tracker) {
        int count = 0;
        int candidate = -1;

        for (int i = 0; i < arr.length; i++) {
            tracker.addAccess(); // доступ к arr[i]
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else {
                tracker.addComparison(); // сравнение arr[i] == candidate
                if (arr[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return candidate;
    }

    private static boolean isMajority(int[] arr, int candidate, PerformanceTracker tracker) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            tracker.addAccess();
            tracker.addComparison();
            if (arr[i] == candidate) {
                count++;
            }
        }
        return count > arr.length / 2;
    }
}
