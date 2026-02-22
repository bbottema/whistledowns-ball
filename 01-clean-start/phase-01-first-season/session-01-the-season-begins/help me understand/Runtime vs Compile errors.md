# Runtime vs compile errors

In Java, you’ll commonly see two big categories of “something went wrong”.

This course treats both as useful signals (not as a judgement).

## Compile-time / syntax errors (Java can’t start)

If Java **cannot understand what you wrote**, it refuses to run.

You’ll see red underlines in IntelliJ and messages like:

- `';' expected`
- `cannot find symbol`
- `reached end of file while parsing`

Think of this as:

> The program can’t even start because the code isn’t valid Java yet.

Fix these first. Then run again.

## Runtime errors / exceptions (Java started, then crashed)

If Java *can* start, but something goes wrong while executing, it crashes with an **exception**.

You’ll see messages like:

- `RuntimeException: Scandal detected in the ballroom!` (sometimes deliberate for learning)
- `NumberFormatException: For input string: "not-a-number"`
- later: `NullPointerException`

Think of this as:

> The program ran up to a point, then it hit a failure.

### How to read a runtime exception quickly

1. Read the **first line** (exception type + message)
2. Find the **first line that mentions your file** (example: `S01_Assignment.java:25`)
3. Go to that line number in code

## Why testers should care

This is the same idea as:

- “test didn’t start” (setup/config error)
- “test started but failed” (assertion failure / runtime failure)

Session 01’s goal is simply to get comfortable seeing both kinds.
