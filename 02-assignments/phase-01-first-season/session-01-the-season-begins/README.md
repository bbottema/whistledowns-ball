# Session 01 – First Run – The Season Begins

This session is about getting comfortable pressing **Run** and observing what happens.

You are not trying to understand Java today.
You are trying to run it.

## What you’ll get out of this

By the end of this session, you will be able to:

- run a tiny Java program and re-run it quickly
- store a few values in variables (`int`, `String`, `boolean`) just enough to get output
- print debug-style output to the console (your main “testing signal” today)
- tell apart a **runtime exception** (a crash while running) from a **syntax/parsing error** (a compile-time problem)

You’ll run everything from a regular Java program using the green ▶ run button. That’s the most important button in this project.

## Concepts (quick read, then do the TODOs)

Session 01 keeps concepts deliberately lightweight.
If you want a friendly explanation (aimed at non-developers), read these:

- [`help me understand/Running Java and reading the console.md`](help%20me%20understand/Running%20Java%20and%20reading%20the%20console.md)
- [`help me understand/Runtime vs Compile errors.md`](help%20me%20understand/Runtime%20vs%20Compile%20errors.md)

## Start here

1. Open `S01_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

This README explains *what to do next* and what "done" looks like.

## How to run (IntelliJ)

1. Open `S01_Assignment.java`.
2. Uncomment one TODO block.
3. Click the green ▶ next to `main(...)`.
4. Read the output and repeat.

### What is `main(...)`?

`main(...)` is the start button for a Java program.
When you click Run, Java begins there and executes the code top-to-bottom.

For now, treat `main(...)` as the program’s start button.
We’ll explain the details later. For now, it’s just the program’s start button.

## Plan B

Right-click inside `S01_Assignment.java` and choose **Run**.

## What “success” looks like

You should observe:

1. three printed lines (age, family name, invited status — the variables you created)
2. then some story output, then a crash (expected)

You should see output like:

```
The season begins...
A rule is evaluated...
```

Then you should see a `RuntimeException` with the message `Scandal detected in the ballroom!`.

An exception like this is like a failure report: it tells you what went wrong and where.

If you see printed lines followed by a RuntimeException with your message, you have done exactly what this session asked you to do.

## Troubleshooting

### I can’t find the green run button

- Make sure you opened the file inside `02-assignments/`, not `01-clean-start` or `03-solutions`.
- Make sure Project SDK is set to a JDK 21+.

### It prints, then crashes

- Good: That crash is intentional. You did not break anything.
- Read the exception message first, then the line number in the stack trace.
- If it crashes immediately without printing anything, re-check the order of your TODO blocks.

### Syntax/compile errors

- Check semicolons (`;`) at the end of statements.
- If IntelliJ shows a red underline, fix that first, then run again.
- IntelliJ sometimes shows yellow suggestions (a lightbulb icon). These are optional improvements — you can safely ignore them for now. Focus only on red errors (red lightbulb icon).