# Session 15 – CSV ledger (load test data from a file)

## What you’ll get out of this

By the end of this session you can:

- load test data from a CSV file (instead of hardcoding)
- parse rows defensively (bad data happens)
- keep the test run going even if one row is messy

## Concepts (quick read, then do the TODOs)

### File I/O is test automation reality

In real projects, test data often comes from files.
This session makes that feel normal.

### Defensive parsing

CSV rows can be:

- missing columns
- having non-numeric ages

Your job: don't crash the whole run because of one bad row.

The safe parsing pattern (illustrative snippet — adjust names to match your code):

```java
String[] parts = line.split(",");
if (parts.length < 3) {
    continue; // skip incomplete rows
}

try {
    int age = Integer.parseInt(parts[1].trim());
    guests.add(new Socialite(parts[0], age, parts[2]));
} catch (NumberFormatException e) {
    // skip rows with bad age data
}
```

This way, one bad row won't kill your entire test run.

## Start here

1. Open `S15_Assignment.java`.
2. Follow the TODO block (uncomment the `try/catch` and loader call).
3. Fix/implement parsing in `S15_GuestLoader` if needed.
4. Run the assignment.

## How to run (IntelliJ)

1. Open `S15_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S15_Assignment.java` and choose **Run 'S15_Assignment.main()'**.

## What “success” looks like

You should see something like:

```
Loaded 5 guests from season-ledger.csv
Daphne -> INVITED
Penelope -> NOT INVITED (reasons: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (reasons: [ReputationRule])
Eloise -> INVITED
```

## Troubleshooting

### `FileNotFoundException`

- Make sure `season-ledger.csv` exists in this session folder.
- IntelliJ tip: your program reads files relative to the **Working directory**.
  - Open **Run → Edit Configurations...**
  - Select your `S15_Assignment` run config
  - Check **Working directory**
  - If needed, set it to the session folder so `season-ledger.csv` can be found

### `ArrayIndexOutOfBoundsException`

- A row didn’t have enough comma-separated columns.
- Fix: check `parts.length` before reading `parts[0]`, `parts[1]`, etc.

### `NumberFormatException`

- Age wasn’t a number.
- Fix: catch it and skip the row (or use a default age).
