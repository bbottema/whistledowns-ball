# Session 11 – Reputation map (data-driven rules)

## What you’ll get out of this

By the end of this session you can:

- use a `Map` as a lookup table (key → value)
- treat rule data as *test data* (separate from your logic)
- handle “unknown key” safely (no surprise `NullPointerException`)

## Concepts (quick read, then do the TODOs)

### Map = lookup table

In testing terms: a `Map` is a tiny in-memory data source.

```java
Integer rep = reputations.get("Basset");
```

### `get(...)` can return `null`

If the key doesn't exist, `Map.get(...)` returns `null`.
That's not a crash by itself — it's a signal that your data is missing.

The safe pattern for handling unknown keys:

```java
Integer rep = reputations.get(familyName);
if (rep == null) {
    return false; // unknown family = not eligible
}
return rep >= threshold;
```

Or as a one-liner: `return rep != null && rep >= threshold;`

### Data-driven rule

Your `ReputationRule` uses the map as input.
That’s the point: change the data, change the behaviour.

## Start here

1. Open `S11_Assignment.java` and follow the TODOs.
2. Implement any missing TODOs in the supporting classes (the rule + ball).
3. Run the assignment.

## How to run (IntelliJ)

1. Open `S11_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S11_Assignment.java` and choose **Run 'S11_Assignment.main()'**.

## What “success” looks like

You should observe:

```
10
2
null
Simon -> INVITED
Theo -> NOT INVITED
```

## Troubleshooting

### `NullPointerException` in `ReputationRule`

- `reputations.get(...)` returned `null` and you treated it like a number.
- Fix: decide what “unknown family” means (usually: fail the rule).

### Import errors

- If `Map` is red, add `import java.util.Map;`.
