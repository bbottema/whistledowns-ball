# Session 11 – Map & Reputation

## Goal

Introduce data-driven validation using a Map to store reputation scores.

## What You'll Do

1. Create a Map of family names to reputation scores
2. Test Map lookups
3. Add Theo Sharpe (fails on reputation, not age)
4. Implement ReputationRule
5. Add the rule to the Ball

## How to Run It

1. Open all Java files in this session
2. Right-click `S11_Demo.java` and run it

## Expected Output

```
10
2
null
Simon -> INVITED
Theo -> NOT INVITED
```

## If You Get Stuck

**NullPointerException in ReputationRule**
- Check if the Map.get() returned null
- Handle unknown families properly

**Import error**
- Add `import java.util.Map;` at the top

## Coach Notes

Map is like a lookup table or dictionary: given a key, get a value.

This is data-driven testing: your rule uses test data (the reputation map) to make decisions. Separate logic from data.
