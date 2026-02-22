# Interfaces (contract vs promise)

## The tester-friendly idea

An **interface** is like a **contract**.

It says:

> “If you claim you are this kind of thing, you must provide these methods.”

In this session, the interface is the shared shape for a rule/check.

### The contract (the interface)

`S07_EtiquetteRule` is the contract.
It lists the methods every rule must have:

- `passes(socialite)` → does this rule pass for this guest?
- `name()` → what should we call this rule in output?

## Implementations = real checks

When a class says:

```java
class S07_AgeRule implements S07_EtiquetteRule {
    // ...
}
```

Read it as:

> “I **promise** I follow the contract.”

That means Java will require that `S07_AgeRule` has *all* the methods from the interface.

## Why testers care

Because the contract lets you treat different rules the same way:

```java
for (S07_EtiquetteRule rule : rules) {
    System.out.println(rule.name() + " -> " + rule.passes(guest));
}
```

You don’t need `if (rule is AgeRule) ...`.
You can loop over a list of rules and run them all.

## Common compiler error (and what it means)

### “does not implement abstract method …”

This error usually means:

- your class says `implements S07_EtiquetteRule`
- but you forgot to write one of the required methods (or the method is different somehow)

Fix: implement **both** methods exactly as the interface declares them.