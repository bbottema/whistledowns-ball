# Session 06 – Socialite Class

## Goal

Create a Socialite class to structure guest data.

## What You'll Do

1. Define the Socialite class with fields and constructor
2. Add methods to check eligibility rules
3. Create Socialite objects and test them

## How to Run It

1. Open `S06_Socialite.java` and `S06_Demo.java`
2. Right-click `S06_Demo.java` and run it

## Expected Output

```
true
false
true
```

## If You Get Stuck

**"Constructor Socialite in class Socialite cannot be applied"**
- Check that you're passing the right number and types of arguments

**NullPointerException in methods**
- Make sure familyName is checked for null before calling methods

## Coach Notes

Classes group related data together. Instead of passing three separate parameters, you pass one Socialite object.

Methods on the class (like `isOfAge()`) operate on that object's data. This is object-oriented thinking.
