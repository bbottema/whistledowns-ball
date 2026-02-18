# Session 12 – Failure Reasons

## Goal

Add diagnostic output explaining WHY someone is not invited.

## What You'll Do

1. Add `failureReasons` method to Ball
2. Upgrade `printRegistry` to show failure reasons
3. See detailed output for failed guests

## How to Run It

1. Open all Java files in this session
2. Right-click `S12_Demo.java` and run it

## Expected Output

```
Daphne -> INVITED
Penelope -> NOT INVITED (failed: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (failed: [ReputationRule])
```

## If You Get Stuck

**Empty list not working correctly**
- Use `failures.isEmpty()` to check if list is empty

**Import error**
- Add `import java.util.ArrayList;`

## Coach Notes

Tests shouldn't just fail; they should explain why. This is diagnostic reporting.

The pattern: accumulate failures, then report them. This appears everywhere in test automation and quality reports.
