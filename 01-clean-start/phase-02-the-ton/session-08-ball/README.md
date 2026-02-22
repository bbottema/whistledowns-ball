# Session 08 – The Ball: a coordinator (apply rules to test data)

## What you’ll get out of this

By the end of this session you can:

- store a list of rules inside another class
- implement “all rules must pass” logic
- print a simple registry (basically a tiny report)

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs.
In this session you're wiring the pieces together: a `Ball` holds a list of rules and uses them to decide who is invited.

If you want a quick explanation of the “traditional” `for (int i = 0; ...)` loop shape, read:

- [`help me understand/Index-based loops.md`](help%20me%20understand/Index-based%20loops.md)

### The `Ball` class = a mini test runner/coordinator

In tester terms:

- input = guests (your test data)
- checks = rules
- output = printed report in the Run window

### “All rules must pass”

The logic for `mayAttend` is:

```java
for (S08_EtiquetteRule rule : rules) {
	if (!rule.passes(socialite)) {
		return false;
	}
}
return true;
```

## Start here

1. Open `S08_Ball.java` and implement the TODOs.
2. Open `S08_Assignment.java` and uncomment the TODOs.
3. Run the demo.

## How to run (IntelliJ)

1. Open `S08_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S08_Assignment.java` and choose **Run 'S08_Assignment.main()'**.

## What “success” looks like

You should see:

```
Daphne -> INVITED
Penelope -> NOT INVITED
Simon -> INVITED
```

## Troubleshooting

### Output is wrong

Sanity-check `mayAttend`:

- you must loop over **all** rules
- return `false` as soon as any rule fails
- only return `true` if none fail

Common bug: returning `true` *inside* the loop. That makes you stop after the first rule.

### “cannot find symbol: S08_Ball” (or similar)

- Make sure you’re editing files in *this* session folder.
- Make sure the `S08_Ball` class is not commented out.
