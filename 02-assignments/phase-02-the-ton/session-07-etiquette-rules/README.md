# Session 07 – Rules as a plug-in system (interfaces)

## What you’ll get out of this

By the end of this session you can:

- describe an interface as a “contract” for checks
- implement two different rule classes that follow the same contract
- loop over a list of rules and apply them to the same test data

## Concepts (quick read, then do the TODOs)

### Interface = contract

Test-analyst translation: we’re making a **standard shape** for checks.
If something is an `S07_EtiquetteRule`, we know we can call:

```java
rule.passes(socialite)
```

### Implementations = actual checks

`S07_AgeRule` and `S07_FamilyNameRule` are two different checks.
They’re different inside, but they *look the same from the outside*.

### Polymorphism = "treat different checks the same way"

That's what lets us put different rule objects in a `List` and loop over them.

Test-analyst translation: imagine you have a checklist where every item has a "pass/fail" checkbox. Each check is different (some check age, some check names), but you can process them all the same way: go through the list, tick each box. That's polymorphism.

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
