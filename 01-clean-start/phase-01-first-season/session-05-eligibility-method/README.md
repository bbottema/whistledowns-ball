# Session 05 – Your first reusable check (a method)

## What you’ll get out of this

By the end of this session you can:

- write a method that returns `true`/`false` (hello, reusable validation)
- treat the method like a tiny “business rule” you can test with multiple inputs
- run the program and read the output as a mini test report

## Concepts (quick read, then do the TODOs)

### A method is a named rule

You're going to implement:

```java
static boolean isEligible(int age, String familyName)
```

Think of it as: "given this input, what should the outcome be?"

**About `static`**: This keyword means "this method belongs to the class itself, not to a specific object". You can call it directly without creating an object first (e.g., `isEligible(21, "Bridgerton")`). In test automation terms: it's a utility function you can call anytime.

### Return `true/false` like a test result

- `true` means: eligible
- `false` means: not eligible

For this session, the rule is:

- age must be **18+**
- family name must be **not null and not blank**

## Start here

1. Open `S05_Assignment.java`.
2. Follow the TODO blocks **in order**.

## How to run (IntelliJ)

1. Uncomment (or write) the `isEligible(...)` method.
2. Uncomment the `System.out.println(...)` calls in `main`.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside the file and choose **Run 'S05_Assignment.main()'**.

## What “success” looks like

You should see exactly:

```
true
false
false
false
```

## Troubleshooting

### “cannot resolve symbol isEligible”

- The method is still commented out, or the name/signature doesn’t match.
- Fix: ensure the method name is `isEligible` and it has `(int age, String familyName)`.

### Output doesn’t match

Sanity-check the rule:

- `age < 18` → `false`
- `familyName == null` → `false`
- `familyName.isBlank()` → `false`