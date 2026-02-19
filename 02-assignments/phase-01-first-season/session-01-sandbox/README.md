# Session 01 – Java Sandbox (JShell)

## What you’ll get out of this

By the end of this session you can:

- run tiny Java snippets interactively (without building a whole app)
- store values in variables (`int`, `String`, `boolean`)
- print debug-style output to the console
- tell apart a **runtime exception** from a **syntax/parsing error**

## Concepts (quick read, then do the TODOs)

### Variables = named boxes for values

In Java, you typically create a variable in one line (think: “create a field/value I can reuse in the next step”):

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

There are many such types, but with these three alone, you can already do nearly everything!

### Printing values (hello, debugging)

`System.out.println(...)` prints whatever you put inside the parentheses. This is the Java version of quick “log it and see” debugging:

```
System.out.println(age);
```

If this thing looks scary, you're not wrong: this particular *method call* is a bit verbose because it is one of the oldest parts of Java. 
Don't worry though, you'll get used to it!

### Errors are information (not a personal insult)

- A **runtime exception** happens *while the code is running* (we’ll deliberately `throw new RuntimeException(...)`).
- A **syntax/parsing error** happens when Java can’t understand what you wrote.
- A **NumberFormatException** is an example of a _runtime exception_, which happens when you ask Java to convert text like `"not-a-number"` into a number.

## Start here

1. Open `S01_Sandbox.java`.
2. Follow the `TODO` blocks **in order**.

This README explains *how to run* the snippets and what “done” looks like.

## How to run (recommended: JShell Console)

JShell is an interactive Java console. No project setup ceremony — just type a line and see what happens.

1. Install the **JShell Console plugin** (see the repo root `README.md`).
2. Open the JShell Console: **Tools → JShell Console...**
3. In `S01_Sandbox.java`, copy a snippet line (or a small group of lines).
4. Paste it into JShell and press Enter.

Tip: The lines in `S01_Sandbox.java` are commented out. In JShell, paste them **without** the leading `//`.

## Plan B (no plugin): Java Scratch File

If you don't want to install the plugin:

1. In the Project view: **Right-click → New → Scratch File → Java**
2. Copy the snippet lines (again: remove the leading `//`).
3. Run the scratch file.

## What “success” looks like

You should observe:

1. three printed lines (age, family name, invited status)
2. a `RuntimeException` with the message `Lady Whistledown disapproves.` (expected)

## Troubleshooting

### "JShell Console..." menu item isn't visible

- Install the JShell Console plugin (see the repo root `README.md`).
- Restart IntelliJ after installing.

### "cannot find symbol" (or similar)

- In JShell, run the variable declarations **before** the `System.out.println(...)` lines.
  (In test terms: you’re using a value before it’s been “set up”.)

### Syntax errors in JShell

- Check semicolons (`;`) at the end of statements.
- Make sure you removed the leading `//` from the snippet.

### Start over

Type `/reset` in JShell to clear variables.
