package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreTest {

    @Test
    public void testMajorityExists() {
        int[] arr = {2,2,1,1,2,2,2};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(2, BoyerMoore.findMajority(arr, tracker));
    }

    @Test
    public void testNoMajority() {
        int[] arr = {1,2,3,4,5};
        PerformanceTracker tracker = new PerformanceTracker();
        assertNull(BoyerMoore.findMajority(arr, tracker));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {7};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(7, BoyerMoore.findMajority(arr, tracker));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        PerformanceTracker tracker = new PerformanceTracker();
        assertNull(BoyerMoore.findMajority(arr, tracker));
    }

    //edge-case
    @Test
    public void testAllSameElements() {
        int[] arr = {5, 5, 5, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(5, BoyerMoore.findMajority(arr, tracker));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {-1, -1, -1, 2, 3};
        PerformanceTracker tracker = new PerformanceTracker();
        assertEquals(-1, BoyerMoore.findMajority(arr, tracker));
    }
}
