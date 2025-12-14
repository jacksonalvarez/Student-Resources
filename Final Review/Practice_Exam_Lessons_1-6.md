# Java Programming Practice Exam - Lessons 1-6 + Number Systems
**Student Name:** ___________________________  
**Date:** ___________________________  
**This is PRACTICE - Use it to identify areas to review!**

---

## Instructions
- This practice exam mirrors the format of your actual final (including Number Systems!)
- Time yourself for 1 hour to simulate test conditions
- Use your study guide if you get stuck - this is for learning!
- Use the Number Systems Visual Guide PDF for conversion reference
- Mark questions you struggle with for extra review
- Check your answers with your tutor

**Goal:** Identify weak areas and build confidence before the real test! 💡

---

## Part 1: Multiple Choice (24 points - 2 points each)

### 1. How many bytes does an `int` data type use?
```
a) 1 byte       b) 2 bytes      c) 4 bytes      d) 8 bytes
```

### 2. Which of the following is a primitive data type?
```
a) String       b) Array        c) boolean      d) Scanner
```

### 3. What is the output of this code?
```java
int a = 15;
int b = 4;
System.out.println(a % b);
```
```
a) 3.75         b) 3            c) 4            d) 1
```

### 4. What does the `==` operator do?
```
a) Assigns a value
b) Compares two values for equality
c) Adds two numbers
d) Checks if not equal
```

### 5. What is the result of: `true || false`
```
a) true         b) false        c) null         d) Error
```

### 6. What is the result of: `!(5 > 3)`
```
a) true         b) false        c) 5            d) 3
```

### 7. How do you access the LAST element of an array called `data`?
```
a) data[data.length]            b) data[data.size - 1]
c) data[data.length - 1]        d) data.last()
```

### 8. What happens if you access an invalid array index?
```
a) Returns 0
b) Returns null
c) Compilation error
d) ArrayIndexOutOfBoundsException (runtime error)
```

### 9. Which loop checks the condition BEFORE executing the body?
```
a) do-while loop    b) while loop    c) Both        d) Neither
```

### 10. In object-oriented programming, what is an object?
```
a) A blueprint for creating classes
b) An instance of a class
c) A method that returns nothing
d) A static variable
```

### 11. What is the correct way to declare a constructor?
```
a) public void ClassName() { }
b) public ClassName() { }
c) private static ClassName() { }
d) constructor ClassName() { }
```

### 12. What does `this` refer to in a class?
```
a) The parent class
b) The current object
c) A static method
d) The main method
```

---

## Part 2: True or False (10 points - 1 point each)

13. _____ The result of `15 / 4` in Java is `3.75`.

14. _____ Array indices start at 1 in Java.

15. _____ A while loop always executes at least once.

16. _____ You can have multiple methods with the same name but different parameters (overloading).

17. _____ Private instance variables can be accessed directly from outside the class.

18. _____ The expression `12 % 5` equals `2`.

19. _____ A setter method should have a return type of void.

20. _____ The `break` statement exits a loop or switch statement immediately.

21. _____ `int[] arr = {1, 2, 3};` is a valid way to create an array.

22. _____ A class can exist without any constructors.

---

## Part 3: Fill in the Blanks (10 points - 1 point each)

23. The result of integer division `7 / 2` is __________.

24. The logical operator for "OR" is __________.

25. An array with 8 elements has valid indices from 0 to __________.

26. The method that provides read access to a private variable is called a __________ method.

27. To create an object from a class, you use the __________ keyword.

28. A variable declared inside a method has __________ scope.

29. The __________ loop is best when you want to iterate through all elements without needing the index.

30. Making instance variables private and providing public methods for access is called __________.

31. A method with the same name as the class and no return type is called a __________.

32. The operator `>=` means greater than or __________ __________.

---

## Part 4: Code Tracing (16 points - 4 points each)

### Problem 33: What does this print?
```java
int x = 3;
int y = 4;
int z = x * y + 2;
System.out.println(z);
```

**Output:** ___________________________

**Your work:**


---

### Problem 34: What does this print?
```java
for (int i = 0; i < 5; i += 2) {
    System.out.print(i + " ");
}
```

**Output:** ___________________________

**Your work:**


---

### Problem 35: What does this print?
```java
int[] values = {5, 10, 15, 20, 25};
System.out.println(values[2] + values[4]);
```

**Output:** ___________________________

**Your work:**


---

### Problem 36: What does this print?
```java
int num = 45;
if (num >= 50) {
    System.out.println("High");
} else if (num >= 30) {
    System.out.println("Medium");
} else {
    System.out.println("Low");
}
```

**Output:** ___________________________

**Your work:**


---

## Part 5: Find and Fix Errors (12 points - 4 points each)

### Problem 37: Find the error
```java
String[] names = {"Alice", "Bob", "Charlie"};
for (int i = 0; i <= names.length; i++) {
    System.out.println(names[i]);
}
```

**Error:** ___________________________

**Correction:** ___________________________

---

### Problem 38: Find the error
```java
int total = 10;
int count = 4;
double average = total / count;
System.out.println(average);
```

**Error:** ___________________________

**Correction:** ___________________________

**Hint:** Think about what type of division is happening.

---

### Problem 39: Find the error
```java
public class Car {
    public String model;
    public int year;
    
    public Car(String model, int year) {
        model = model;
        year = year;
    }
}
```

**Error:** ___________________________

**Correction:** ___________________________

---

## Part 6: Short Answer (8 points - 4 points each)

### Problem 40:
Explain what encapsulation is and why we make instance variables private.

**Your answer:**





---

### Problem 41:
What is the difference between a `for` loop and a `while` loop? When would you use each one?

**Your answer:**





---

## Part 7: Code Writing (20 points)

### Problem 42: Write a method (10 points)
Write a method called `countEvens` that takes an integer array and returns how many even numbers are in the array.

**Hints:**
- Method signature: `public static int countEvens(int[] arr)`
- Remember: even numbers have no remainder when divided by 2
- Use a counter variable

```java
public static int countEvens(int[] arr) {
    // Your code here
    
    
    
    
    
    
    
}
```

**Test your logic:** If array is {1, 2, 3, 4, 5, 6}, what should it return? _____

---

### Problem 43: Create a class (10 points)
Create a class called `Rectangle` with the following:

**Instance Variables (private):**
- double width
- double height

**Methods:**
- Constructor that takes width and height
- Getter for width
- Getter for height
- Method `calculateArea()` that returns width * height

```java
public class Rectangle {
    // Instance variables
    
    
    
    
    // Constructor
    
    
    
    
    
    // Getter for width
    
    
    
    // Getter for height
    
    
    
    // Calculate area method
    
    
    
    
}
```

---

## Part 7: Number Systems (15 points)

### Question 7.1: Binary to Decimal (3 points)
Convert these binary numbers to decimal:

a) `1100₂` = ___________₁₀

b) `10111₂` = ___________₁₀

c) `11110101₂` = ___________₁₀

---

### Question 7.2: Decimal to Binary (3 points)
Convert these decimal numbers to binary:

a) 18₁₀ = ___________₂

b) 50₁₀ = ___________₂

c) 127₁₀ = ___________₂

---

### Question 7.3: Hexadecimal Basics (3 points)

a) What decimal value does 'D' represent in hexadecimal? ___________

b) What decimal value does 'A' represent in hexadecimal? ___________

c) Convert `1F₁₆` to decimal: ___________₁₀

---

### Question 7.4: Binary to Hex (3 points)
Convert these binary numbers to hexadecimal:

a) `10011100₂` = ___________₁₆

b) `11001011₂` = ___________₁₆

c) `01010101₂` = ___________₁₆

---

### Question 7.5: Real-World Application (3 points)

You're building a graphics program that uses RGB color values.

a) The color `#00FF00` represents which color? ___________

b) If the Blue component is FF in hex, what is it in decimal? ___________

c) How many bits total are needed for one RGB color (3 components)? ___________

---

## BONUS: Challenge Problem! (5 extra credit points)

### Problem 44: Array Reversal
Write a method that takes an integer array and returns a NEW array with the elements in reverse order (don't modify the original array).

**Hint:** Create a new array and copy elements from end to beginning.

```java
public static int[] reverseArray(int[] arr) {
    // Your code here
    
    
    
    
    
    
    
}
```

**Example:**
- Input: `{1, 2, 3, 4, 5}`
- Output: `{5, 4, 3, 2, 1}`

---

## Self-Assessment Checklist

After completing this practice exam, answer honestly:

### Concepts I feel confident about:
- [ ] Primitive data types
- [ ] Arithmetic operators and precedence
- [ ] Boolean logic and relational operators
- [ ] If-else statements
- [ ] Switch statements
- [ ] For loops
- [ ] While and do-while loops
- [ ] Array declaration and initialization
- [ ] Array traversal
- [ ] Classes and objects
- [ ] Constructors
- [ ] Getters and setters
- [ ] Encapsulation
- [ ] The `this` keyword

### Areas I need to review:
1. _________________________________
2. _________________________________
3. _________________________________

### Questions I got stuck on:
- Problem #: _____ Topic: _____________________
- Problem #: _____ Topic: _____________________
- Problem #: _____ Topic: _____________________

### Action Plan:
**Before the real exam, I will:**
- [ ] Review the study guide sections for weak areas
- [ ] Practice more problems on: _____________________
- [ ] Go through Quizlet flashcards
- [ ] Ask tutor about: _____________________
- [ ] Practice writing code for: _____________________

---

## Notes for Review Session:

**Topics to discuss with tutor:**





**Questions I have:**





**Things I want to practice more:**





---

## Remember:
- This practice exam is a learning tool, not a grade
- Mistakes here help you learn before the real test
- Use your resources - that's what they're for!
- You're building real programming skills!

**Next Steps:**
1. ✅ Complete this practice exam
2. ✅ Check answers with your tutor
3. ✅ Review missed concepts with study guide
4. ✅ Practice weak areas
5. ✅ Take the real exam with confidence!

Good luck! You've got this! 🚀
