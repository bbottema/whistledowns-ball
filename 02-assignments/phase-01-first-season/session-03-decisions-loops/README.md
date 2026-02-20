# Session 03 – Decisions & Loops (run a Java file)

## What you’ll get out of this

By the end of this session you can:

- write an `if/else` rule (a tiny decision engine)
- run the same check for multiple test cases using a loop
- read the output as a quick “mini test report” (input → result)

## Concepts (quick read, then do the TODOs)

### `if/else` is your branching rule

Think: “if the input matches the rule, pass; otherwise, fail.”

```java
if (age >= 18) {
	System.out.println("Eligible");
} else {
	System.out.println("Not eligible");
}
```

### Loops = data-driven testing

Instead of testing one age, you test a whole list of ages.

```java
for (int a : ages) {
	System.out.println(a + " -> " + (a >= 18));
}
```

That `a -> true/false` output is basically a tiny table of results.

### Imports (only for the List example)

In a Java file, imports go at the top.
If you use `List`, you’ll need:

```java
import java.util.List;
```

## Start here

1. Open `S03_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

## How to run (IntelliJ)

1. Open `S03_Assignment.java`.
2. Uncomment one TODO block at a time.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S03_Assignment.java` and choose **Run**.

## What “success” looks like

You should observe:

1. `Eligible` or `Not eligible` printed for the single-age rule
2. multiple lines like `16 -> false` and `18 -> true` from the ages loop
3. multiple lines mapping each family name to `true/false` for “respectable”

## Troubleshooting

### Syntax errors in a `for` loop

- Arrays: `for (int a : ages) { ... }`
- Lists: `for (String f : families) { ... }`

### “cannot find symbol: List”

- Make sure the file has `import java.util.List;` at the top.

### Code won’t compile

- Missing `{` or `}` is the most common issue in `if` and `for` blocks.
- Fix the red underline, then run again.