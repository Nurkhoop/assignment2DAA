package metrics;

public class PerformanceTracker {
    private int comparisons = 0;
    private int accesses = 0;

    public void addComparison() { comparisons++; }
    public void addAccess() { accesses++; }

    public int getComparisons() { return comparisons; }
    public int getAccesses() { return accesses; }

    public void reset() {
        comparisons = 0;
        accesses = 0;
    }
}
