# Lesson 2: Review & Introduction to Variables and Assignment

## 1. Quick Review of Lesson 1 (Primitives & Expressions)

- Recap Java primitive data types (int, double, boolean, etc.)
- Review arithmetic operators (+, -, *, /, %)
- Discuss operator precedence and integer vs. floating-point division
- Example:
  ```java
  int a = 5, b = 4;
  System.out.println((a + b) / 2);
  System.out.println((a + b) / 2.0);
  ```

## 2. New Concept: Variables and Assignment

- What is a variable? (A named storage for data)
- Declaring variables: `int x;`
- Initializing variables: `x = 10;`
- Declaring and initializing: `int y = 20;`
- Assignment operator `=`
- Changing values:
  ```java
  int score = 0;
  score = score + 5; // score is now 5
  score += 3;        // score is now 8
  ```

## 3. Practice Activity

- Write code to declare two variables, assign them values, and print their sum
  and product.
- Example:
  ```java
  int num1 = 7;
  int num2 = 3;
  System.out.println("Sum: " + (num1 + num2));
  System.out.println("Product: " + (num1 * num2));
  ```

## 4. Quick Quiz

1. What is the output?
   ```java
   int x = 2;
   x = x * 3;
   System.out.println(x);
   ```
2. What does the `+=` operator do?
3. Write a line of code that declares an int variable called `age` and sets it
   to 16.
4. What is the difference between `int` and `double`?
5. Predict the output:
   ```java
   int a = 10;
   int b = 4;
   System.out.println(a / b);
   System.out.println(a / (double)b);
   ```
