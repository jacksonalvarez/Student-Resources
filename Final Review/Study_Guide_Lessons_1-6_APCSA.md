# APCSA Java Programming Study Guide
## Comprehensive Review: Lessons 1-6 + Number Systems

**Test Date: Next Week**  
**Topics Covered:** Primitives, Variables, Control Flow, Loops, Arrays, Object-Oriented Programming, Number Systems

---

## 📋 Table of Contents
1. [Lesson 1: Primitives & Expressions](#lesson-1-primitives--expressions)
2. [Lesson 2: Variables & Assignment](#lesson-2-variables--assignment)
3. [Lesson 3: Control Flow & Boolean Logic](#lesson-3-control-flow--boolean-logic)
4. [Lesson 4: Loops & Iteration](#lesson-4-loops--iteration)
5. [Lesson 5: Arrays](#lesson-5-arrays)
6. [Lesson 6: Classes & Objects (OOP)](#lesson-6-classes--objects-oop)
7. [Lesson 7: Number Systems (Binary, Decimal, Hexadecimal)](#lesson-7-number-systems-binary-decimal-hexadecimal)
8. [The Big Four OOP Methods](#the-big-four-oop-methods)
9. [Quick Reference Tables](#quick-reference-tables)
10. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
11. [Practice Problems](#practice-problems)

---

## Lesson 1: Primitives & Expressions

### Java Primitive Data Types
| Type    | Size (bits) | Size (bytes) | Min Value                  | Max Value                   | Example |
|---------|-------------|--------------|----------------------------|-----------------------------|---------|
| byte    | 8           | 1            | -128                       | 127                         | `byte b = 100;` |
| short   | 16          | 2            | -32,768                    | 32,767                      | `short s = 1000;` |
| int     | 32          | 4            | -2,147,483,648             | 2,147,483,647               | `int i = 42;` |
| long    | 64          | 8            | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807   | `long l = 1000L;` |
| float   | 32          | 4            | ~1.4E-45                   | ~3.4E+38                    | `float f = 3.14f;` |
| double  | 64          | 8            | ~4.9E-324                  | ~1.8E+308                   | `double d = 3.14159;` |
| char    | 16          | 2            | '\u0000' (0)               | '\uffff' (65,535)           | `char c = 'A';` |
| boolean | 1*          | 1 (for APCSA)| true/false                 | true/false                  | `boolean b = true;` |

**Key Points:**
- String is NOT a primitive type (it's a class)
- Use `double` for decimal numbers (most common)
- Use `int` for whole numbers (most common)
- `boolean` only has two values: `true` and `false`

### Arithmetic Operators
```java
+  // Addition
-  // Subtraction
*  // Multiplication
/  // Division
%  // Modulus (remainder)
```

### Operator Precedence (PEMDAS)
1. **Parentheses** `()`
2. **Multiplication/Division/Modulus** `* / %` (left to right)
3. **Addition/Subtraction** `+ -` (left to right)

```java
int result = 5 + 3 * 2;      // 11 (not 16!)
int result = (5 + 3) * 2;    // 16 (use parentheses!)
```

### Integer vs. Floating-Point Division
```java
int a = 7, b = 2;
System.out.println(a / b);        // 3 (integer division - truncates)
System.out.println(a / 2.0);      // 3.5 (floating-point division)
System.out.println((double)a / b);// 3.5 (casting to double)
```

**REMEMBER:** `int / int → int` (truncates), but `double / int` or `int / double → double`

### Modulus Examples
```java
10 % 3  // 1 (10 divided by 3 is 3 remainder 1)
15 % 4  // 3 (15 divided by 4 is 3 remainder 3)
20 % 5  // 0 (20 divided by 5 is 4 remainder 0)
7 % 2   // 1 (odd number check)
8 % 2   // 0 (even number check)
```

---

## Lesson 2: Variables & Assignment

### Variable Declaration & Initialization
```java
// Declaration only
int x;

// Initialization
x = 10;

// Declaration + Initialization
int y = 20;

// Multiple declarations
int a, b, c;
int num1 = 5, num2 = 10;
```

### Assignment Operator
```java
int score = 0;
score = 10;           // Assigns 10 to score
score = score + 5;    // score is now 15
```

### Compound Assignment Operators
```java
x += 5;   // Same as: x = x + 5
x -= 3;   // Same as: x = x - 3
x *= 2;   // Same as: x = x * 2
x /= 4;   // Same as: x = x / 4
x %= 3;   // Same as: x = x % 3
```

### Increment/Decrement Operators
```java
int x = 5;
x++;      // x is now 6 (post-increment)
++x;      // x is now 7 (pre-increment)
x--;      // x is now 6 (post-decrement)
--x;      // x is now 5 (pre-decrement)
```

---

## Lesson 3: Control Flow & Boolean Logic

### Relational Operators
| Operator | Description              | Example   | Result  |
|----------|--------------------------|-----------|---------|
| `==`     | Equal to                 | `5 == 5`  | `true`  |
| `!=`     | Not equal to             | `5 != 3`  | `true`  |
| `>`      | Greater than             | `7 > 2`   | `true`  |
| `<`      | Less than                | `4 < 1`   | `false` |
| `>=`     | Greater than or equal    | `5 >= 5`  | `true`  |
| `<=`     | Less than or equal       | `3 <= 1`  | `false` |

**CRITICAL:** Use `==` for comparison, NOT `=` (which is assignment)

### Logical Operators
| Operator | Name        | Description                    | Example               |
|----------|-------------|--------------------------------|-----------------------|
| `&&`     | AND         | Both must be true              | `(x > 0 && y < 10)`   |
| `||`     | OR          | At least one must be true      | `(x < 0 || y > 10)`   |
| `!`      | NOT         | Negates the boolean value      | `!(x == 5)`           |

### Truth Tables

**AND (&&)**
| A     | B     | A && B |
|-------|-------|--------|
| true  | true  | true   |
| true  | false | false  |
| false | true  | false  |
| false | false | false  |

**OR (||)**
| A     | B     | A \|\| B |
|-------|-------|----------|
| true  | true  | true     |
| true  | false | true     |
| false | true  | true     |
| false | false | false    |

**NOT (!)**
| A     | !A    |
|-------|-------|
| true  | false |
| false | true  |

### If Statements

**Basic If:**
```java
if (condition) {
    // executed if condition is true
}
```

**If-Else:**
```java
if (condition) {
    // executed if true
} else {
    // executed if false
}
```

**If-Else-If Chain:**
```java
if (condition1) {
    // executed if condition1 is true
} else if (condition2) {
    // executed if condition2 is true
} else {
    // executed if all conditions are false
}
```

**Example:**
```java
int score = 85;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");  // This executes!
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```

### Switch Statements
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

**Important:**
- Don't forget `break;` statements
- Switch works with: int, byte, short, char, String (Java 7+), enums
- Switch does NOT work with: double, float, long, boolean

---

## Lesson 4: Loops & Iteration

### For Loop
```java
for (initialization; condition; update) {
    // loop body
}

// Example:
for (int i = 0; i < 5; i++) {
    System.out.println(i);  // prints 0, 1, 2, 3, 4
}
```

**Components:**
1. **Initialization:** `int i = 0` (runs once at start)
2. **Condition:** `i < 5` (checked before each iteration)
3. **Update:** `i++` (runs after each iteration)

### While Loop
```java
while (condition) {
    // loop body
}

// Example:
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

**Key:** Condition is checked BEFORE the body executes (may not run at all)

### Do-While Loop
```java
do {
    // loop body
} while (condition);

// Example:
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

**Key:** Body executes AT LEAST ONCE, then condition is checked

### Enhanced For Loop (For-Each)
```java
int[] numbers = {2, 4, 6, 8, 10};
for (int num : numbers) {
    System.out.println(num);
}
```

**Use when:** You need to iterate through all elements but don't need the index

### Nested Loops
```java
for (int row = 0; row < 3; row++) {
    for (int col = 0; col < 4; col++) {
        System.out.print("(" + row + "," + col + ") ");
    }
    System.out.println();
}

// Output:
// (0,0) (0,1) (0,2) (0,3)
// (1,0) (1,1) (1,2) (1,3)
// (2,0) (2,1) (2,2) (2,3)
```

### Loop Patterns

**Sum of Numbers:**
```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println(sum);  // 5050
```

**Factorial:**
```java
int n = 5;
int factorial = 1;
for (int i = 2; i <= n; i++) {
    factorial *= i;
}
System.out.println(factorial);  // 120
```

**Count Down:**
```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
System.out.println("Blastoff!");
```

---

## Lesson 5: Arrays

### What is an Array?
- Fixed-size collection of elements of the SAME type
- Stored in contiguous memory locations
- Access elements using zero-based index

### Array Declaration & Initialization

**Method 1: Declare size, then assign values**
```java
int[] numbers = new int[5];  // Creates array of 5 integers (all 0)
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

**Method 2: Initialize with values**
```java
int[] scores = {85, 92, 78, 96, 88};
String[] names = {"Alice", "Bob", "Charlie"};
```

**Method 3: Alternative syntax**
```java
int numbers[] = new int[5];  // Also valid, but less common
```

### Accessing Array Elements
```java
int[] grades = {90, 85, 92, 78, 96};

int first = grades[0];     // 90 (first element)
int third = grades[2];     // 92 (third element)
int last = grades[4];      // 96 (last element)

grades[1] = 88;            // Change second element to 88
```

### Array Length
```java
int[] arr = {10, 20, 30, 40, 50};
int size = arr.length;     // 5 (NOT arr.length() - no parentheses!)

// Last element:
int lastElement = arr[arr.length - 1];  // 50
```

### Looping Through Arrays

**Standard For Loop:**
```java
int[] numbers = {2, 4, 6, 8, 10};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

**Enhanced For Loop:**
```java
for (int num : numbers) {
    System.out.println(num);
}
```

### Common Array Operations

**Find Sum:**
```java
int[] grades = {90, 85, 92, 78, 96};
int sum = 0;
for (int grade : grades) {
    sum += grade;
}
System.out.println("Sum: " + sum);  // 441
```

**Find Average:**
```java
double average = (double) sum / grades.length;
System.out.println("Average: " + average);  // 88.2
```

**Find Maximum:**
```java
int max = grades[0];
for (int i = 1; i < grades.length; i++) {
    if (grades[i] > max) {
        max = grades[i];
    }
}
System.out.println("Max: " + max);  // 96
```

**Find Minimum:**
```java
int min = grades[0];
for (int grade : grades) {
    if (grade < min) {
        min = grade;
    }
}
System.out.println("Min: " + min);  // 78
```

### Array Important Facts
- Arrays are **ZERO-INDEXED** (first element is at index 0)
- Arrays have **FIXED SIZE** (cannot be resized after creation)
- All elements must be the **SAME TYPE**
- Accessing invalid index causes **ArrayIndexOutOfBoundsException**

**Common Error:**
```java
int[] arr = new int[5];  // Valid indices: 0, 1, 2, 3, 4
System.out.println(arr[5]);  // ERROR! Index 5 doesn't exist
```

---

## Lesson 6: Classes & Objects (OOP)

### Procedure vs. Object-Oriented Programming

**Procedure Programming:**
- Code organized as functions/methods
- Data and functions are separate
- Example: All code in `main()` method

**Object-Oriented Programming:**
- Code organized around objects
- Data and methods bundled together
- Objects represent real-world entities

### Classes vs Objects

**Class = Blueprint/Template**
- Defines structure and behavior
- Like a cookie cutter

**Object = Instance**
- Actual item created from class
- Like individual cookies

```java
// Class definition (blueprint)
public class Student {
    // Data and methods here
}

// Creating objects (instances)
Student student1 = new Student();  // First object
Student student2 = new Student();  // Second object
```

### Class Components

#### 1. Instance Variables (Fields)
```java
public class Student {
    // Instance variables - each object has its own copy
    private String name;
    private int age;
    private double gpa;
}
```

**Why private?** Encapsulation - protects data from outside modification

#### 2. Constructors
```java
public class Student {
    private String name;
    private int age;
    
    // Constructor - same name as class, no return type
    public Student(String name, int age) {
        this.name = name;  // 'this' refers to current object
        this.age = age;
    }
    
    // Default constructor (no parameters)
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
}
```

**Using constructors:**
```java
Student s1 = new Student("Alice", 16);  // Parameterized
Student s2 = new Student();              // Default
```

#### 3. Methods
```java
public class Student {
    private String name;
    private double gpa;
    
    // Getter method (accessor)
    public String getName() {
        return name;
    }
    
    // Setter method (mutator)
    public void setGPA(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
    
    // Other methods
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
    
    // Private helper method
    private void validateGPA() {
        // Only used internally
    }
}
```

### Encapsulation

**The Four Principles:**
1. Make instance variables **private**
2. Provide **public getter methods** to access data
3. Provide **public setter methods** to modify data (with validation)
4. Return **copies** of arrays/objects, not originals

**Example:**
```java
public class GradeCalculatorClass {
    private int[] grades;  // Private = protected
    
    // Return a copy, not the original
    public int[] getGrades() {
        return grades.clone();  // Defensive copy
    }
    
    // Validate before setting
    public void setGrade(int index, int grade) {
        if (index >= 0 && index < grades.length) {
            if (grade >= 0 && grade <= 100) {
                grades[index] = grade;
            }
        }
    }
}
```

### Creating and Using Objects

```java
public class Main {
    public static void main(String[] args) {
        // Create object
        GradeCalculatorClass calc = new GradeCalculatorClass();
        
        // Call methods on object
        calc.calculateStatistics();
        
        // Get results
        int sum = calc.getSum();
        double avg = calc.getAverage();
        
        // Print
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
```

### Static vs Instance

**Instance Variables/Methods:**
- Belong to each object
- Each object has its own copy
- Access using object reference

**Static Variables/Methods:**
- Belong to the class itself
- Shared by all objects
- Access using class name

```java
public class Student {
    private String name;           // Instance variable
    private static int count = 0;  // Static variable (shared)
    
    public Student(String name) {
        this.name = name;
        count++;  // Increment for each student created
    }
    
    public String getName() {      // Instance method
        return name;
    }
    
    public static int getCount() { // Static method
        return count;
    }
}

// Usage:
Student s1 = new Student("Alice");
Student s2 = new Student("Bob");
System.out.println(Student.getCount());  // 2 (static method)
System.out.println(s1.getName());        // "Alice" (instance method)
```

---

## The Big Four OOP Methods

### 1. Constructor
**Purpose:** Initialize object when created

```java
public class Student {
    private String name;
    private int id;
    
    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Usage:
Student s = new Student("Alice", 12345);
```

**Key Points:**
- Same name as class
- No return type
- Can have multiple constructors (overloading)
- Automatically called when object is created with `new`

### 2. Getters (Accessor Methods)
**Purpose:** Return private data safely

```java
public class Student {
    private String name;
    private int[] grades;
    
    // Getter for primitive/String
    public String getName() {
        return name;
    }
    
    // Getter for array (return copy!)
    public int[] getGrades() {
        return grades.clone();  // Defensive copy
    }
}

// Usage:
String studentName = s.getName();
int[] studentGrades = s.getGrades();
```

**Naming Convention:** `get` + `VariableName` (camelCase)
- `getName()`, `getAge()`, `getGPA()`
- For boolean: `isActive()`, `hasPermission()`, `canVote()`

### 3. Setters (Mutator Methods)
**Purpose:** Modify private data with validation

```java
public class Student {
    private String name;
    private int age;
    private double gpa;
    
    // Setter with validation
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }
    
    public void setGPA(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
}

// Usage:
s.setName("Bob");
s.setAge(17);
s.setGPA(3.8);
```

**Naming Convention:** `set` + `VariableName` (camelCase)
- `setName()`, `setAge()`, `setGPA()`

**Why Validation?** Prevents invalid data from corrupting object state

### 4. toString() Method
**Purpose:** Return string representation of object

```java
public class Student {
    private String name;
    private int id;
    private double gpa;
    
    @Override
    public String toString() {
        return "Student[name=" + name + 
               ", id=" + id + 
               ", gpa=" + gpa + "]";
    }
}

// Usage:
Student s = new Student("Alice", 12345, 3.9);
System.out.println(s);  // Automatically calls toString()
// Output: Student[name=Alice, id=12345, gpa=3.9]
```

**Key Points:**
- Overrides `Object.toString()`
- Automatically called by `System.out.println()`
- Should return meaningful representation
- Useful for debugging

---

## Quick Reference Tables

### Operator Precedence (High to Low)
1. `()` - Parentheses
2. `++`, `--`, `!` - Unary operators
3. `*`, `/`, `%` - Multiplication, Division, Modulus
4. `+`, `-` - Addition, Subtraction
5. `<`, `<=`, `>`, `>=` - Relational operators
6. `==`, `!=` - Equality operators
7. `&&` - Logical AND
8. `||` - Logical OR
9. `=`, `+=`, `-=`, etc. - Assignment operators

### Loop Comparison
| Feature              | for         | while       | do-while    | for-each    |
|----------------------|-------------|-------------|-------------|-------------|
| Initialization       | In header   | Before loop | Before loop | Automatic   |
| Condition check      | Before body | Before body | After body  | Automatic   |
| Minimum iterations   | 0           | 0           | 1           | 0           |
| Use for counting     | ✅          | ✅          | ❌          | ❌          |
| Use for arrays       | ✅          | ✅          | ✅          | ✅          |
| Need index?          | Yes         | Yes         | Yes         | No          |

### Primitive Type Comparison
| Need                 | Type        | Example     |
|----------------------|-------------|-------------|
| Whole numbers        | int         | `int age = 17;` |
| Decimal numbers      | double      | `double gpa = 3.8;` |
| Single character     | char        | `char grade = 'A';` |
| True/false values    | boolean     | `boolean pass = true;` |
| Very large numbers   | long        | `long distance = 1000000L;` |

---

## Common Mistakes to Avoid

### 1. Assignment vs Comparison
```java
// ❌ WRONG - Assignment
if (x = 5) {  // Syntax error!
    
}

// ✅ CORRECT - Comparison
if (x == 5) {
    
}
```

### 2. Integer Division
```java
// ❌ WRONG - Returns 2 (truncated)
double avg = 5 / 2;

// ✅ CORRECT - Returns 2.5
double avg = 5 / 2.0;
// OR
double avg = (double) 5 / 2;
```

### 3. Array Index Out of Bounds
```java
int[] arr = new int[5];  // Indices: 0, 1, 2, 3, 4

// ❌ WRONG - Index 5 doesn't exist
arr[5] = 10;  // Runtime error!

// ✅ CORRECT - Use last valid index
arr[arr.length - 1] = 10;  // arr[4] = 10
```

### 4. Forgetting Break in Switch
```java
// ❌ WRONG - Falls through cases
switch (day) {
    case 1:
        System.out.println("Monday");
    case 2:
        System.out.println("Tuesday");  // This prints too!
}

// ✅ CORRECT - Use break
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
}
```

### 5. Off-by-One Errors
```java
// ❌ WRONG - Misses last element
for (int i = 0; i < arr.length - 1; i++) {
    System.out.println(arr[i]);
}

// ✅ CORRECT - Includes last element
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### 6. Not Making Variables Private
```java
// ❌ WRONG - No encapsulation
public class Student {
    public String name;  // Anyone can modify!
}

// ✅ CORRECT - Use private + getter/setter
public class Student {
    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
```

### 7. Returning Original Array Instead of Copy
```java
// ❌ WRONG - Breaks encapsulation
public int[] getGrades() {
    return grades;  // Returns reference to original!
}

// ✅ CORRECT - Return defensive copy
public int[] getGrades() {
    return grades.clone();
}
```

### 8. Null Pointer Errors
```java
// ❌ WRONG - May cause NullPointerException
String name = null;
System.out.println(name.length());  // ERROR!

// ✅ CORRECT - Check for null first
if (name != null) {
    System.out.println(name.length());
}
```

---

## Practice Problems

### Primitives & Expressions

**Problem 1:** What is the output?
```java
int x = 10;
int y = 3;
System.out.println(x / y);
System.out.println(x % y);
System.out.println((double) x / y);
```
<details>
<summary>Answer</summary>

```
3
1
3.3333333333333335
```
</details>

**Problem 2:** Evaluate: `(5 + 3) * 2 - 4 / 2`
<details>
<summary>Answer</summary>

`(5 + 3) * 2 - 4 / 2`
`= 8 * 2 - 2`
`= 16 - 2`
`= 14`
</details>

### Variables & Assignment

**Problem 3:** What is the final value of x?
```java
int x = 5;
x += 3;
x *= 2;
x -= 4;
```
<details>
<summary>Answer</summary>

```
x = 5
x += 3  → x = 8
x *= 2  → x = 16
x -= 4  → x = 12
Final: 12
```
</details>

### Boolean Logic

**Problem 4:** Evaluate the boolean expressions:
```java
int a = 5, b = 10, c = 5;
boolean result1 = (a == c);
boolean result2 = (a < b && b > c);
boolean result3 = (a != b || a > c);
boolean result4 = !(a == b);
```
<details>
<summary>Answer</summary>

```
result1 = true   (5 == 5)
result2 = true   (5 < 10 && 10 > 5 → true && true)
result3 = true   (5 != 10 || 5 > 5 → true || false)
result4 = true   (!(5 == 10) → !false)
```
</details>

### Control Flow

**Problem 5:** What does this print?
```java
int score = 75;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("F");
}
```
<details>
<summary>Answer</summary>

```
C
```
(75 >= 70 is the first true condition)
</details>

### Loops

**Problem 6:** How many times does this loop execute?
```java
for (int i = 0; i < 10; i += 2) {
    System.out.println(i);
}
```
<details>
<summary>Answer</summary>

5 times (prints: 0, 2, 4, 6, 8)
</details>

**Problem 7:** Trace the nested loop:
```java
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(i + "," + j + " ");
    }
    System.out.println();
}
```
<details>
<summary>Answer</summary>

```
0,0 0,1 0,2 
1,0 1,1 1,2 
```
</details>

### Arrays

**Problem 8:** Find the error:
```java
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers[4]);
```
<details>
<summary>Answer</summary>

ArrayIndexOutOfBoundsException - array has indices 0-3, not 4
</details>

**Problem 9:** What is the output?
```java
int[] arr = {5, 10, 15, 20, 25};
int sum = 0;
for (int i = 0; i < arr.length; i += 2) {
    sum += arr[i];
}
System.out.println(sum);
```
<details>
<summary>Answer</summary>

```
45
```
(arr[0] + arr[2] + arr[4] = 5 + 15 + 25 = 45)
</details>

### Object-Oriented Programming

**Problem 10:** Complete the class:
```java
public class Book {
    private String title;
    private String author;
    private int pages;
    
    // TODO: Write constructor
    // TODO: Write getters for all fields
    // TODO: Write setter for pages (validate > 0)
    // TODO: Write toString() method
}
```
<details>
<summary>Answer</summary>

```java
public class Book {
    private String title;
    private String author;
    private int pages;
    
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }
    
    @Override
    public String toString() {
        return "Book[title=" + title + 
               ", author=" + author + 
               ", pages=" + pages + "]";
    }
}
```
</details>

---

## Study Tips for Test Day

### 1. Memorize Key Facts
- [ ] Primitive data types and their sizes
- [ ] Operator precedence order
- [ ] Array indexing starts at 0
- [ ] `int / int` returns `int` (truncates)
- [ ] `arr.length` (no parentheses for arrays)
- [ ] Constructor has same name as class, no return type

### 2. Practice Tracing Code
- Read code line by line
- Track variable values as they change
- Watch for off-by-one errors in loops
- Check array bounds carefully

### 3. Watch for Common Traps
- `=` vs `==`
- Forgetting `break` in switch statements
- Loop conditions (< vs <=)
- Array index out of bounds
- Null references

### 4. OOP Checklist
- [ ] Instance variables are private
- [ ] Constructor initializes all fields
- [ ] Getters return copies of arrays (use `.clone()`)
- [ ] Setters validate input before assigning
- [ ] `toString()` returns meaningful string representation

### 5. Time Management
- Read all questions first
- Do easy ones first to build confidence
- Mark uncertain questions and return later
- Check your work if time permits

---

## Quick Formulas & Patterns

### Check if number is even/odd
```java
if (num % 2 == 0) {
    // even
} else {
    // odd
}
```

### Swap two variables
```java
int temp = a;
a = b;
b = temp;
```

### Sum of 1 to n
```java
int sum = n * (n + 1) / 2;
```

### Find max in array
```java
int max = arr[0];
for (int num : arr) {
    if (num > max) max = num;
}
```

### Count occurrences in array
```java
int count = 0;
for (int num : arr) {
    if (num == target) count++;
}
```

### Reverse an array
```java
for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
```

---

## Lesson 7: Number Systems (Binary, Decimal, Hexadecimal)

### Why Number Systems Matter
Computers store and process everything in binary (base 2). Understanding number systems is fundamental to:
- Memory addressing
- Color representation (RGB hex codes)
- Bitwise operations
- Low-level programming
- Computer architecture

### The Three Number Systems

#### Base 10 (Decimal)
- **What we use every day**
- Digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
- Place values: ...1000, 100, 10, 1
- Example: `247₁₀` = 2×100 + 4×10 + 7×1

#### Base 2 (Binary)
- **What computers use**
- Digits: 0, 1 only
- Place values: ...128, 64, 32, 16, 8, 4, 2, 1 (powers of 2)
- Example: `1101₂` = 1×8 + 1×4 + 0×2 + 1×1 = **13₁₀**

#### Base 16 (Hexadecimal)
- **Programmer shorthand for binary**
- Digits: 0-9, then A, B, C, D, E, F (where A=10, B=11, C=12, D=13, E=14, F=15)
- Place values: ...4096, 256, 16, 1
- Example: `3F₁₆` = 3×16 + 15×1 = **63₁₀**

### Key Conversion Methods

#### Binary → Decimal
**Method:** Multiply each digit by its place value and add
```
1011₂ = 1×8 + 0×4 + 1×2 + 1×1 = 8 + 2 + 1 = 11₁₀
```

#### Decimal → Binary
**Method 1 - Repeated Division:**
```
25 ÷ 2 = 12 R 1  ↓
12 ÷ 2 = 6  R 0  ↓
6  ÷ 2 = 3  R 0  ↓
3  ÷ 2 = 1  R 1  ↓
1  ÷ 2 = 0  R 1  ↓
Read up: 11001₂
```

**Method 2 - Subtract Powers of 2:**
```
25 = 16 + 9 = 16 + 8 + 1 = 2⁴ + 2³ + 2⁰ = 11001₂
```

#### Binary → Hexadecimal
**Method:** Group binary digits into sets of 4 from RIGHT to LEFT
```
11010110₂
= 1101 | 0110
= 13   | 6
= D    | 6
= D6₁₆
```

#### Hexadecimal → Decimal
**Method:** Multiply each digit by its place value
```
2A₁₆ = 2×16 + 10×1 = 32 + 10 = 42₁₀
```

### Quick Reference: Hex Digits
| Hex | Decimal | Binary |
|-----|---------|--------|
| 0   | 0       | 0000   |
| 1   | 1       | 0001   |
| 2   | 2       | 0010   |
| 3   | 3       | 0011   |
| 4   | 4       | 0100   |
| 5   | 5       | 0101   |
| 6   | 6       | 0110   |
| 7   | 7       | 0111   |
| 8   | 8       | 1000   |
| 9   | 9       | 1001   |
| A   | 10      | 1010   |
| B   | 11      | 1011   |
| C   | 12      | 1100   |
| D   | 13      | 1101   |
| E   | 14      | 1110   |
| F   | 15      | 1111   |

### Common Patterns to Memorize
- `1111₂` = `F₁₆` = 15₁₀
- `11111111₂` = `FF₁₆` = 255₁₀ (one byte!)
- `10000000₂` = `80₁₆` = 128₁₀
- Powers of 2: 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...

### Real-World Applications

**RGB Colors:**
- `#FF0000` = Red (255, 0, 0)
- `#00FF00` = Green (0, 255, 0)
- `#0000FF` = Blue (0, 0, 255)
- Each color component: 0-255 = 1 byte = 8 bits

**Memory:**
- 1 byte = 8 bits = can store 0-255
- 1 kilobyte = 1024 bytes (2¹⁰)
- 1 megabyte = 1024 KB
- 1 gigabyte = 1024 MB

### Practice Tips
1. **Memorize powers of 2** up to 256 (2⁸)
2. **Memorize hex digits** A-F = 10-15
3. **Practice grouping** for binary→hex (sets of 4)
4. **Use visual aids** - see Number_Systems_Visual_Guide.pdf
5. **Check your work** - convert back to verify!

### Common Mistakes
❌ Forgetting binary place values (128, 64, 32, 16, 8, 4, 2, 1)
❌ Grouping binary left-to-right instead of right-to-left for hex
❌ Using 10-15 instead of A-F in hexadecimal
❌ Confusing subscripts (₂ ₁₀ ₁₆)

---

## Final Review Checklist

### Before the Test
- [ ] Review all lesson slides
- [ ] Complete practice problems
- [ ] Run and test code examples
- [ ] Memorize primitive data type table
- [ ] **NEW:** Memorize powers of 2 (up to 256)
- [ ] **NEW:** Memorize hex digits A-F
- [ ] **NEW:** Practice binary/hex conversions with worksheet
- [ ] Practice writing constructors, getters, setters
- [ ] Understand encapsulation principles
- [ ] Test yourself with Quizlet (when available)
- [ ] **NEW:** Review Number Systems Visual Guide PDF

### During the Test
- [ ] Read questions carefully
- [ ] Check syntax (semicolons, brackets, parentheses)
- [ ] Trace code mentally or on paper
- [ ] **NEW:** For conversions, show your work!
- [ ] **NEW:** Group binary in 4s for hex conversion
- [ ] Validate array indices
- [ ] Check for edge cases (null, empty arrays, zero, negative)
- [ ] Review answers if time allows

### Additional Resources
- **Lesson 7 Comprehensive Guide** - Detailed explanations and examples
- **Number Systems Visual Guide PDF** - Color-coded diagrams and flowcharts
- **Conversion Practice Worksheet** - 35 practice problems with answers

---

**Good luck on your test! You've got this! 🚀**

*Remember: Practice makes perfect. The more code you write and trace, the more conversions you practice, the more confident you'll become!*
