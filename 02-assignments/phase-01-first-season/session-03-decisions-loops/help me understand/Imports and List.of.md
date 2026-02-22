# Imports and `List.of(...)` (Session 03)

In Session 03 you’ll see this line:

```java
List<String> families = List.of("Bridgerton", "", "Featherington");
```

Two things can feel surprising for beginners:

1. What is `List`?
2. Why do I need an `import`?

## What is `List`?

A `List` is just a container that holds multiple values.

Tester translation:

> A list of test inputs.

As before with `Integer`, `String`, and `Boolean`, you define it by starting with the type of values it holds,
followed by the name you want to give it and optionally a value to start with.

In this session, we use it only so we can loop over multiple sample family names.

## Why do I need an import?

Java keeps some classes in packages (namespaces).

`List` lives in the package `java.util`.

So you add this line near the top of the file:

```java
import java.util.List;
```

That tells Java: “I want to use `List` from `java.util` in this file.”

Tip (not needed for assignment): with _packages_, you can have the same name like `"List"` in different packages. 
If you use code from someone else which also provides a `List`, the Java compiler will know which one to use!

## What does `List.of(...)` mean?

`List.of(...)` is a quick way to create a small list.

You can read it as:

> “Make a list containing these items.”

Example:

```java
List<Integer> ages = List.of(16, 18, 21);
```

## Common error

If you see:

- `cannot find symbol: List`

It almost always means the import line is missing or still commented out.
