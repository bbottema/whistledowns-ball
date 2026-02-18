# Session 02 – Strings & Null Safety (JShell)

## Goal

Learn to compare strings correctly and handle null values safely.

## What You'll Do

1. Use `.equals()` for string comparison
2. Practice common string operations
3. Write null-safe checks
4. Optionally throw an exception for missing data

## How to Run It

**This session uses JShell - an interactive Java console.**

1. Open `S02_StringsNull.java` to see the code snippets
2. Open JShell Console: **Tools → JShell Console...**
3. Copy code snippets from the file (remove `//` and `TODO:`)
4. Paste them into JShell and observe results

**Plan B (Scratch File):** Use **New → Scratch File → Java** instead if you prefer

## Expected Output

- `true` for string equality checks
- Results from string operations (contains, startsWith, replace, etc.)
- `false` for null/blank family name check

## If You Get Stuck

**NullPointerException**
- You tried to call a method on `null`
- Always check `!= null` first

**Using `==` for strings**
- Use `.equals()` instead

**Variable already exists error**
- JShell remembers previous variables
- Type `/reset` to start fresh

## Coach Notes

String equality with `.equals()` and null checks are testing fundamentals. This pattern shows up everywhere in automation.

The key pattern: check `!= null` before calling any method.
