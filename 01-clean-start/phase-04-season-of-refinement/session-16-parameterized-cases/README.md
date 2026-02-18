# Session 16 – Parameterized Cases

## Goal

Simulate parameterized testing by looping over test cases with expected outcomes.

## What You'll Do

1. Define test cases as data (name, age, family, expected result)
2. Loop over test cases
3. Compare actual vs expected results
4. Print PASS/FAIL for each case

## How to Run It

1. Open all Java files in this session
2. Right-click `S16_Demo.java` and run it

## Expected Output

```
Test Case: Daphne (21, Bridgerton) -> PASS
Test Case: Penelope (16, Featherington) -> PASS
Test Case: Simon (28, Basset) -> PASS
Test Case: Theo (21, Sharpe) -> PASS
All 4 test cases passed!
```

## If You Get Stuck

**Logic errors in comparison**
- Check that you're comparing actual.invited with expected value
- Make sure test data matches reality

## Coach Notes

This is manual parameterized testing - the foundation of data-driven automation.

You're learning to separate test data from test logic, which is crucial for scalable testing.
