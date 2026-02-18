# Session 01 – Sandbox Java (JShell)

## Goal

Get comfortable running simple Java code interactively, seeing output, and observing controlled errors.

## What You'll Do

1. Declare variables and print them
2. Trigger a controlled runtime exception (safe practice)
3. Optionally trigger a parsing error

## How to Run It

**This session uses JShell - an interactive Java console.**

1. Make sure you've installed the **JShell Console plugin** (see main README.md)
2. Open `S01_Sandbox.java` to see the code snippets
3. Open JShell Console: **Tools → JShell Console...**
4. Copy code snippets from the file (remove `//` comments and `TODO:`)
5. Paste them into JShell one section at a time
6. Press Enter after each snippet
7. Observe the output immediately

### Example JShell workflow:

```
jshell> int age = 21;
age ==> 21

jshell> System.out.println(age);
21

jshell> throw new RuntimeException("Lady Whistledown disapproves.");
|  Exception java.lang.RuntimeException: Lady Whistledown disapproves.
```

## Expected Output

You should see:
- Three printed values (age, family name, invited status)
- A RuntimeException with Lady Whistledown's message (this is expected!)

## If You Get Stuck

**JShell Console menu item not visible**
- Install the JShell Console plugin (see main README.md)
- Restart IntelliJ after installing

**Syntax error in JShell**
- Check for semicolons at the end of statements
- Make sure you removed `//` comment markers

**Want to start fresh?**
- Type `/reset` in JShell to clear all variables

## Coach Notes

JShell lets you experiment without the ceremony of classes and main methods. This is about feeling safe with Java.

Exceptions are information, not failure. You're learning to read what Java tells you.

Stop after you see the output and the exception. That's a win.
