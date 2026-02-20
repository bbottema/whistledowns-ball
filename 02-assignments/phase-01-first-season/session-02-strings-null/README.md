# Session 02 – Strings & Null (run a Java file)

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

## How to run (IntelliJ)

1. Open `S02_Assignment.java`.
2. Uncomment one TODO block at a time.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S02_Assignment.java` and choose **Run**.

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

### If you accidentally ran the wrong thing

- If you see tooling output that looks unlike a normal program run, you’re probably in the wrong run mode.
- For this course: run `S02_Assignment.java` as a normal program instead.