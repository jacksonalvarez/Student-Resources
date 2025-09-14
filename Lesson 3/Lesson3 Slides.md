# Lesson 3 Slides: Control Flow & Boolean Logic (Java)

---
## Boolean Expressions & Relational Operators
| Operator | Description | Example | Result |
|----------|-------------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `7 > 2` | `true` |
| `<` | Less than | `4 < 1` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `3 <= 1` | `false` |
---

## If Statements Basic Syntax

```java
if (condition) {
    // code block executed if condition is true
}


if (condition) {
    // code for true
} else {
    // code for false
}


if (condition1) {
    // code for condition1
} else if (condition2) {
    // code for condition2
} else {
    // default code
}
```

---

## Truth Tables

| A | B | A && B |
| - | - | ------ |
| T | T | T      |
| T | F | F      |
| F | T | F      |
| F | F | F      |

## Example Code

```java
int score = 85;
boolean isPassing = score >= 70;
boolean isHonors = score >= 90;

if (isHonors) {
    System.out.println("Excellent work!");
} else if (isPassing) {
    System.out.println("You passed!");
} else {
    System.out.println("Need improvement");
}
```

---

## Switch Statement (basic)

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Unknown day");
}
```

---
## Common Pitfalls
- Using `=` instead of `==` for comparison
- Wrong operator precedence
- Not considering all cases in if-else chains
- Off-by-one errors in comparisons
---

## Practice Problems

1. What does this print?

```java
int x = 5, y = 10;
if (x > 0 && y < 20) {
    System.out.println("A");
} else if (x < 10) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

2. Write an if-else statement that prints "Eligible" if age is between 13 and 19
   (inclusive), otherwise prints "Not eligible". Build the entire file.

   - Start with class definition public class ClassName
   - public static void main
   - inclusive = inlcuding the endpoints (0-100 inclusive = 0,1,2...100)
   - exclusive = excluding the endpoints (0-100 exclusive = 1,2,3...99)

3. Convert the following if-else chain to a switch statement:

```java
char grade = 'B';
if (grade == 'A') System.out.println("Excellent");
else if (grade == 'B') System.out.println("Good");
else if (grade == 'C') System.out.println("Average");
else System.out.println("Needs improvement");
```

---
## Additional Practice Problems
4. Predict the output for the following:
```java
int a = 2, b = 3, c = 4;
if (a + b > c) System.out.println("X");
if (a * b == 6 && c % 2 == 0) System.out.println("Y");
else System.out.println("Z");
```
5. Given boolean flags `isRaining` and `hasUmbrella`, write a statement that prints "Stay dry" only when it's raining and the person has an umbrella; otherwise print "Be careful".
---

## Quick 5-Question Quiz

1. True or False: `5 / 2` in Java yields `2.5`.
2. What is the result of `!(true && false) || false`?
3. Which operator has higher precedence: `&&` or `||`?
4. Fill in the blank: Use `_____` to compare two primitive values for equality.
5. True or False: A `switch` statement can directly use a `double` value in its
   case labels.

---
## Practice Answers & Notes
1. Prints `A` because both conditions are true.
2. Example solution:
```java
int age = 15;
if (age >= 13 && age <= 19) {
    System.out.println("Eligible");
} else {
    System.out.println("Not eligible");
}
```
4. Output is `Y` and `Z` will be printed. `X` is not printed because the first `if` condition is true, and the second `if` condition is false, so it goes to the `else` part of the second `if`.
5. Example solution:
```java
boolean isRaining = true;
boolean hasUmbrella = true;
if (isRaining && hasUmbrella) {
    System.out.println("Stay dry");
} else {
    System.out.println("Be careful");
}
```
---

## Quiz Answers

1. False — `5 / 2` yields `2` (integer division).
2. `true` — inner `true && false` is `false`; `!false` is `true`;
   `true || false` is `true`.
3. `&&` has higher precedence than `||`.
4. `==`.
5. False — `switch` supports `byte`, `short`, `char`, `int`, `String`, and
   enums, not `double`.

---
## Next Lesson Preview
- Loops: `for`, `while`, `do-while`
- Nested loops
- Loop invariants and common patterns
---
