# Java Arrays - Student Handout

---

## What Are Arrays?

An **Array** is a data structure that stores multiple elements of the same data
type in contiguous memory locations. Each element in an array:

- Has a unique **index** (position number)
- Must be of the **same data type** as all other elements
- Is stored in **sequential memory** locations

## Static vs. Dynamic Allocation.

Static = static amount of items || Dyamic = dynamic amount of items

## Array Basics Cheat Sheet

### Declaration and Initialization

```java
// Create an empty array of 5 integers
int[] numbers = new int[5];

// Create and fill an array at the same time
int[] scores = {85, 92, 78, 96, 88};
String[] names = {"Alice", "Bob", "Charlie"};
```

### Accessing Elements

```java
int[] grades = {90, 85, 92, 78, 96};

int firstGrade = grades[0];    // Gets 90 (first element)
int thirdGrade = grades[2];    // Gets 92 (third element)
int lastGrade = grades[4];     // Gets 96 (last element)

// Array length
int numStudents = grades.length; // Gets 5
```

### Memory Layout Visualization

```
Array: scores = {85, 92, 78, 96, 88}
Memory: [85][92][78][96][88]
Index:   0   1   2   3   4
```

---

## Key Concepts to Remember

### 1. Zero-Based Indexing

- Arrays start counting at **0**, not 1!
- First element: `array[0]`
- Last element: `array[array.length - 1]`

### 2. Fixed Size (Static Arrays)

- Once created, arrays **cannot change size**
- `int[] arr = new int[5];` ← Always has exactly 5 spaces

### 3. Same Data Type Only

- All elements must be the same type
- `int[]` can only hold integers
- `String[]` can only hold strings

---

## Practice Exercises

### Exercise 1: Fill in the Blanks

```java
// Create an array of 7 double values
???[] temperatures = new ???[?];

// Create an array with student names
String[] students = {"Ana", "Ben", "Cara", "Dan"};

// Get the second student's name
String secondStudent = students[?];

// Get the number of students
int count = students.?;
```

### Exercise 2: Debug the Code

Find and fix the errors in this code:

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[3]);  // Error 1: ________________
numbers[1] = "forty";           // Error 2: ________________
int size = numbers.size();      // Error 3: ________________
```

### Exercise 3: Trace the Code

What will this program output? Write your answers:

```java
int[] mystery = new int[4];
mystery[0] = 5;
mystery[1] = mystery[0] * 2;
mystery[2] = mystery[1] + 3;
mystery[3] = mystery[0] + mystery[2];

System.out.println("mystery[0] = " + mystery[0]); // Output: ____
System.out.println("mystery[1] = " + mystery[1]); // Output: ____
System.out.println("mystery[2] = " + mystery[2]); // Output: ____
System.out.println("mystery[3] = " + mystery[3]); // Output: ____
```

---

## Lab Activity: Grade Calculator

Complete this program to calculate statistics for student grades:

**Expected Output:**

```
Total grades: 7
Sum: 613
Average: 87.57142857142857
Highest: 96
Lowest: 78
```

---
## Common Mistakes to Avoid
1. **Off-by-One Errors:**
   ```java
   int[] arr = new int[5];
   arr[5] = 10; // ERROR! Index 5 doesn't exist (0-4 only)
   ```
2. **Wrong Length Property:**
   ```java
   int[] arr = {1, 2, 3};
   int size = arr.size();    // ERROR! Use .length not .size()
   int size = arr.length;    // CORRECT!
   ```
3. **Null Arrays:**
   ```java
   int[] arr = null;
   arr[0] = 5; // ERROR! NullPointerException
   ```
---

## Glance into advanced topics

(You dont need to understand just try and absorb.)

### Static vs Dynamic Arrays

**Static Array (Java's default):**

```java
int[] staticArray = new int[5]; // Size is FIXED at 5
//  Fast access
//  Can't grow or shrink
```

**Dynamic Array (ArrayList):**

```java
import java.util.ArrayList;
ArrayList<Integer> dynamicArray = new ArrayList<>();
dynamicArray.add(10);    // Can grow!
dynamicArray.add(20);    // Keeps growing!
// Flexible size BUT cases where it is Slightly slower
```

### Memory Insight

Arrays store elements in **contiguous memory** (next to each other), which makes
them super fast! The computer calculates where each element is using:

```
Element Location = Starting Address + (Index × Element Size)
```

---

## Quick Reference Card

| Operation           | Syntax                                | Example                     |
| ------------------- | ------------------------------------- | --------------------------- |
| Declare empty array | `type[] name = new type[size];`       | `int[] nums = new int[10];` |
| Declare with values | `type[] name = {val1, val2, ...};`    | `int[] nums = {1, 2, 3};`   |
| Access element      | `array[index]`                        | `int first = nums[0];`      |
| Modify element      | `array[index] = value;`               | `nums[0] = 99;`             |
| Get array length    | `array.length`                        | `int size = nums.length;`   |
| Loop through array  | `for(int i = 0; i < arr.length; i++)` | See examples above          |

---

## Homework Checklist

**Create a program called `StudentTracker` that:**

- [ ] Uses an array to store 10 student names
- [ ] Uses another array to store their test scores
- [ ] Has a method to add a new student (if space available)
- [ ] Has a method to find a student by name
- [ ] Calculates the class average
- [ ] Shows all students with above-average scores

**Bonus:**

- [ ] Research `ArrayList` and compare it to regular arrays
- [ ] Rewrite your program using ArrayList instead

---

## Notes Section

Use this space for your own notes during the lesson:

```
_________________________________________________

_________________________________________________

_________________________________________________

_________________________________________________

_________________________________________________

_________________________________________________

_________________________________________________

_________________________________________________
```

---

**Remember:** Arrays are powerful tools for organizing data. Master the basics
first, then explore advanced concepts like sorting and searching algorithms!
