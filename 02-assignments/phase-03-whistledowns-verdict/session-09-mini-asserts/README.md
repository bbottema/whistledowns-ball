# Session 09 – Mini asserts (tiny test framework vibes)

## What you’ll get out of this

By the end of this session you can:

- write a tiny `assertTrue` that fails with a useful message
- use those asserts to check expectations against real code
- treat `AssertionError` as a test signal (expected vs actual didn’t match)

## Concepts (quick read, then do the TODOs)

### An assert is a test expectation

If the expectation is not met, the test should fail *loudly*.

```java
S09_MiniAsserts.assertTrue(ball.mayAttend(simon), "Simon should be invited");
```

### `AssertionError` is not a crash — it’s a result

In testing terms: an `AssertionError` means “the check failed”.
That’s the whole point.

### Optional: `assertEquals`

If you implement `assertEquals`, use `Objects.equals(expected, actual)` so `null` is handled safely.

## Start here

1. Open `S09_MiniAsserts.java` and implement the TODOs.
2. Open `S09_Assignment.java` and uncomment the TODOs.
3. Run the assignment.

## How to run (IntelliJ)

1. Open `S09_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S09_Assignment.java` and choose **Run 'S09_Assignment.main()'**.

## What “success” looks like

When everything is correct, you should see:

```
All checks passed
```

## Controlled failure practice (recommended)

After you get a passing run:

1. Flip one expectation (e.g., remove the `!` from `!ball.mayAttend(penelope)`)
2. Run again
3. Read the `AssertionError` message like a test report
4. Undo your change

## Troubleshooting

### `AssertionError`

- This means a check failed.
- Read the message — it tells you what the test *expected*.

### Nothing prints

- The TODO blocks in `S09_Assignment.java` are still commented out.
