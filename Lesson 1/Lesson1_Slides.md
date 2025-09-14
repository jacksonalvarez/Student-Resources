# Lesson 1 Slides: Primitives & Expressions (Java)

---
## Java Primitive Data Types (APCSA Reference)
| Type    | Size (bits) | Size (bytes) | Min Value                | Max Value                 |
|---------|-------------|--------------|--------------------------|---------------------------|
| byte    | 8           | 1            | -128                     | 127                       |
| short   | 16          | 2            | -32,768                  | 32,767                    |
| int     | 32          | 4            | -2,147,483,648           | 2,147,483,647             |
| long    | 64          | 8            | -9,223,372,036,854,775,808| 9,223,372,036,854,775,807 |
| float   | 32          | 4            | ~1.4E-45                 | ~3.4E+38                  |
| double  | 64          | 8            | ~4.9E-324                | ~1.8E+308                 |
| char    | 16          | 2            | '\u0000' (0)             | '\uffff' (65,535)         |
| boolean | 1 (not precise) | JVM dependent | true/false           | true/false                |
**Note:** For `boolean`, use 1 byte for APCSA exam purposes; only values are `true` and `false`.
---

## What are Primitives?

- int: whole numbers (e.g., 5, -2)
- double: decimals (e.g., 3.14, -0.5)
- boolean: true/false

---
## Arithmetic Operators
- Addition: +
- Subtraction: -
- Multiplication: *
- Division: /
- Modulus (remainder): %
---

## Operator Precedence

- Multiplication/division before addition/subtraction
- Use parentheses to control order

---
## Integer vs. Floating-point Division
- int / int → int (truncates)
- double / int or int / double → double
---

## Example

```java
int a = 7, b = 2;
System.out.println((a + b) / 2);   // 4
System.out.println((a + b) / 2.0); // 4.5
```

---
## Boolean Expressions
- Compare values: >, <, >=, <=, ==, !=
- Result is true or false
---

## Key Takeaways

- Know your data types
- Predict results before running code
- Use parentheses for clarity
