# Session 18 – Season Statistics

## Goal

Add statistical analysis to the Ball, including counting and finding the most common rejection reason.

## What You'll Do

1. Count total guests, invited, and rejected
2. Track rejection reasons in a Map
3. Find the most common rejection reason
4. Print a statistical summary

## How to Run It

1. Open all Java files in this session
2. Right-click `S18_Demo.java` and run it

## Expected Output

```
=== Season Statistics ===
Total Guests: 4
Invited: 2
Rejected: 2
Most Common Rejection: AgeRule (1 occurrences)
==========================
```

## If You Get Stuck

**Map operations confusing**
- Use `getOrDefault(key, 0)` to safely increment counts
- Loop through Map entries to find the maximum

**Logic errors**
- Make sure you're only counting rejection reasons for rejected guests

## Coach Notes

This is practical data aggregation - counting, grouping, and finding patterns in data.

In test automation, you often need to analyze test results: how many passed, how many failed, what's the most common failure reason?

Maps are perfect for counting occurrences of things.
