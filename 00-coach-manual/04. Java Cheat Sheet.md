# Java Cheat Sheet

Keep this page. It's your quick reminder of the stuff you already know.

## Variables + print

```java
int x = 5;
String s = "OK";
boolean flag = true;
System.out.println(s);
```

## Text equality + null safety

```java
s.equals("OK");
family != null && !family.isBlank();
```

## If/Else + loops

```java
if (cond) { ... } else { ... }
```

```java
for (int i = 0; i < n; i++) { ... }
```

```java
for (String v : values) { ... }
```

## Class + constructor

```java
class Socialite {
    String name;
    int age;
    Socialite(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

## Interface + implementations

```java
interface EtiquetteRule {
    boolean passes(Socialite s);
}
```

## Ball orchestrates rules

```java
class Ball {
    List<EtiquetteRule> rules;
    boolean mayAttend(Socialite s) { ... }
}
```

## Throwing a failure

```java
throw new RuntimeException("message");
throw new AssertionError("message");
```
Mental model: Java is structured rule evaluation. Errors are feedback. Boilerplate is a wrapper. Simon passes.

Java Warm-up Fridays • Course 14–16 April 2026
