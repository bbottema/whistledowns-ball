# Session 17 – Human-readable reports (make output pleasant)

## What you’ll get out of this

By the end of this session you can:

- print a more professional-looking report (aligned columns)
- add a header/footer and summary numbers
- use formatting as a test automation skill (readability matters)

## Concepts (quick read, then do the TODOs)

### `String.format` = alignment + consistency

Rule of thumb:

- `%s` for strings
- `%d` for integers
- `%-18s` means "left-align in an 18-character column"
- `%18s` (no `-`) means "right-align in an 18-character column"

The `-` controls alignment. Use left-align for text, right-align for numbers (it looks more professional).

## Start here

1. Open `S17_Assignment.java`.
2. Uncomment the TODO blocks in order.
3. Run it.

## How to run (IntelliJ)

1. Open `S17_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S17_Assignment.java` and choose **Run 'S17_Assignment.main()'**.

## What “success” looks like

You should see a report similar to:

```
========================================
   Whistledown's Society Report
========================================
Name              Age  Family           Status
--------------------------------------------------
Daphne             21  Bridgerton       INVITED
Penelope           16  Featherington    NOT INVITED
Simon              28  Basset           INVITED
Theo               21  Sharpe           NOT INVITED
--------------------------------------------------
Total Guests: 4
Invited: 2
Rejected: 2
========================================
```

## Troubleshooting

### Columns look messy

- Recheck your widths (the number in `%-18s`).
- Make sure you’re using the same format string for each row.