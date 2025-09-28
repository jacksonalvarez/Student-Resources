# Lesson 3 Quick Review: Control Flow & Boolean Logic

## Relational Operators

```java
==  // Equal to
!=  // Not equal to
>   // Greater than
<   // Less than
>=  // Greater than or equal
<=  // Less than or equal
```

## Logical Operators

```java
&&  // AND - both must be true
||  // OR - at least one must be true
!   // NOT - flips true/false
```

## If Statements

```java
// Basic if
if (condition) {
    // do something
}

// If-else
if (condition) {
    // do this
} else {
    // do that
}

// If-else if chain
if (condition1) {
    // option 1
} else if (condition2) {
    // option 2
} else {
    // default option
}
```

## Switch Statement

```java
switch (variable) {
    case value1:
        // do something
        break;
    case value2:
        // do something else
        break;
    default:
        // default case
}
```

## Quick Examples

### Age Check

```java
int age = 16;
if (age >= 13 && age <= 19) {
    System.out.println("Teenager");
}
```

### Grade Letter

```java
char grade = 'A';
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    default:
        System.out.println("Keep trying");
}
```

## Common Mistakes to Avoid

- Using `=` instead of `==` for comparison
- Forgetting `break` in switch statements
- Mixing up `&&` (AND) and `||` (OR)

## Key Terms

- **Inclusive**: includes endpoints (1-10 inclusive = 1,2,3...10)
- **Exclusive**: excludes endpoints (1-10 exclusive = 2,3,4...9)

---

_Ready for Lesson 4: Loops!_
