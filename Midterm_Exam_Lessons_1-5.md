# Java Programming Midterm Exam - Lessons 1-5
[Blank Answer Sheet](https://docs.google.com/document/d/1Scfj9WSSqaf1tnSI0LLCVYcurabTbixruFx3YIaN8HE/edit?usp=sharing)

[Java compiler](https://www.programiz.com/java-programming/online-compiler/)

**Instructions:**

- This exam covers material from Lessons 1-5
- Write code clearly and include proper syntax
- Total Points: 100

---

## Part I: Multiple Choice (60 points, 2 points each)

**Circle the best answer for each question.**

1. Which of the following is NOT a Java primitive data type?
   ```
   a) int        b) String      c) double      d) boolean
   ```

2. How many bytes does an `int` data type use in Java?
   ```
   a) 1 byte     b) 2 bytes    c) 4 bytes     d) 8 bytes
   ```

3. How many bits does a `boolean` data type use in Java?
   ```
   a) 1 bit      b) 8 bits     c) 16 bits     d) 32 bits
   ```

4. What is the output of the following code?
   ```java
   int a = 7, b = 2;
   System.out.println((a + b) / 2);
   ```
   ```
   a) 4.5        b) 4          c) 5           d) 3
   ```

5. Which operator has the highest precedence?
   ```
   a) +          b) *          c) ()          d) =
   ```

6. What is the result of `10 % 3`?
   ```
   a) 3          b) 1          c) 0           d) 3.33
   ```

7. Which logical operator returns true only when both operands are true?
   ```
   a) ||         b) &&         c) !           d) ==
   ```

8. What is the correct way to declare and initialize an integer variable?
   ```
   a) int x = 5; b) integer x = 5; c) x = 5;   d) int x == 5;
   ```

9. Which loop is guaranteed to execute at least once?
   ```
   a) for        b) while      c) do-while    d) enhanced for
   ```

10. What is the index of the first element in a Java array?
    ```
    a) 1          b) 0          c) -1          d) depends on size
    ```

11. How do you find the length of an array called `grades`?
    ```
    a) grades.length() b) grades.size c) grades.length d) length(grades)
    ```

12. What happens if you try to access `array[5]` when the array only has 5
    elements?
    ```
    a) Returns 0  b) Returns null c) Compilation error d) Runtime error
    ```

13. How many bytes does a `double` data type use?
    ```
    a) 2 bytes    b) 4 bytes    c) 8 bytes     d) 16 bytes
    ```

14. What is the range of a `byte` data type?
    ```
    a) 0 to 255   b) -128 to 127 c) -256 to 255 d) 1 to 128
    ```

15. What does the `%` operator do?
    ```
    a) Division   b) Multiplication c) Remainder d) Percentage
    ```

16. Which of these is a valid way to create an array?
    ```
    a) int[] arr = new int[5];     b) int arr[] = {1,2,3};
    c) int[] arr = {1,2,3,4,5};    d) All of the above
    ```

17. What is the result of `5 / 2` in Java (integer division)?
    ```
    a) 2.5        b) 2          c) 3           d) 2.0
    ```

18. Which statement about `char` is correct?
    ```
    a) Uses 1 byte b) Uses 2 bytes c) Stores only letters d) Can be negative
    ```

19. What does `&&` mean in Java?
    ```
    a) OR         b) AND        c) NOT         d) XOR
    ```

20. In a `for` loop, when is the condition checked?
    ```
    a) Before each iteration      b) After each iteration
    c) Only at the start          d) Never
    ```

21. What is the correct syntax for a `while` loop?
    ```
    a) while (condition) {}       b) while condition {}
    c) while (condition);         d) while {}
    ```

22. Which array access will cause an error for `int[] arr = new int[3];`?
    ```
    a) arr[0]     b) arr[2]     c) arr[3]      d) arr[1]
    ```

23. What is the result of `true || false`?
    ```
    a) true       b) false      c) error       d) null
    ```

24. How do you declare a constant in Java?
    ```
    a) const int X = 5;           b) final int X = 5;
    c) static int X = 5;          d) int X = final 5;
    ```

25. What happens in this code: `int x = 5; x++;`?
    ```
    a) x becomes 4 b) x becomes 6 c) Compilation error d) Runtime error
    ```

26. Which loop executes the body at least once?
    ```
    a) for        b) while      c) do-while    d) enhanced for
    ```

27. What is `!true` in Java?
    ```
    a) true       b) false      c) 1           d) 0
    ```

28. How many elements can this array hold: `String[] names = new String[10];`?
    ```
    a) 9          b) 10         c) 11          d) unlimited
    ```

29. What is the result of `8 % 5`?
    ```
    a) 1          b) 2          c) 3           d) 1.6
    ```

30. Which is the correct way to compare two integers for equality?
    ```
    a) x = y      b) x == y     c) x.equals(y) d) x === y
    ```

---

## Part II: Code Analysis and Debugging (25 points, 5 points each)

**For each problem, either predict the output OR identify and fix the error:**

1. **Predict the Output (5 points)**
   ```java
   int[] numbers = {2, 4, 6, 8, 10};
   int count = 0;
   for (int i = 0; i < numbers.length; i++) {
       if (numbers[i] % 2 == 0) {
           count++;
       }
   }
   System.out.println("Even count: " + count);
   ```
   **Output:** ________________________________________________

2. **Fix the Error (5 points)**
   ```java
   public class BuggyCode {
       public static void main(String[] args) {
           int[] scores = {85, 90, 78, 92, 88};
           int sum = 0;
           
           for (int i = 1; i <= scores.length; i++) {
               sum += scores[i];
           }
           
           System.out.println("Average: " + sum / scores.length);
       }
   }
   ```
   **Error:** ________________________________________________ **Fixed Code:**
   ```java
   // Write the corrected for loop here:
   ```

3. **Predict the Output (5 points)**
   ```java
   int x = 15;
   if (x > 20) {
       System.out.println("Large");
   } else if (x > 10) {
       System.out.println("Medium"); 
   } else {
       System.out.println("Small");
   }
   System.out.println("x = " + x);
   ```
   **Output:** ________________________________________________

4. **Fix the Error (5 points)**
   ```java
   public class LoopError {
       public static void main(String[] args) {
           int i = 0;
           while (i < 5) {
               System.out.println("Number: " + i);
               // Missing something here...
           }
       }
   }
   ```
   **Error:** ________________________________________________ **Fix:**
   ________________________________________________

5. **Predict the Output (5 points)**
   ```java
   boolean a = true;
   boolean b = false; 
   System.out.println(a && b);
   System.out.println(a || b);
   System.out.println(!a);
   ```
   **Output:** ________________________________________________

---

## Part III: Programming Problems (15 points)

**Write complete Java programs from scratch for each problem:**

### Problem 1: Array Analysis - Even/Odd Counter (8 points)

Write a complete Java program that:

- Creates an array with these numbers: {12, 7, 25, 18, 3, 22, 9, 14, 31, 6}
- Counts how many even numbers are in the array
- Counts how many odd numbers are in the array
- Prints both counts

**Expected Output:**

```
Even numbers: 5
Odd numbers: 5
```

```java
public class EvenOddCounter {
    public static void main(String[] args) {
        // Write your complete solution here
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
```

### Problem 2: Piecewise Function Calculator (7 points)

Write a complete Java program that calculates a value based on this piecewise
function:

```
f(x) = {
    x + 10        if x < 0
    x * 2         if 0 ≤ x ≤ 10  
    x - 5         if x > 10
}
```

Your program should:

- Test with x = -5, x = 5, and x = 15
- Print the input value and calculated result for each test case

**Expected Output:**

```
f(-5) = 5
f(5) = 10
f(15) = 10
```

```java
public class PiecewiseFunction {
    public static void main(String[] args) {
        // Write your complete solution here
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
```
