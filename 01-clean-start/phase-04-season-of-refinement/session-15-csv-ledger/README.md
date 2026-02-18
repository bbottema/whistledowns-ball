# Session 15 – CSV Ledger

## Goal

Load guest data from a CSV file instead of hardcoding, introducing file I/O and defensive parsing.

## What You'll Do

1. Read a CSV file containing guest information
2. Parse each line into Socialite objects
3. Handle malformed rows gracefully
4. Run the Ball logic on loaded guests

## How to Run It

1. Open all Java files in this session
2. Note the `season-ledger.csv` file
3. Right-click `S15_Demo.java` and run it

## Expected Output

```
Loaded 5 guests from season-ledger.csv
Daphne -> INVITED
Penelope -> NOT INVITED (reasons: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (reasons: [ReputationRule])
Eloise -> INVITED
```

## If You Get Stuck

**FileNotFoundException**
- Make sure `season-ledger.csv` is in the same folder as your Java files

**ArrayIndexOutOfBoundsException**
- Check your string split logic
- Handle rows with wrong number of columns

**NumberFormatException**
- Use Integer.parseInt() carefully
- Handle non-numeric age values

## Coach Notes

File I/O is a core automation skill. Test data often comes from files, not hardcoded values.

This session introduces:
- Reading files with Files.readAllLines()
- Parsing CSV data with String.split()
- Defensive programming (handling bad data)

Keep it simple - no CSV libraries needed. Just split by comma and handle errors.
