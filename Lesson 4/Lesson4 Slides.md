# Lesson 4 Slides: Loops & Iteration (Java)

---
## Why Loops?
- Loops let you repeat actions without repeating code.
- Use loops to iterate over ranges, arrays, and collections.
---

## The `for` Loop (basic)

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// prints 0 1 2 3 4
```

- Components: initialization; condition; update
- Common uses: counting, indexed access to arrays

---
## The `while` Loop
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```
- Condition checked before body (may not run at all)
---

## The `do-while` Loop

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

- Body runs at least once; condition checked after body

---
## Loop Equivalence
- `for` can usually replace `while` and `do-while` — they're often interchangeable.
---

## Common Patterns

- Looping through arrays

```java
int[] arr = {2,4,6};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

- Enhanced for-loop (for-each)

```java
for (int val : arr) {
    System.out.println(val);
}
```

---
## Nested Loops
```java
for (int r = 0; r < 3; r++) {
    for (int c = 0; c < 4; c++) {
        System.out.print("("+r+","+c+") ");
    }
    System.out.println();
}
```
- Use nested loops for grids, matrices, and repeated inner work
---

## Common Pitfalls

- Off-by-one errors (<= vs <)
- Infinite loops (bad condition or no update)
- Modifying loop variable inside body in unexpected ways

---
## Example Problems
1) Print the first 10 even numbers (0 through 18).
2) Sum the numbers from 1 to 100 using a loop.
3) Given a 2D grid 3x3, print coordinates where row == col.
---

## Practice Problems

1. What does this print?

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(i + "," + j + " ");
    }
    System.out.println();
}
```

2. Write a program that reads an integer `n` and prints the factorial of `n`
   (assume n >= 0).

3. Convert this `for` loop to a `while` loop:

```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
```

---
## Practice Answers
1. Output:
```
0,0 0,1
1,0 1,1
2,0 2,1
```
2. Example factorial program (iterative):
```java
public class Factorial {
    public static void main(String[] args) {
        int n = 5; // example
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(result); // prints 120
    }
}
```
3. While version:
```java
int i = 10;
while (i > 0) {
    System.out.println(i);
    i--;
}
```
---

## Quick Quiz (Loops)

1. True/False: A `do-while` loop checks the condition before running the body.
2. What is the time complexity of a nested loop where outer runs n and inner
   runs m? (in Big-O)
3. Fill in: `for (int i = 0; i < n; ___) {}` to double `i` each iteration.

---
## Quiz Answers
1. False — `do-while` runs body first.
2. `O(n*m)`
3. `i *= 2`
---

## Next Lesson Preview

- Arrays and array manipulation
- Searching and sorting basics

---

## Completion Notes

Built from Lesson 3 slides, this lesson introduces iteration patterns used in
algorithms and real programs.
