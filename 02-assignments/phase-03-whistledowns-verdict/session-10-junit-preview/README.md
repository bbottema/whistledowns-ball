# Session 10 – JUnit preview (read-only)

This session is a preview. We’re **not** setting up JUnit in this warmup repo.
The goal is simply: when you meet JUnit in the real course, it won’t feel like a foreign language.

## What you’ll get out of this

By the end of this session you can:

- recognise the basic shape of a JUnit test
- map it to a testing workflow you already know (Arrange → Act → Assert)
- recognise the most common annotations and assertions (`@Test`, `assertTrue`, `assertFalse`)

## Concepts (quick read, then do the TODOs)

### `@Test` marks a test

JUnit runs methods annotated with `@Test`.

### Assertions are built-in

Instead of writing your own `MiniAsserts`, JUnit gives you:

```java
assertTrue(...)
assertFalse(...)
assertEquals(...)
```

### Tests should be independent

Each test sets up its own data.
If one test fails, the others should still be able to run.

## Start here

Open `S10_Assignment.java` and read the example.
That file is the entry point for this session.

## How to run

You don’t run this session inside this warmup project.
It’s intentionally read-only.

## What “success” looks like

Success is: you can look at the code and say:

- “Ah, this is a test method.”
- “This part is setup (arrange).”
- “This is the check (assert).”

## Troubleshooting

### “But I want to run it!”

Totally fair.
You’ll run JUnit for real in the course project where it’s properly configured.
