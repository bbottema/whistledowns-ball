# Running Java and reading the console (Session 01)

Session 01 is not about “learning Java”. It’s about **running a tiny Java program** and learning how to **observe what happens**.

If you are a user-story tester who feels nervous about code, this is your safety goal:

> I can press Run, see output, see an error.

## The mental model

Think of a Java program as a tiny script that runs **top-to-bottom** starting in a place called `main`.

- When you click the green ▶ button in IntelliJ, you are telling Java: **start at `main`**.
- Every `System.out.println(...)` line is a **signal**: it prints something you can use to understand what happened.
- Some runs end normally.
- Some runs end with a crash, called an **exception**. In this course, we sometimes crash on purpose.

## What you will do in Session 01

You will uncomment TODO blocks in `S01_Assignment.java` one at a time and run the program.

You will observe three kinds of outcomes:

1. **Normal output** (printed text)
2. **A deliberate crash** (a `RuntimeException` you throw intentionally)
3. *(Optional)* A different crash from bad input parsing (`NumberFormatException`)

## How to read the console output

When your run finishes, look for these parts:

### 1) Your printed lines

If you wrote:

```java
System.out.println("The season begins...");
```

You should see that exact line in the console.

If you don’t see your prints:

- you may not have uncommented the right TODO
- you may have run the wrong file
- the program may have crashed before it reached the print

### 2) Exceptions (crashes) are information

A crash usually prints something like:

- the **exception type** (example: `RuntimeException`)
- the **message** you provided (example: `Scandal detected in the ballroom!`)
- a **stack trace** with a file name and line number

In Session 01, a crash is often *expected*. You did not “break Java”.

## What is `main(...)`?

For now, you can treat `main(...)` as the program’s **start button**.

You’ll learn more later — but you don’t need more than that to complete Session 01.

## Quick checklist when something feels wrong

- Did I uncomment only the TODO block I’m testing?
- Did I run `S01_Assignment.java` from `02-assignments/`?
- Is the console showing my print lines?
- If there’s a crash: what is the exception message, and what line number does it point to?
