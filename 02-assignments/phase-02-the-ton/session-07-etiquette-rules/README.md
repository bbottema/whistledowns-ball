# Session 07 – Etiquette Rules

## Goal

Introduce interfaces and multiple rule implementations.

## What You'll Do

1. Define an EtiquetteRule interface
2. Implement AgeRule and FamilyNameRule
3. Apply multiple rules to a Socialite using polymorphism

## How to Run It

1. Open all Java files in this session
2. Right-click `S07_Demo.java` and run it

## Expected Output

```
AgeRule -> true
FamilyNameRule -> true
```

## If You Get Stuck

**"S07_Socialite does not exist"**
- Make sure the Socialite class is defined in this session

**"Does not implement abstract method"**
- Ensure your rule classes implement all methods from EtiquetteRule

## Coach Notes

An interface is a contract: "Any rule must have these methods."

Implementations are concrete: "Here's how this specific rule works."

Polymorphism means you can treat different rules the same way (loop over them, store them in a list) because they all follow the same contract.
