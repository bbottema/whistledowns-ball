# Session 18 – Season statistics (analyse results)

## What you’ll get out of this

By the end of this session you can:

- count invited vs rejected guests
- count rejection reasons (grouping) using a `Map`
- find the most common rejection reason

## Concepts (quick read, then do the TODOs)

### This is test reporting logic

Test-analyst translation: you’re building the “how many failed, and why?” summary.

### Counting with a map

The safe counting pattern:

```java
counts.put(key, counts.getOrDefault(key, 0) + 1);
```

## Start here

1. Open `S18_Assignment.java`.
2. Uncomment the TODO blocks below in order.
3. Run it.

## How to run (IntelliJ)

1. Open `S18_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S18_Assignment.java` and choose **Run 'S18_Assignment.main()'**.

## What “success” looks like

You should see something like:

```
=== Season Statistics ===
Total Guests: 4
Invited: 2
Rejected: 2
Most Common Rejection: AgeRule (1 occurrences)
==========================
```

## Troubleshooting

### Counts look too high

- Only count rejection reasons for guests that are actually rejected.

### Most common reason is missing

- If there are no rejections, your reasons map will be empty.
