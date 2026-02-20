# Session 04 – The “Start Button” (`main`)

Starting from this session, we’re leaving JShell and running a real Java program.
Yes, it comes with the scary-looking `public static void main(String[] args)`.
No, you don’t need to understand every word in that line yet.

## What you’ll get out of this

By the end of this session you can:

- run a Java file using IntelliJ’s green run button
- recognise the `main` method as the program’s “start here” entry point
- intentionally create a tiny compile error, read the error signal, and fix it

## Concepts (quick read, then do the TODOs)

### `main` is the start of the program

When you click Run, Java starts at:

```java
public static void main(String[] args)
```

You can treat the rest (`static`, `String[] args`) as required boilerplate code for now. This is also one of the oldest parts of Java!

### Red underline = a compile-time signal

If IntelliJ underlines something in red, your code doesn’t compile yet.
That’s not failure — that’s fast feedback.

## Start here

1. Open `S04_Assignment.java`.
2. Follow the TODO.

## How to run (IntelliJ)

1. Uncomment the `System.out.println("Hello tester");` line.
2. Click the green ▶ next to `main(...)`.

## Plan B

If you can't find the green ▶:

1. Right-click inside `S04_Assignment.java`
2. Click **Run 'S04_Assignment.main()'**

## What “success” looks like

You should see:

```
Hello tester
```

## Troubleshooting

### "Cannot find or load main class"

- Make sure the file name and the `class` name match: `S04_Assignment`.
- Make sure you are running the file that actually contains `main(...)`.

## Controlled error practice (optional, but recommended)

1. Remove the semicolon from the `println` line
2. Watch IntelliJ add a red underline
3. Hover it (or press Alt+Enter) and read what it says
4. Put the semicolon back and run again
