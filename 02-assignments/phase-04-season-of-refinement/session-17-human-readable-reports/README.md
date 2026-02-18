# Session 17 – Human Readable Reports

## Goal

Improve output formatting with professional-looking reports using String formatting.

## What You'll Do

1. Use String.format() for aligned columns
2. Add a report header and footer
3. Calculate and display summary statistics
4. Create polished, readable output

## How to Run It

1. Open all Java files in this session
2. Right-click `S17_Demo.java` and run it

## Expected Output

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

## If You Get Stuck

**String.format() syntax**
- Use `%s` for strings
- Use `%d` for integers
- Use `%-20s` for left-aligned with width 20

**Alignment issues**
- Check your format string width specifications

## Coach Notes

Professional output matters in automation. Well-formatted reports are easier to read and understand.

String.format() is a powerful tool for creating aligned, readable output - essential for test reports.
