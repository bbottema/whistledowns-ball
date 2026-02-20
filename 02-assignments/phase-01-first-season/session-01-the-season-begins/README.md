# Session 01 – First Run – The Season Begins

This session is about getting comfortable pressing Run and seeing what happens.

## What you’ll get out of this

By the end of this session you can:

- run a tiny Java program and re-run it quickly
- store values in variables (`int`, `String`, `boolean`)
- print debug-style output to the console
- tell apart a **runtime exception** from a **syntax/parsing error**

You’ll run everything from a regular Java program using the green ▶ run button.

## Concepts (quick read, then do the TODOs)

### Variables = named boxes for values

In Java, you create a variable in one line. Think: “create a value I can reuse in the next step.”

```
int age = 21;
```

That line has three parts:

1. **Type**: `int` → what kind of value this variable can hold
2. **Name**: `age` → how you refer to it later
3. **Value**: `21` → the starting value

### Types you’ll use today

- `int` → whole numbers (e.g. `21`)
- `String` → text in double quotes (e.g. `"Bridgerton"`)
- `boolean` → `true` or `false`

Java is *typed*: once you declare `int age`, you can change the value later, but it must stay an `int`.
If that sounds strict: good news — it’s basically built-in validation.

There are many such types, but with these three alone, you can already do many things!

### Printing values (hello, debugging)

`System.out.println(...)` prints whatever you put inside the parentheses. This is the Java version of quick “log it and see” debugging:

```
System.out.println(age);
```

If this looks verbose, that’s normal. It’s one of the oldest parts of Java, and you’ll quickly get used to it.

### Errors are information (not a personal insult)

Errors in Java are called **exceptions**. They represent a crash, and crashes are information. They can completely halt a program, but you can also code around them to decide what should happen next.

- A **runtime exception** happens *while the code is running* (we’ll deliberately `throw new RuntimeException(...)`).
- A **syntax/parsing error** happens when Java can’t understand what you wrote.
- A **NumberFormatException** is an example of a _runtime exception_, which happens when you ask Java to convert text like `"not-a-number"` into a number.

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

For now, treat `main(...)` as the program’s entry point.  
We’ll explain the details later — nothing here requires you to understand those words yet.

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

An exception like this is like a failure report: it tells you what went wrong and where. It's very useful!

If you see printed lines followed by a RuntimeException with your message → you succeeded.

## Troubleshooting

### I can’t find the green run button

- Make sure you’re in `02-assignments/` (that folder is the IntelliJ Sources Root).
- Make sure Project SDK is set to a JDK 21+.

### It prints, then crashes

- Good: That crash is intentional. You did not break anything.
- Read the exception message first, then the line number in the stack trace.
- If it crashes immediately without printing anything, re-check the order of your TODO blocks.

### Syntax/compile errors

- Check semicolons (`;`) at the end of statements.
- If IntelliJ shows a red underline, fix that first, then run again.
- IntelliJ sometimes shows yellow suggestions (a lightbulb icon). These are optional improvements — you can safely ignore them for now.