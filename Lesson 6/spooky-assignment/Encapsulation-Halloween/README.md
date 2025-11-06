# 🎃 Encapsulation Practice: Trick-or-Treat Tracker

### 📘 Overview

This project demonstrates **encapsulation** in Java through a fun Halloween
theme.\
Students create a `TrickOrTreater` class with private data and controlled access
via public methods.

---

## Learning Goals

- Understand and apply **encapsulation** in object-oriented programming.
- Use **private fields** and **public methods** to protect object state.
- Implement a simple main class to demonstrate object behavior.

---

## Files in This Assignment

| File                  | Description                                                     |
| --------------------- | --------------------------------------------------------------- |
| `TrickOrTreater.java` | Contains the encapsulated Trick-or-Treater class.               |
| `HalloweenNight.java` | Contains the `main()` method demonstrating the class in action. |

---

## 🪄 Instructions

1. **Open** your IDE or text editor (VS Code, IntelliJ, BlueJ, etc.).
2. **Create** two Java files named:
   - `TrickOrTreater.java`
   - `HalloweenNight.java`
3. **Implement** your class and main method according to the requirements below.

---

## 🎯 Requirements

### `TrickOrTreater.java`

- Must define a **class named `TrickOrTreater`**.
- Include these **private attributes**:
  ```java
  private String name;
  private int sugarLevel;
  private int candyCount;
  ```

- Include the following **public methods**:
  - `getName()` → returns name
  - `collectCandy(String candy)` → adds candy, increases sugar safely
  - `eatCandy()` → decreases candy count, increases sugar
  - `showStatus()` → prints(not return!) current stats and checks sugar level

- Include one **private helper method**:
  - `checkSugarCrash()` → prints a message depending on sugar level.

### `HalloweenNight.java`

- Must include a **main()** method.
- Inside **main()**:
  - Create a `TrickOrTreater` object.
  - Collect several candies using `collectCandy()`.
  - Display status with `showStatus()`.
  - Eat candy using `eatCandy()`.
  - Display status again.
- ```java
  //Heres a start:
  public HalloweenNight{
    public static void main(String[] Args){
      TrickOrTreater spider = new TrickOrTreater("peter the spider");
      /* (Class)    (label) = new Constructor(parameters);
      * First java will allocate space in memory for a TrickOrTreater Object.
      * It will then look into the constructor function:
      *   You can make multiple constructors for a Object.
      *   For this assignmnet, you will only make one that takes in a String. See above.
      */
    }
  }
  ```
- I have include a comment showing that direct access to private data is not
  allowed:
  ```java
  // jack.candyCount = 100; //Should not compile (can only modify candy bags by calling functions)
  ```

---

## 🧠 Example Output - Just show you have a working class.

```
Jack Skeleton got a Snickers!
Jack Skeleton got a KitKat!
Jack Skeleton got a M&M's!
 Jack Skeleton's candy bag: 3 items | sugar level: 28
Jack Skeleton eats a candy! Sugar level rises.
Jack Skeleton eats a candy! Sugar level rises.
 Jack Skeleton's candy bag: 1 items | sugar level: 50
```

---

## 🧾 Submission

Submit the following files only:

- `TrickOrTreater.java`
- `HalloweenNight.java`

Your code must compile and run successfully using:

```bash
javac *.java
java HalloweenNight
```

---

## 🏁 Bonus Challenge (Optional)

Add a second `TrickOrTreater` and let them trade candy — still using
encapsulation only (no inheritance. You can make your own methods).

**Happy Halloween & happy coding!**
