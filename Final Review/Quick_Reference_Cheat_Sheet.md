# Java APCSA Quick Reference Cheat Sheet
## Lessons 1-6 + Number Systems - Test Day Reference

---

## Primitive Data Types
| Type    | Size  | Range/Values        | Example          |
|---------|-------|---------------------|------------------|
| int     | 4 B   | ±2.1 billion        | `int x = 42;`    |
| double  | 8 B   | ±1.8×10³⁰⁸          | `double d = 3.14;`|
| boolean | 1 B   | true/false          | `boolean b = true;`|
| char    | 2 B   | single character    | `char c = 'A';`  |
| byte    | 1 B   | -128 to 127         | `byte b = 100;`  |

**Remember:** String is NOT a primitive (it's a class)!

---

## Operators & Precedence

### Arithmetic Operators
```java
+  -  *  /  %    // % is modulus (remainder)
```

### Precedence (High → Low)
```
1. ()           Parentheses
2. * / %        Multiplication, Division, Modulus
3. + -          Addition, Subtraction
```

### Compound Assignment
```java
x += 5;  // x = x + 5
x -= 3;  // x = x - 3
x *= 2;  // x = x * 2
x /= 4;  // x = x / 4
x++;     // x = x + 1
x--;     // x = x - 1
```

### Integer vs Floating Division
```java
7 / 2       → 3      // int / int = int (truncates!)
7 / 2.0     → 3.5    // int / double = double
(double)7/2 → 3.5    // casting to double
```

---

## Boolean Logic

### Relational Operators
```java
==  !=  >  <  >=  <=
```
**Critical:** Use `==` for comparison, NOT `=` (assignment)!

### Logical Operators
```java
&&  // AND - both must be true
||  // OR  - at least one must be true
!   // NOT - flips boolean value
```

### Truth Table Quick Reference
```java
true  && true  → true     true  || false → true
true  && false → false    false || false → false
!true → false             !false → true
```

---

## Control Flow

### If-Else
```java
if (condition) {
    // code
} else if (condition2) {
    // code  
} else {
    // code
}
```

## Loops

### For Loop
```java
for (int i = 0; i < 10; i++) {
    // code - executes 10 times
}
```

### While Loop (condition checked BEFORE)
```java
while (condition) {
    // code - may not execute at all
}
```


## Arrays

### Declaration & Initialization
```java
int[] arr = new int[5];           // Size 5, all zeros
int[] arr = {10, 20, 30};         // Initialize with values
```

### Key Operations
```java
arr.length           // Size (NO parentheses!)
arr[0]               // First element
arr[arr.length - 1]  // Last element
arr[i] = value;      // Modify element
```

### Common Patterns
```java
// Loop through array
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Find sum
int sum = 0;
for (int num : arr) {
    sum += num;
}

// Find max
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}
```

**Remember:** Arrays are ZERO-INDEXED (first element is [0])!

---

## Object-Oriented Programming

### Class Structure
```java
public class Student {
    // 1. Instance Variables (private!)
    private String name;
    private int age;
    
    // 2. Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // 3. Getters
    public String getName() {
        return name;
    }
    
    // 4. Setters (with validation!)
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    // 5. toString
    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + "]";
    }
}
```

### Creating & Using Objects
```java
Student s = new Student("Alice", 17);
String name = s.getName();
s.setAge(18);
System.out.println(s);  // calls toString()
```

---

### Constructors
- Same name as class, no return type
- Initializes instance variables
- Called with `new` keyword


---

## Common Mistakes

### ❌ WRONG → ✅ CORRECT

```java
// Assignment vs Comparison
if (x = 5)                → if (x == 5)

// Array length
arr.length()              → arr.length

// String comparison
str1 == str2              → str1.equals(str2)

// Integer division
int avg = sum / count     → double avg = (double)sum / count

// Array access
arr[arr.length]           → arr[arr.length - 1]

// Loop condition
i <= arr.length           → i < arr.length

// Public variables
public int age;           → private int age;

// Returning array
return grades;            → return grades.clone();

// Forgetting break
case 1: code; case 2:     → case 1: code; break;
```

---

## Encapsulation Rules

1. ✅ Make instance variables **private**
2. ✅ Provide **public getters** for read access
3. ✅ Provide **public setters** with validation
4. ✅ Return **copies** of arrays (use `.clone()`)

---

## Naming Conventions

```java
public class StudentRecord        // PascalCase for classes
private String firstName;         // camelCase for variables/methods
public void calculateGrade()      // camelCase for methods
boolean isActive;                 // is/has/can for booleans
```

---

## Test Day Tips

### ✓ Before Test
- [ ] Review primitive types table
- [ ] Practice tracing code
- [ ] Memorize common mistakes
- [ ] Review OOP principles

### ✓ During Test
- [ ] Read carefully (= vs ==)
- [ ] Check array bounds
- [ ] Trace loops step-by-step
- [ ] Watch for integer division
- [ ] Verify break in switch
- [ ] Check variable scope

### ✓ Code Tracing Strategy
1. Write variable names
2. Track values after each line
3. Check conditions carefully
4. Note loop iterations

---

## Quick Self-Test

**Can you answer these instantly?**

1. `10 / 3` = ?  _(Answer: 3)_
2. `10 % 3` = ?  _(Answer: 1)_
3. First array index?  _(Answer: 0)_
4. Last array index?  _(Answer: length - 1)_
5. Array length syntax?  _(Answer: arr.length - no parentheses!)_
6. String comparison?  _(Answer: str1.equals(str2))_
7. Constructor return type?  _(Answer: None!)_
8. Should variables be public/private?  _(Answer: private)_
9. `int / int` result type?  _(Answer: int)_

---

## Number Systems

### The Three Systems
| System | Base | Digits | Example |
|--------|------|--------|---------|
| Decimal| 10   | 0-9    | 25₁₀    |
| Binary | 2    | 0-1    | 11001₂  |
| Hex    | 16   | 0-9,A-F| 19₁₆    |

### Binary Place Values (Right to Left)
```
128  64  32  16  8  4  2  1
2⁷   2⁶  2⁵  2⁴  2³ 2² 2¹ 2⁰
```

### Hex Digits to Decimal
```
A=10  B=11  C=12  D=13  E=14  F=15
```

### Quick Conversions

**Binary → Decimal:**
```
1011₂ = 1×8 + 0×4 + 1×2 + 1×1 = 11₁₀
```

**Decimal → Binary (subtract powers of 2):**
```
25 = 16 + 8 + 1 = 11001₂
```

**Binary → Hex (group in 4s from right):**
```
11010110₂ = 1101|0110 = D|6 = D6₁₆
```

**Hex → Decimal:**
```
2A₁₆ = 2×16 + 10 = 42₁₀
```

### Key Patterns
```
1111₂ = F₁₆ = 15₁₀
11111111₂ = FF₁₆ = 255₁₀ (1 byte!)
```

### Powers of 2 to Memorize
```
2¹=2  2²=4  2³=8  2⁴=16  2⁵=32
2⁶=64  2⁷=128  2⁸=256  2¹⁰=1024
```

---

## Emergency Reminders

**If you forget everything else, remember these:**

1. Arrays start at index **0**
2. Use `==` for comparison, `=` for assignment
3. `int / int` gives `int` (truncates)
4. `arr.length` has NO parentheses
5. Instance variables should be **private**
6. Constructor has NO return type
7. Return `arr.clone()` in getters for arrays
8. Always use **break** in switch cases
9. Loop condition: `i < arr.length` NOT `i <= arr.length`
10. Validate input in **setters**
11. **NEW:** Binary grouping for hex: RIGHT to LEFT in groups of 4
12. **NEW:** Hex digits A-F = 10-15 in decimal

---

**Print this sheet and keep it handy during review! 📄**

*For detailed number systems help, see the Visual Guide PDF!*

*Good luck on your test! You've got this! 💪*
