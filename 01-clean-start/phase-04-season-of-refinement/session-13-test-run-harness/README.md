# Session 13 – Test run harness (Arrange → Act → Assert → Report)

## What you’ll get out of this

By the end of this session you can:

- write a tiny automation-style “test run” in plain Java
- organise your code into Arrange / Act / Assert / Report sections
- treat failures as useful output (the harness tells you what didn’t match)

## Concepts (quick read, then do the TODOs)

### AAA is a readability superpower

Even without JUnit, you can structure your checks like tests:

- **Arrange**: build test data and system under test
- **Act**: run the behaviour
- **Assert**: compare expected vs actual
- **Report**: print a summary

## Start here

1. Open `S13_Assignment.java`.
2. Follow the TODO blocks in order.
3. Run it.

## How to run (IntelliJ)

1. Open `S13_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S13_Assignment.java` and choose **Run 'S13_Assignment.main()'**.

## What “success” looks like

You should see:

```
Registry checks: PASS
```

## Troubleshooting

### `AssertionError`

- One of your expectations didn’t match.
- Check your test data and the rule logic.
