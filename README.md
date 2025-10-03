## Algorithms Benchmark Project

## Overview
This project implements the **Boyer–Moore majority vote algorithm** and includes a simple system to measure its performance.  
It also contains **unit tests** covering both typical and edge cases (empty array, single element, all identical elements, negative numbers, and arrays with no majority element).

The main goal was to learn how to implement an efficient algorithm and benchmark its performance while keeping track of different metrics.

---

## Project Structure
assignment2DAA/

src/main/java/algorithms/

src/main/java/metrics/

src/main/java/cli/

src/main/resources/

src/test/java/algorithms/

docs/performance-plots/

docs/analysis-report.pdf

docs/cross-review-summary.pdf

results.csv

README.md

## How to Run

### Compile Project
```mvn compile```

## Run Unit Tests

```mvn test```

All unit tests for Boyer–Moore algorithm are located in src/test/java/algorithms/BoyerMooreTest.java.
They cover the following cases:

Empty array → returns null

Single element → returns the element itself

Array with no majority element → returns null

Array with a clear majority → returns the majority element

Array with all identical elements → returns that element

Array with negative numbers → returns correct majority

## Run Benchmark CLI
java -cp target/classes cli.BenchmarkRunner
This will generate results.csv containing performance data for the algorithm.
Graphs for analysis can be found in docs/performance-plots/.

--- 
## What I Learned
Implementing the Boyer–Moore algorithm efficiently.

Writing unit tests to cover both typical and edge cases.

Tracking performance metrics such as execution time and data accesses.

Organizing a project structure with source code, tests, reports, and results.

Preparing for collaborative work, leaving room for reports and partner review.

Next Steps
Add the individual analysis report (docs/analysis-report.pdf) after reviewing Kadane's algorithm from my partner.

Create the cross-review summary (docs/cross-review-summary.pdf) comparing our algorithms, optimizations, and performance.

Include optimization results with before/after benchmarks and updated graphs.

---

## Notes
The project is a work in progress. Current version focuses on code, unit tests, and performance tracking.
Reports will be added after team review sessions.