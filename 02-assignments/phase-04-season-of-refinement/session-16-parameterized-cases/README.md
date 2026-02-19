# Session 16 – Parameterized cases (data-driven tests)

## What you’ll get out of this

By the end of this session you can:

- define test cases as data (input + expected outcome)
- loop over them and print PASS/FAIL
- compare expected vs actual in a way that scales

## Concepts (quick read, then do the TODOs)

### Parameterized testing = same test, many rows

This session is basically “table-driven testing” in plain Java.

### Compare expected vs actual

You’ll compare:

```java
result.invited == testCase.expectedInvited
```

## Start here

1. Open `S16_Assignment.java`.
2. Uncomment the TODO blocks in order.
3. Run it.

## How to run (IntelliJ)

1. Open `S16_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S16_Assignment.java` and choose **Run 'S16_Assignment.main()'**.

## What “success” looks like

You should see:

```
Test Case: Daphne (21, Bridgerton) -> PASS
Test Case: Penelope (16, Featherington) -> PASS
Test Case: Simon (28, Basset) -> PASS
Test Case: Theo (21, Sharpe) -> PASS
All 4 test cases passed!
```

## Troubleshooting

### PASS/FAIL looks wrong

- Make sure you’re comparing `result.invited` (actual) with `expectedInvited` (expected).
