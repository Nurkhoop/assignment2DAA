import algorithms.BoyerMoore;
import metrics.PerformanceTracker;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 2, 2};
        PerformanceTracker tracker = new PerformanceTracker();

        Integer majority = BoyerMoore.findMajority(arr, tracker);
        System.out.println("Majority element: " + majority);
    }
}
