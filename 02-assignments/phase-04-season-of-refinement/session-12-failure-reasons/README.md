# Session 12 – Failure reasons (make failures helpful)

## What you’ll get out of this

By the end of this session you can:

- collect failure reasons instead of only returning `true/false`
- print output that explains *why* a guest is rejected
- treat diagnostics like a test report (useful, not noisy)

## Concepts (quick read, then do the TODOs)

### “Why did it fail?” is part of the result

In automation, a failing check without context is painful.
We want:

- pass/fail
- plus a short list of reasons when it fails

### Empty list = “no failures”

If your failures list is empty, that’s a pass.

```java
failures.isEmpty()
```

## Start here

1. Open `S12_Assignment.java` and follow the TODOs.
2. Implement the `failureReasons` / registry printing logic in the supporting classes.
3. Run the assignment.

## How to run (IntelliJ)

1. Open `S12_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S12_Assignment.java` and choose **Run 'S12_Assignment.main()'**.

## What “success” looks like

You should see:

```
Daphne -> INVITED
Penelope -> NOT INVITED (failed: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (failed: [ReputationRule])
```

## Troubleshooting

### “Empty list” logic is inverted

- Fix: use `failures.isEmpty()` to detect “no failures”.

### Import errors

- If `ArrayList` is red, add `import java.util.ArrayList;`.
