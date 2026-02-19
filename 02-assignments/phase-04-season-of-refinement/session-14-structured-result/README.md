# Session 14 – Structured results (more than true/false)

## What you’ll get out of this

By the end of this session you can:

- return a richer result object instead of a plain boolean
- carry both the decision *and* the reasons together
- treat the result like a mini API response (structured, inspectable)

## Concepts (quick read, then do the TODOs)

### Boolean is sometimes too small

`true/false` tells you *what happened*, but not *why*.

### Result object = decision + context

Think:

```java
result.invited
result.reasons
```

Those two pieces belong together, so we bundle them.

## Start here

1. Open `S14_Assignment.java` and follow the TODOs.
2. Implement `InvitationResult` and update the Ball to return it.
3. Run the assignment.

## How to run (IntelliJ)

1. Open `S14_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S14_Assignment.java` and choose **Run 'S14_Assignment.main()'**.

## What “success” looks like

You should see:

```
Daphne -> INVITED
Penelope -> NOT INVITED (reasons: [AgeRule])
Simon -> INVITED
Theo -> NOT INVITED (reasons: [ReputationRule])
```

## Troubleshooting

### “Cannot find InvitationResult”

- Make sure the `InvitationResult` class exists in this session folder.

### Things compile but output is wrong

- Double-check you’re reading `result.invited` (not calling the old boolean API).
