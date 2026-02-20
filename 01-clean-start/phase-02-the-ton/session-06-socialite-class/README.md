# Session 06 – A class: your first “test data object”

## What you’ll get out of this

By the end of this session you can:

- group related data into one object (name + age + familyName)
- create objects using `new`
- run simple checks *on* that object (instead of passing 3 separate parameters everywhere)
- read constructor/method errors as useful signals (not blame)

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs.
In this session, you're going to build one small data object (`S06_Socialite`) and then run checks on it from `S06_Assignment`.

### A class = a place to keep related test data together

Instead of passing `name`, `age`, and `familyName` as 3 separate values everywhere,
you put them into one object and pass that object around.

In tester terms: it's a tiny "test data record".

### Constructor = the "setup" step when you do `new`

In `S06_Assignment.java` you'll see a line like:

```java
new S06_Socialite("Daphne", 21, "Bridgerton")
```

When that line doesn't compile, don't panic: it's usually just "the constructor parameters in `S06_Socialite` don't match how it's being called".
Your job in the TODOs is to make the `S06_Socialite` constructor match the usage in the assignment.

### Methods = reusable checks you can print as `true/false`

`isOfAge()` and `hasRespectableFamily()` are small checks.
When you run `S06_Assignment`, the output (`true`/`false`) is your mini test report.

## Start here

1. Open `S06_Socialite.java`.
2. Follow the numbered TODOs.
3. Then open `S06_Assignment.java` and uncomment the TODOs to run the checks.

## How to run (IntelliJ)

Run the demo:

1. Open `S06_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S06_Assignment.java` and choose **Run 'S06_Assignment.main()'**.

## What “success” looks like

When you run `S06_Assignment`, you should see:

```
true
false
true
```

## Troubleshooting

### “constructor S06_Socialite … cannot be applied”

- You called `new S06_Socialite(...)` with the wrong number/type of arguments.
- Fix: make sure your constructor parameters match the usage in `S06_Assignment.java`.

### `NullPointerException` in `hasRespectableFamily()`

- You probably did `familyName.isBlank()` without checking for `null`.
- Fix: use `familyName != null && !familyName.isBlank()`.
