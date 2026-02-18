# Session 08 – The Ball

## Goal

Create a Ball class that orchestrates multiple rules and produces a guest registry.

## What You'll Do

1. Define the Ball class with a list of rules
2. Implement `mayAttend` to check all rules
3. Implement `printRegistry` to show invite status for all guests

## How to Run It

1. Open all Java files in this session
2. Right-click `S08_Demo.java` and run it

## Expected Output

```
Daphne -> INVITED
Penelope -> NOT INVITED
Simon -> INVITED
```

## If You Get Stuck

**"Cannot find symbol Ball"**
- Make sure S08_Ball.java is in the same directory

**Logic errors in mayAttend**
- Loop through all rules
- If any rule fails, return false
- Only return true if all pass

## Coach Notes

The Ball is an orchestrator. It coordinates applying multiple rules to multiple guests.

This pattern appears everywhere in automation: take a collection of checks, apply them to test data, report results.
