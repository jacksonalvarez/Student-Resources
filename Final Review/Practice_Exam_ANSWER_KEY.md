# Practice Exam Answer Key - Lessons 1-6 + Number Systems

**Total Points: 115 + 5 bonus = 120 possible**

---

## Part 1: Multiple Choice (24 points - 2 points each)

1. **c) 4 bytes** - int uses 32 bits = 4 bytes
2. **c) boolean** - boolean is a primitive type
3. **b) 3** - 15 % 4 = 3 (remainder when 15 is divided by 4)
4. **b) Compares two values for equality** - == is comparison, = is assignment
5. **a) true** - OR returns true if at least one operand is true
6. **b) false** - 5 > 3 is true, NOT flips it to false
7. **c) data[data.length - 1]** - last index is length - 1
8. **d) ArrayIndexOutOfBoundsException (runtime error)** - accessing invalid index causes runtime exception
9. **b) while loop** - while checks condition before, do-while checks after
10. **b) An instance of a class** - object is an instance, class is the blueprint
11. **b) public ClassName() { }** - constructor has no return type, same name as class
12. **b) The current object** - this refers to the current instance

---

## Part 2: True or False (10 points - 1 point each)

13. **F** - Result is 3 (integer division truncates)
14. **F** - Arrays start at index 0 (zero-indexed)
15. **F** - while may not execute at all; do-while always executes once
16. **T** - Method overloading is allowed
17. **F** - Private variables cannot be accessed directly from outside
18. **T** - 12 % 5 = 2 (12 ÷ 5 = 2 remainder 2)
19. **T** - Setters typically return void
20. **T** - break exits immediately
21. **T** - This is valid array initialization syntax
22. **T** - Java provides a default constructor if you don't write any

---

## Part 3: Fill in the Blanks (10 points - 1 point each)

23. **3** (7 / 2 = 3 with integer division)
24. **||** (double pipe for OR)
25. **7** (indices 0-7 for 8 elements)
26. **getter** (or accessor)
27. **new** (keyword to create objects)
28. **local** (scope limited to the method)
29. **for-each** (or enhanced for loop)
30. **encapsulation** (hiding data, controlled access)
31. **constructor** (initializes objects)
32. **equal to** (>= means greater than or equal to)

---

## Part 4: Code Tracing (16 points - 4 points each)

### Problem 33:
**Output: 14**

Work:
```
x = 3
y = 4
z = 3 * 4 + 2
z = 12 + 2
z = 14
```

### Problem 34:
**Output: 0 2 4**

Work:
```
i = 0: prints "0 "
i = 2: prints "2 "
i = 4: prints "4 "
i = 6: condition false, exits loop
```

### Problem 35:
**Output: 40**

Work:
```
values[0] = 5
values[1] = 10
values[2] = 15
values[3] = 20
values[4] = 25

values[2] + values[4] = 15 + 25 = 40
```

### Problem 36:
**Output: Medium**

Work:
```
num = 45
45 >= 50? → false
45 >= 30? → true (executes this block)
Prints "Medium"
```

---

## Part 5: Find and Fix Errors (12 points - 4 points each)

### Problem 37:
**Error:** Loop condition `i <= names.length` will cause ArrayIndexOutOfBoundsException
- Last valid index is 2 (length - 1), but loop tries to access index 3

**Correction:** Change to `i < names.length`

### Problem 38:
**Error:** Integer division returns int (2), not double (2.5)

**Corrections (any of these work):**
```java
double average = (double) total / count;
// OR
double average = total / (double) count;
// OR
double average = total / 4.0;
```

### Problem 39:
**Error:** Parameters shadow instance variables; need `this` keyword

**Correction:**
```java
public Car(String model, int year) {
    this.model = model;
    this.year = year;
}
```

---

## Part 6: Short Answer (8 points - 4 points each)

### Problem 40:
**Sample Answer:**
Encapsulation is the practice of hiding internal data and implementation details from outside access. We make instance variables private to protect the data from being directly modified or accessed from outside the class. This allows us to control how data is accessed and modified through public getter and setter methods, which can include validation to ensure data integrity.

**Key Points:**
- Protects/hides data
- Private variables
- Public getter/setter methods
- Controlled access
- Data validation

### Problem 41:
**Sample Answer:**
A for loop is best when you know exactly how many times you need to iterate, such as looping through array indices or counting from 1 to 10. A while loop is better when you don't know in advance how many iterations you need, such as when reading user input until they enter "quit" or repeating until a condition is met.

Both loops can often be used interchangeably, but for loops are more compact when you need initialization, condition, and update all in one place.

**Key Points:**
- for: known number of iterations
- while: unknown number of iterations
- for: more compact syntax
- while: more flexible
- Examples of when to use each

---

## Part 7: Code Writing (20 points)

### Problem 42: countEvens method (10 points)

**Sample Solution:**
```java
public static int countEvens(int[] arr) {
    int count = 0;
    for (int num : arr) {
        if (num % 2 == 0) {
            count++;
        }
    }
    return count;
}
```

**Alternative Solution (indexed for loop):**
```java
public static int countEvens(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            count++;
        }
    }
    return count;
}
```

**Test answer:** Should return **3** (numbers 2, 4, 6 are even)

**Grading Rubric:**
- Correct method signature (2 pts)
- Initialize counter variable (2 pts)
- Loop through array (2 pts)
- Check if even (num % 2 == 0) (2 pts)
- Return count (2 pts)

### Problem 43: Rectangle class (10 points)

**Sample Solution:**
```java
public class Rectangle {
    // Instance variables
    private double width;
    private double height;
    
    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Getter for width
    public double getWidth() {
        return width;
    }
    
    // Getter for height
    public double getHeight() {
        return height;
    }
    
    // Calculate area method
    public double calculateArea() {
        return width * height;
    }
}
```

**Grading Rubric:**
- Private instance variables (2 pts)
- Constructor with correct signature (2 pts)
- Constructor uses this keyword (1 pt)
- Getter for width (2 pts)
- Getter for height (2 pts)
- calculateArea method (1 pt)

---

## Part 7: Number Systems (15 points)

### Question 7.1: Binary to Decimal (3 points)

**Answers:**
a) `1100₂` = **12₁₀**
- Work: 1×8 + 1×4 + 0×2 + 0×1 = 8 + 4 = 12

b) `10111₂` = **23₁₀**
- Work: 1×16 + 0×8 + 1×4 + 1×2 + 1×1 = 16 + 4 + 2 + 1 = 23

c) `11110101₂` = **245₁₀**
- Work: 1×128 + 1×64 + 1×32 + 1×16 + 0×8 + 1×4 + 0×2 + 1×1 = 128 + 64 + 32 + 16 + 4 + 1 = 245

**Grading:** 1 point each for correct answer

---

### Question 7.2: Decimal to Binary (3 points)

**Answers:**
a) 18₁₀ = **10010₂**
- Work: 18 = 16 + 2 = 2⁴ + 2¹

b) 50₁₀ = **110010₂**
- Work: 50 = 32 + 16 + 2 = 2⁵ + 2⁴ + 2¹

c) 127₁₀ = **1111111₂**
- Work: 127 = 64 + 32 + 16 + 8 + 4 + 2 + 1 = all bits set in 7 positions

**Grading:** 1 point each for correct answer

---

### Question 7.3: Hexadecimal Basics (3 points)

**Answers:**
a) D represents **13** in decimal

b) A represents **10** in decimal

c) `1F₁₆` = **31₁₀**
- Work: 1×16 + 15×1 = 16 + 15 = 31

**Grading:** 1 point each

---

### Question 7.4: Binary to Hex (3 points)

**Answers:**
a) `10011100₂` = **9C₁₆**
- Work: Group into 4: 1001 | 1100 → 9 | 12 → 9 | C

b) `11001011₂` = **CB₁₆**
- Work: Group into 4: 1100 | 1011 → 12 | 11 → C | B

c) `01010101₂` = **55₁₆**
- Work: Group into 4: 0101 | 0101 → 5 | 5

**Grading:** 1 point each for correct answer

---

### Question 7.5: Real-World Application (3 points)

**Answers:**
a) The color `#00FF00` represents **Green**
- Red=00, Green=FF (255), Blue=00

b) FF in hex = **255** in decimal
- Work: 15×16 + 15×1 = 240 + 15 = 255

c) **24 bits** total (8 bits per color × 3 colors)
- Each component is 1 byte = 8 bits

**Grading:** 1 point each

---

## BONUS: Challenge Problem (5 points)

### Problem 44: Array Reversal

**Sample Solution:**
```java
public static int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        reversed[i] = arr[arr.length - 1 - i];
    }
    return reversed;
}
```

**Alternative Solution (backward loop):**
```java
public static int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    int index = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
        reversed[index] = arr[i];
        index++;
    }
    return reversed;
}
```

**Grading Rubric:**
- Create new array of same size (1 pt)
- Loop through array (2 pts)
- Copy elements in reverse order (1 pt)
- Return new array (1 pt)

---

## Scoring Summary

### Total Points: 115 + 5 bonus = 120 possible

**Score Interpretation (based on 115 points):**
- **104-115+ (90-100%):** Excellent! Ready for the final exam
- **92-103 (80-89%):** Good understanding, minor review needed
- **81-91 (70-79%):** Adequate, but review key concepts before final
- **Below 81 (<70%):** Need more study time - use study guide heavily

### Common Weak Areas to Review:

If you missed questions in:
- **Parts 1-3:** Review fundamental concepts in study guide
- **Part 4:** Practice more code tracing problems
- **Part 5:** Study common mistakes section of study guide
- **Part 6:** Review conceptual understanding
- **Part 7 (Number Systems):** Use visual guide PDF, practice conversions worksheet
- **Part 8:** Practice writing more code!

---

## Study Recommendations Based on Score

### Scored 90+:
- Quick review of cheat sheet
- Focus on timing and accuracy
- Review number systems conversions one more time
- Try the bonus problems
- You're ready!

### Scored 80-89:
- Review missed topics in study guide
- Practice Quizlet for weak areas
- **NEW:** Practice more binary/hex conversions
- Do a few more coding problems
- Retake practice problems you missed

### Scored 70-79:
- Spend extra time with study guide
- Daily Quizlet practice
- **NEW:** Use Number Systems Visual Guide PDF daily
- Work through all study guide examples
- **NEW:** Complete Conversion Practice Worksheet
- Schedule extra review time with tutor

### Scored Below 70:
- Systematic review of all topics
- Go through each lesson folder
- Daily practice with Quizlet
- **NEW:** Memorize powers of 2 and hex digits A-F
- Work through coding problems with tutor
- Don't panic - this is why we practice!

---

## Action Items After Reviewing Answers:

1. ✅ **Identify patterns** - What types of questions did you miss?
2. ✅ **Review concepts** - Go to study guide for those topics
3. ✅ **Practice more** - Find similar problems to practice
4. ✅ **Number Systems?** - Use the Visual Guide PDF and practice worksheet!
5. ✅ **Ask questions** - Bring specific problems to tutor
6. ✅ **Try again** - Redo missed problems after studying

**Remember:** This practice exam is FOR LEARNING. Mistakes here are good - they show you what to study!

---

**Resources Available:**
- Study Guide (Lessons 1-7)
- Number Systems Visual Guide PDF
- Conversion Practice Worksheet (35 problems)
- Quizlet Flashcards
- Quick Reference Cheat Sheet

**Ready for the real exam? You've got this! 🚀**
