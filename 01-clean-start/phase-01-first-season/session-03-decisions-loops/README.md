# Session 03 – Decisions & Loops (JShell)

## Goal

Use if/else statements and loops to evaluate multiple test cases.

## What You'll Do

1. Write a simple if/else rule
2. Loop over an array of ages
3. Loop over a list of family names

## How to Run It

**This session uses JShell - an interactive Java console.**

1. Open `S03_DecisionsLoops.java` to see the code snippets
2. Open JShell Console: **Tools → JShell Console...**
3. Copy code snippets from the file (remove `//` and `TODO:`)
4. For the List example, paste the import statement first
5. Observe output for each snippet

**Plan B (Scratch File):** Use **New → Scratch File → Java** instead if you prefer

## Expected Output

- "Eligible" or "Not eligible" for a single age
- Multiple lines showing age → eligibility result
- Multiple lines showing family name → respectable result

## If You Get Stuck

**Syntax error in for loop**
- For arrays: `for (int a : ages) { ... }`
- For lists: `for (String f : families) { ... }`

**Cannot find symbol List**
- Add `import java.util.List;` in JShell before using List

**Multi-line code in JShell**
- JShell will show `...>` for continuation lines
- Type the closing brace and press Enter to complete

## Coach Notes

Loops let you run the same check on multiple test cases. This is the foundation of data-driven testing.

You're building test-thinking patterns: given multiple inputs, what are the expected outcomes?
