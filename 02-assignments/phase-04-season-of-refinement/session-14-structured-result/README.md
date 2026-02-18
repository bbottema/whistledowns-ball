# Session 14 – Structured Result

## Goal

Replace simple boolean returns with a structured result object that carries both the decision and the reasons.

## What You'll Do

1. Create an InvitationResult class to hold invitation status and reasons
2. Modify Ball to return InvitationResult instead of boolean
3. Update the demo to use the structured result

## How to Run It

1. Open all Java files in this session
2. Right-click `S14_Demo.java` and run it

## Expected Output

```
Daphne -> INVITED
Penelope -> NOT INVITED (reasons: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (reasons: [ReputationRule])
```

## If You Get Stuck

**"Cannot find InvitationResult"**
- Make sure the InvitationResult class is in the same folder

**Logic errors**
- Check that mayAttend() now returns InvitationResult
- Use result.invited to check invitation status

## Coach Notes

This is a key automation pattern: instead of just true/false, return a rich object that explains itself.

In real testing, API responses often return structured data. This prepares that mindset.

The pattern: bundle data that belongs together into one object.
