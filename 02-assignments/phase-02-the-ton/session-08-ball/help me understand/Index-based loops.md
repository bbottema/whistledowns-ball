# Index-based loops (the “traditional” `for` loop)

You’ve already seen the **for-each** loop:

```java
for (S08_Socialite someGuest : guests) {
    // use someGuest
}
```

That loop is great when you only care about **each item**.

Sometimes, especially when printing a small report, you also care about the **position** of the item (its *index*).
Example: printing `1. Daphne -> INVITED`, `2. Penelope -> NOT INVITED`, etc.

That’s when an **index-based** loop is useful:

```java
for (int i = 0; i < guests.size(); i++) {
    S08_Socialite g = guests.get(i);
    int number = i + 1;
    System.out.println(number + ". " + g.name);
}
```

A lot of things come together here!

## How to read it

- `int i = 0`  → start at the first position (index 0)
- `i < guests.size()` → keep going while `i` is still inside the list (remember what a method is?)
- `i++` → move to the next index (`0, 1, 2, 3, ...`)
  - If `i++` looks unfamiliar, read: [`i++ vs ++i vs i = i + 1.md`](i%2B%2B%20vs%20%2B%2Bi%20vs%20i%20%3D%20i%20%2B%201.md)
- `guests.get(i)` → get the item at position `i` (another method call, this time with an argument)

## Common patterns

### Numbered output (1, 2, 3…)

Humans usually count from 1, but lists start at index 0.
So you often print `i + 1`.

### Skip the first item

Sometimes the first line is a header (common in CSV files).
Then you can start at index 1:

```java
for (int i = 1; i < lines.size(); i++) {
    String line = lines.get(i);
    // ...
}
```

## When should I use which loop?

- Prefer **for-each** when you just need each element.
- Use **index-based** loops when you need:
  - the element’s position (index)
  - to access two lists by the same index
  - to skip specific positions (like a header row)
