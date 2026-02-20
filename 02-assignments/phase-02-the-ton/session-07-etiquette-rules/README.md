# Session 07 – Rules as a checklist (interfaces)

## What you’ll get out of this

By the end of this session you can:

- describe an interface as a shared shape for checks
- implement two different rule classes that follow the same interface
- loop over a list of rules and apply them to the same test data

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs.
You are building a small "rule checklist": multiple checks that can all be run the same way.

### An interface = "one standard shape" for a check

In `S07_EtiquetteRule.java` you'll define the interface.
The important part is what it lets you do later: if something is an `S07_EtiquetteRule`, you can call the same methods on it every time.

For example:

```java
rule.passes(socialite)
```

In tester terms: every rule has a "pass/fail" checkbox.

### Implementations = the real checks you'll run

`S07_AgeRule` and `S07_FamilyNameRule` are two different rules.
They do different logic inside, but they both follow the same interface.

That means `S07_Assignment` can put them in a list and loop over them without special-casing each rule.

## Start here

1. Open `S07_EtiquetteRule.java` and define the interface.
2. Implement `S07_AgeRule` and `S07_FamilyNameRule`.
3. Open `S07_Assignment.java` and uncomment the TODOs.

## How to run (IntelliJ)

1. Open `S07_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S07_Assignment.java` and choose **Run 'S07_Assignment.main()'**.

## What “success” looks like

When you run `S07_Assignment`, you should see:

```
AgeRule -> true
FamilyNameRule -> true
```

## Troubleshooting

### “does not implement abstract method …”

- Your rule class implements the interface, but you didn’t implement *all* methods.
- Fix: implement both `passes(...)` and `name()`.

### “cannot find symbol: S07_EtiquetteRule” (or similar)

- The interface is still commented out.
- Fix: uncomment/implement the interface in `S07_EtiquetteRule.java`.
