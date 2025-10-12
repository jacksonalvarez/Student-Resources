# Lesson 6: Introduction to Classes and Objects

## Learning Objectives

By the end of this lesson, you will be able to:

- Understand the difference between procedure and object-oriented programming
- Define and create classes in Java
- Understand instance variables, methods, and constructors
- Create and use objects (instances of classes)
- Apply encapsulation principles with private variables and public methods
- Compare procedure vs. object-oriented approaches using real examples

---

## 📖 What Are Classes and Objects?

### Procedure vs. Object-Oriented Programming

**Procedure Programming (what we've been doing):**

- Code is organized as a sequence of functions/methods
- Data and functions are separate
- Example: Our original `GradeCalculator.java`

**Object-Oriented Programming (OOP):**

- Code is organized around objects that contain both data and methods
- Data and methods are bundled together in classes
- Example: Our new `GradeCalculatorClass.java`

### Real-World Analogy: A Car

Think of a **class** as a blueprint for a car:

- The blueprint defines what a car should have (wheels, engine, color)
- The blueprint defines what a car can do (start, stop, turn)

An **object** is an actual car built from that blueprint:

- Your red Toyota Camry is an object of the Car class
- My blue Honda Civic is another object of the Car class
- Both cars have the same structure but different data (color, model, etc.)

---

## 🔧 From Procedure to Object-Oriented: GradeCalculator Example

### The Procedure Approach (GradeCalculator.java)

```java
public class GradeCalculator {
    public static void main(String[] args) {
        // Data is defined in main method
        int[] grades = {90, 74, 100, 40, 88, 91, 83};
        String[] students = {"Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"}; 
        
        // All calculations happen in main method
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        
        double average = (double) sum / grades.length;
        
        // More calculations...
        // All logic is in one place
    }
}
```

**Problems with this approach:**

- ❌ All code is in one method (hard to read)
- ❌ Can't reuse the calculator for different data
- ❌ Data and methods are mixed together
- ❌ Hard to test individual pieces
- ❌ Not modular or organized

### The Object-Oriented Approach (GradeCalculatorClass.java)

```java
public class GradeCalculatorClass {
    // Instance variables (data) - private for encapsulation
    private int[] grades;
    private String[] studentNames;
    private int sum;
    private double average;
    private int highest;
    private int lowest;
    private boolean calculated;
    
    // Constructor - creates the object
    public GradeCalculatorClass(String[] studentNames, int[] grades) {
        this.studentNames = studentNames;  // Copy the data
        this.grades = grades;
        this.calculated = false;
    }
    
    // Methods (behavior) - public interface
    public void calculateStatistics() {
        // Calculate sum
        sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        
        // Calculate average
        average = (double) sum / grades.length;
        
        // Find highest and lowest
        highest = grades[0];
        lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }
        
        calculated = true;
    }
    
    public int getSum() {
        if (!calculated) throw new IllegalStateException("Must calculate first!");
        return sum;
    }
    
    public double getAverage() {
        if (!calculated) throw new IllegalStateException("Must calculate first!");
        return average;
    }
    
    // More methods...
}
```

**Benefits of this approach:**

- ✅ Code is organized and modular
- ✅ Can create multiple calculators with different data
- ✅ Data is protected (encapsulated)
- ✅ Each method has a single responsibility
- ✅ Easy to test and maintain
- ✅ Reusable and extensible

---

## 🏗️ Key Components of a Class

### 1. Instance Variables (Fields)

```java
private int[] grades;           // Stores the grade data
private String[] studentNames;  // Stores student names
private boolean calculated;     // Tracks state
```

- **Private**: Can only be accessed within the class (encapsulation)
- **Instance**: Each object has its own copy of these variables
- **State**: Represents the current state/data of the object

### 2. Constructors

```java
// Default constructor
public GradeCalculatorClass() {
    this.studentNames = {"Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"};
    this.grades = {90, 74, 100, 40, 88, 91, 83};
    this.calculated = false;
}

// Parameterized constructor
public GradeCalculatorClass(String[] names, int[] grades) {
    this.studentNames = names.clone();
    this.grades = grades.clone();
    this.calculated = false;
}
```

- **Purpose**: Initialize object when created
- **No return type**: Constructors don't have return types
- **Same name as class**: Must match the class name exactly
- **Overloading**: Can have multiple constructors with different parameters

### 3. Methods (Behavior)

```java
public void calculateStatistics() {     // Action method
    // Performs calculations
}

public int getSum() {                   // Getter method
    return sum;
}

public void printResults() {            // Output method
    // Prints formatted results
}

private void validateInput() {          // Helper method
    // Private method for internal use
}
```

- **Public**: Can be called from outside the class
- **Private**: Only used within the class (helper methods)
- **Return types**: Methods can return values or be void
- **Parameters**: Methods can accept input parameters

---

## 🔒 Encapsulation: Protecting Your Data

### Why Encapsulation Matters

```java
// BAD: Public variables (anyone can change them)
public class BadGradeCalculator {
    public int[] grades;  // Anyone can modify this!
    public boolean calculated;
    
    public double getAverage() {
        return sum / grades.length;  // What if someone changed grades?
    }
}

// Usage - This breaks everything!
BadGradeCalculator calc = new BadGradeCalculator();
calc.grades = null;  // Oops! This will crash getAverage()
calc.calculated = true;  // Lying about the state!
```

```java
// GOOD: Private variables with public methods
public class GoodGradeCalculator {
    private int[] grades;        // Protected from outside changes
    private boolean calculated;  // Internal state management
    
    public int[] getGrades() {
        return grades.clone();   // Return a copy, not original
    }
    
    public double getAverage() {
        if (!calculated) {
            throw new IllegalStateException("Calculate first!");
        }
        return average;
    }
}
```

### The Encapsulation Rules

1. **Make instance variables private**
2. **Provide public methods to access data (getters/setters)**
3. **Validate data before storing it**
4. **Return copies of arrays/objects, not originals**
5. **Control when and how data can be modified**

---

## 🚀 Creating and Using Objects

### Object Creation Syntax

```java
// Creating objects using constructors
GradeCalculatorClass calc1 = new GradeCalculatorClass();  // Default constructor

String[] names = {"Alice", "Bob", "Charlie"};
int[] scores = {95, 87, 92};
GradeCalculatorClass calc2 = new GradeCalculatorClass(names, scores);  // Parameterized
```

### Using Objects

```java
public class TestGradeCalculator {
    public static void main(String[] args) {
        // Create an object
        GradeCalculatorClass calculator = new GradeCalculatorClass();
        
        // Use the object's methods
        calculator.calculateStatistics();     // Perform calculations
        
        int sum = calculator.getSum();        // Get results
        double avg = calculator.getAverage();
        int high = calculator.getHighest();
        
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Highest: " + high);
        
        // Create another calculator with different data
        String[] newNames = {"Rey", "Finn", "Poe"};
        int[] newGrades = {88, 92, 85};
        GradeCalculatorClass calc2 = new GradeCalculatorClass(newNames, newGrades);
        
        calc2.calculateStatistics();
        System.out.println("Second calculator average: " + calc2.getAverage());
    }
}
```

---

## 🔄 Complete Example: Building GradeCalculatorClass Step by Step

### Step 1: Define the Class Structure

```java
public class GradeCalculatorClass {
    // Step 1: Define what data our class needs
    private int[] grades;
    private String[] studentNames;
    private int sum;
    private double average;
    private int highest;
    private int lowest;
    private boolean calculated;
}
```

### Step 2: Add Constructors

```java
public class GradeCalculatorClass {
    // ... instance variables ...
    
    // Default constructor with preset data
    public GradeCalculatorClass() {
        this.grades = new int[]{90, 74, 100, 40, 88, 91, 83};
        this.studentNames = new String[]{"Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"};
        this.calculated = false;
    }
    
    // Constructor that accepts custom data
    public GradeCalculatorClass(String[] studentNames, int[] grades) {
        if (studentNames == null || grades == null) {
            throw new IllegalArgumentException("Arrays cannot be null");
        }
        if (studentNames.length != grades.length) {
            throw new IllegalArgumentException("Arrays must be same length");
        }
        
        this.studentNames = studentNames.clone();  // Make copies
        this.grades = grades.clone();
        this.calculated = false;
    }
}
```

### Step 3: Add Calculation Methods

```java
public void calculateStatistics() {
    // Calculate sum
    sum = 0;
    for (int grade : grades) {
        sum += grade;
    }
    
    // Calculate average
    average = (double) sum / grades.length;
    
    // Find highest and lowest
    highest = grades[0];
    lowest = grades[0];
    
    for (int i = 1; i < grades.length; i++) {
        if (grades[i] > highest) {
            highest = grades[i];
        }
        if (grades[i] < lowest) {
            lowest = grades[i];
        }
    }
    
    calculated = true;  // Mark as calculated
}
```

### Step 4: Add Getter Methods

```java
public int getSum() {
    ensureCalculated();
    return sum;
}

public double getAverage() {
    ensureCalculated();
    return average;
}

public int getHighest() {
    ensureCalculated();
    return highest;
}

public int getLowest() {
    ensureCalculated();
    return lowest;
}

public int getTotalGrades() {
    return grades.length;
}

// Helper method to check if calculations are done
private void ensureCalculated() {
    if (!calculated) {
        throw new IllegalStateException("Must call calculateStatistics() first!");
    }
}
```

### Step 5: Add Array Getters (Return Copies!)

```java
public int[] getGrades() {
    return grades.clone();  // Return copy, not original
}

public String[] getStudentNames() {
    return studentNames.clone();  // Return copy, not original
}
```

### Step 6: Add Output Methods

```java
public void printStudentGrades() {
    System.out.println("Student Grades:");
    for (int i = 0; i < studentNames.length; i++) {
        System.out.println(studentNames[i] + ": " + grades[i]);
    }
}

public void printStatistics() {
    ensureCalculated();
    System.out.println("Total grades: " + getTotalGrades());
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
    System.out.println("Highest: " + highest);
    System.out.println("Lowest: " + lowest);
}

public void printCompleteReport() {
    printStudentGrades();
    printStatistics();
}
```

---

## 🧪 Testing Your Class

### Using the GradeCalculatorTest

```java
// The test will check:
// 1. Can you create objects?
// 2. Do the calculations work correctly?
// 3. Are you properly encapsulating data?
// 4. Does the output match exactly?

public static void main(String[] args) {
    // Test 1: Default constructor
    GradeCalculatorClass calc = new GradeCalculatorClass();
    calc.calculateStatistics();
    calc.printCompleteReport();
    
    // Test 2: Custom data
    String[] names = {"Test1", "Test2"};
    int[] scores = {100, 85};
    GradeCalculatorClass calc2 = new GradeCalculatorClass(names, scores);
    calc2.calculateStatistics();
    System.out.println("Custom average: " + calc2.getAverage());
}
```

---

## 🎯 Key Concepts Review

### Classes vs Objects

- **Class**: Blueprint/template (like a cookie cutter)
- **Object**: Instance created from class (like individual cookies)

### Instance Variables vs Local Variables

```java
public class Example {
    private int instanceVar;  // Belongs to each object
    
    public void method() {
        int localVar = 5;     // Only exists in this method
    }
}
```

### Static vs Instance

```java
public class GradeCalculatorClass {
    private int[] grades;                    // Instance variable
    
    public void calculateStatistics() {      // Instance method
        // Works with this object's data
    }
    
    public static void main(String[] args) { // Static method
        // Belongs to class, not any specific object
    }
}
```

### Method Types

- **Constructors**: Initialize objects
- **Getters**: Return private data
- **Setters**: Modify private data (with validation)
- **Business methods**: Perform main functionality
- **Helper methods**: Support other methods (usually private)

---

## 💡 Best Practices

### 1. Naming Conventions

```java
public class GradeCalculatorClass {        // PascalCase for classes
    private int[] grades;                  // camelCase for variables
    private boolean isCalculated;          // boolean: is/has/can prefix
    
    public void calculateStatistics() {    // camelCase for methods
        // method body
    }
    
    private static final int MAX_GRADE = 100;  // UPPER_CASE for constants
}
```

### 2. Constructor Best Practices

```java
public GradeCalculatorClass(String[] names, int[] grades) {
    // Validate input
    if (names == null || grades == null) {
        throw new IllegalArgumentException("Parameters cannot be null");
    }
    
    // Make defensive copies
    this.studentNames = names.clone();
    this.grades = grades.clone();
    
    // Initialize state
    this.calculated = false;
}
```

### 3. Getter Best Practices

```java
// For primitive types - direct return is OK
public int getSum() {
    ensureCalculated();
    return sum;
}

// For arrays/objects - return copies
public int[] getGrades() {
    return grades.clone();  // Protect original data
}

// For validation
private void ensureCalculated() {
    if (!calculated) {
        throw new IllegalStateException("Must calculate statistics first");
    }
}
```

### 4. Method Design

```java
// Single Responsibility Principle
public void calculateStatistics() {
    calculateSum();
    calculateAverage();
    findHighestAndLowest();
    calculated = true;
}

private void calculateSum() {
    sum = 0;
    for (int grade : grades) {
        sum += grade;
    }
}

private void calculateAverage() {
    average = (double) sum / grades.length;
}

private void findHighestAndLowest() {
    highest = lowest = grades[0];
    for (int grade : grades) {
        if (grade > highest) highest = grade;
        if (grade < lowest) lowest = grade;
    }
}
```

---

## 🚀 Practice Exercises

### Exercise 1: Create a Student Class

Create a `Student` class with:

- Private variables: name, id, grade
- Constructor that takes all three parameters
- Getters for all variables
- A method `isPasssing()` that returns true if grade >= 60
- A `toString()` method that returns formatted student info

### Exercise 2: Extend GradeCalculatorClass

Add these methods to GradeCalculatorClass:

- `getPassingStudents()` - returns array of students with grade >= 60
- `getFailingStudents()` - returns array of students with grade < 60
- `getLetterGrade(int grade)` - converts numeric grade to letter grade
- `printGradeDistribution()` - shows how many A's, B's, C's, etc.

### Exercise 3: Create Multiple Objects

Write a main method that:

- Creates 3 different GradeCalculatorClass objects with different data
- Calculates statistics for each
- Compares which class has the highest average
- Prints a summary report

---

## 🔍 Common Mistakes and How to Fix Them

### 1. Forgetting to Make Variables Private

```java
// ❌ Wrong
public class BadExample {
    public int[] data;  // Anyone can modify this!
}

// ✅ Correct
public class GoodExample {
    private int[] data;  // Protected
    
    public int[] getData() {
        return data.clone();  // Return copy
    }
}
```

### 2. Not Validating Constructor Parameters

```java
// ❌ Wrong
public GradeCalculatorClass(String[] names, int[] grades) {
    this.names = names;  // What if names is null?
    this.grades = grades;
}

// ✅ Correct
public GradeCalculatorClass(String[] names, int[] grades) {
    if (names == null || grades == null) {
        throw new IllegalArgumentException("Parameters cannot be null");
    }
    if (names.length != grades.length) {
        throw new IllegalArgumentException("Arrays must be same length");
    }
    this.names = names.clone();
    this.grades = grades.clone();
}
```

### 3. Returning Original Arrays Instead of Copies

```java
// ❌ Wrong - Breaks encapsulation
public int[] getGrades() {
    return grades;  // Anyone can modify the original!
}

// ✅ Correct - Protects data
public int[] getGrades() {
    return grades.clone();  // Returns a safe copy
}
```

### 4. Not Managing Object State

```java
// ❌ Wrong - No state tracking
public int getSum() {
    return sum;  // What if sum was never calculated?
}

// ✅ Correct - Check state first
public int getSum() {
    if (!calculated) {
        throw new IllegalStateException("Must calculate statistics first");
    }
    return sum;
}
```

---

## 🎓 Summary

### What You Learned

- **Classes** are blueprints that define data and behavior
- **Objects** are instances created from classes
- **Encapsulation** protects data by making variables private
- **Constructors** initialize objects when they're created
- **Methods** define what objects can do
- **Instance variables** store each object's unique data

### Procedure vs Object-Oriented

| Procedure                            | Object-Oriented                       |
| ------------------------------------ | ------------------------------------- |
| Functions operate on data            | Objects contain both data and methods |
| Data and functions are separate      | Data and methods are bundled together |
| Hard to reuse and maintain           | Easy to reuse and extend              |
| Global data can be modified anywhere | Data is protected and controlled      |

### Next Steps

1. Complete the GradeCalculatorClass implementation
2. Run the GradeCalculatorTest to verify your work
3. Practice creating your own classes
4. Learn about inheritance and polymorphism (Lesson 7)

---

## 📚 Additional Resources

- [Oracle Java Tutorial - Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/)
- [Java Encapsulation Explained](https://www.w3schools.com/java/java_encapsulation.asp)
- [Constructor Best Practices](https://www.baeldung.com/java-constructors)

Remember: Object-oriented programming is about organizing code in a way that
mirrors real-world relationships and makes your programs easier to understand,
maintain, and extend!
