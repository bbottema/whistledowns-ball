# Session 02 – Strings & Null (JShell)

## What you’ll get out of this

By the end of this session you can:

- compare text values safely (no more mysterious `==` surprises)
- do a few everyday string operations (contains / startsWith / replace / trim)
- write a null-safe check that won’t blow up your test run
- recognise the classic `NullPointerException` and know what it *usually* means

## Concepts (quick read, then do the TODOs)

### Strings: use `.equals(...)` (not `==`)

In Java, `==` checks if two references are the *same object*.
For text equality, use:

```java
expected.equals(actual)
```

Test-analyst translation: this is your **expected vs actual** comparison.

### Null: it means “missing value”

`null` is Java’s way of saying “nothing was set here”.
If you do `familyName.isBlank()` when `familyName` is `null`, Java can’t continue and you’ll get a `NullPointerException`.

The safe pattern:

```java
familyName != null && !familyName.isBlank()
```

### Fail fast (optional)

Sometimes, instead of quietly returning `false`, you want to stop immediately and tell future-you what went wrong.
That’s what the optional `IllegalArgumentException` example is for.

## Start here

1. Open `S02_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

## How to run (recommended: JShell Console)

JShell is an interactive Java console. It's perfect for quick "poke it and see" experiments.

1. Open JShell Console: **Tools → JShell Console...**
2. Copy snippet lines from `S02_Assignment.java`.
3. Paste them into JShell **without** the leading `//`.

## Plan B (no plugin): Java Scratch File

1. In the Project view: **Right-click → New → Scratch File → Java**
2. Paste the snippet lines (again: without `//`).
3. Run the scratch file.

## What “success” looks like

You should observe:

1. `true` printed for the `.equals(...)` check
2. several printed values from the string operations (`contains`, `startsWith`, `replace`, `toLowerCase`, `trim`)
3. `false` printed for the null-safe `respectable` check

## Troubleshooting

### `NullPointerException`

- You called a method on `null`.
- Fix: check `!= null` *before* calling methods like `.isBlank()`.

### “Why does `==` fail for strings?”

- Because `==` is not a text comparison.
- Fix: use `.equals(...)`.

### JShell says “variable already exists”

- JShell remembers your previous run.
- In the **IntelliJ JShell Console**, click the **trash/bin** button and try again.
  (If you're using *terminal* JShell instead, type `/reset`.)
