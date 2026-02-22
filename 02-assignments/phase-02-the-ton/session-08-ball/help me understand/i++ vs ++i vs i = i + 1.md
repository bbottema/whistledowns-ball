# `i++` vs `++i` vs `i = i + 1`

You’ll often see these inside loops:

- `i++`
- `++i`
- `i = i + 1`
- `i += 1`

They all **increase `i` by 1**.

In this course, you can safely treat them as “move to the next number”.

## The simplest mental model

If your code says:

```java
i = i + 1;
```

Read it as:

> take the current value of `i`, add 1, and store it back in `i`

That’s the clearest form, and it works everywhere.

## The short forms

### `i += 1`

Same meaning as `i = i + 1`, just shorter:

```java
i += 1;
```

### `i++` (post-increment)

Also increases `i` by 1:

```java
i++;
```

In a normal `for` loop, this is the most common style:

```java
for (int i = 0; i < n; i++) {
    // ...
}
```

## `i++` vs `++i` (why are there two?)

Both forms **increment `i`**, but they differ in what value the expression produces **at that exact moment**.

### When it usually does *not* matter

In loop updates like this:

```java
for (int i = 0; i < n; i++) {
    // ...
}
```

…`i++` and `++i` behave the same for the loop control.

### When it *does* matter (you don't need to know this for the course)

If you use the increment *inside a bigger expression*, the timing matters:

```java
int i = 0;
int a = i++; // a gets 0, then i becomes 1
int b = ++i; // i becomes 2, then b gets 2
```

- `i++` returns the **old** value, then increments.
- `++i` increments first, then returns the **new** value.

## Course recommendation

- Prefer `i++` in the *update* part of a `for` loop.
- Prefer `i = i + 1` (or `i += 1`) everywhere else.
