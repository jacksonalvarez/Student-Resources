# Lesson 7: Applied Java Programming

## 2D Arrays & Advanced Object-Oriented Programming

---

## Learning Objectives

By the end of this lesson, you will be able to:

- **Master 2D Arrays**: Create, initialize, and manipulate two-dimensional
  arrays
- **Apply Advanced OOP**: Understand inheritance, polymorphism, abstraction, and
  encapsulation
- **Design Object Systems**: Create cohesive programs using multiple interacting
  classes
- **Appreciate Programming**: Understand the beauty, art, and bigger picture of
  object-oriented design
- **Solve Complex Problems**: Combine 2D arrays with object-oriented principles

---

## Part I: Two-Dimensional Arrays

### What Are 2D Arrays?

A **2D array** is an array of arrays - think of it as a table or grid with rows
and columns.

```
Visual Representation:
    Col 0  Col 1  Col 2
Row 0  [1]    [2]    [3]
Row 1  [4]    [5]    [6] 
Row 2  [7]    [8]    [9]
```

### Declaration and Initialization

```java
// Method 1: Declare then initialize
int[][] matrix = new int[3][4];  // 3 rows, 4 columns

// Method 2: Declare and initialize with values
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Method 3: Jagged arrays (different column lengths)
int[][] jagged = {
    {1, 2},
    {3, 4, 5, 6},
    {7}
};
```

### Accessing Elements

```java
int[][] scores = {
    {85, 92, 78},
    {90, 88, 95},
    {76, 84, 89}
};

// Access element at row 1, column 2
int grade = scores[1][2];  // Gets 95

// Modify element
scores[0][1] = 100;  // Changes 92 to 100
```

### Common 2D Array Operations

#### 1. Printing a 2D Array

```java
public static void print2DArray(int[][] arr) {
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + "\t");
        }
        System.out.println();  // New line after each row
    }
}
```

#### 2. Finding Sum of All Elements

```java
public static int sumAll(int[][] arr) {
    int total = 0;
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            total += arr[row][col];
        }
    }
    return total;
}
```

#### 3. Finding Maximum Element

```java
public static int findMax(int[][] arr) {
    int max = arr[0][0];
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] > max) {
                max = arr[row][col];
            }
        }
    }
    return max;
}
```

### Real-World 2D Array Applications

1. **Game Boards**: Chess, Tic-Tac-Toe, Battleship
2. **Image Processing**: Pixel matrices
3. **Spreadsheets**: Rows and columns of data
4. **Mathematical Matrices**: Linear algebra operations
5. **Maps and Grids**: Geographic data, floor plans

---

## Part II: Advanced Object-Oriented Programming

### Review: The Four Pillars of OOP

#### 1. **Encapsulation** (Data Hiding)

- Keep data private, provide public methods to access it
- Protects data integrity and provides controlled access

```java
public class BankAccount {
    private double balance;  // Hidden from outside access
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public double getBalance() {
        return balance;  // Controlled access
    }
}
```

#### 2. **Inheritance** (IS-A Relationship)

- Create new classes based on existing classes
- Child classes inherit properties and methods from parent

```java
// Parent class
public class Animal {
    protected String name;
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

// Child class
public class Dog extends Animal {
    public Dog(String dogName) {
        this.name = dogName;
    }
    
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}
```

#### 3. **Polymorphism** (Many Forms)

- Same method name, different behaviors in different classes
- Method overriding and method overloading

```java
public class Shape {
    public double getArea() {
        return 0;  // Default implementation
    }
}

public class Circle extends Shape {
    private double radius;
    
    public Circle(double r) { this.radius = r; }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double width, height;
    
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }
    
    @Override
    public double getArea() {
        return width * height;
    }
}
```

#### 4. **Abstraction** (Hide Complexity)

- Focus on what an object does, not how it does it
- Abstract classes and interfaces

```java
public abstract class Vehicle {
    protected String brand;
    
    // Abstract method - must be implemented by subclasses
    public abstract void start();
    
    // Concrete method - can be inherited as-is
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

public class Car extends Vehicle {
    public Car(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void start() {
        System.out.println(brand + " car engine started");
    }
}
```

---

## Part III: The Art and Beauty of Programming

### Why Object-Oriented Programming?

#### **1. Models Real World**

- Objects represent real-world entities
- Relationships between objects mirror real relationships
- Natural way of thinking about problems

```java
// Real world: A school has students, teachers, and courses
public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Course> courses;
    
    // Methods that represent real actions
    public void enrollStudent(Student student, Course course) {
        // Logic for enrollment
    }
}
```

#### **2. Code Reusability**

- Write once, use many times
- Inheritance allows sharing common functionality
- Reduces development time and bugs

#### **3. Maintainability**

- Changes to one class don't affect others (if well-designed)
- Easy to add new features
- Bug fixes are localized

#### **4. Scalability**

- Easy to add new types of objects
- Systems can grow without major restructuring
- Team development becomes possible

### The Beauty of Well-Designed Code

#### **Elegant Solutions**

```java
// Beautiful: Simple, clear, expressive
public class Temperature {
    private double celsius;
    
    public Temperature(double celsius) {
        this.celsius = celsius;
    }
    
    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32;
    }
    
    public double toKelvin() {
        return celsius + 273.15;
    }
    
    @Override
    public String toString() {
        return celsius + "°C";
    }
}
```

#### **Code as Communication**

- Code should tell a story
- Names should be descriptive
- Structure should be logical
- Comments should explain "why," not "what"

#### **The Programming Mindset**

1. **Problem Decomposition**: Break complex problems into smaller parts
2. **Pattern Recognition**: See similarities and abstract common solutions
3. **Systematic Thinking**: Approach problems methodically
4. **Creative Problem Solving**: Find elegant solutions to complex problems

---

## 🔧 Part IV: Combining 2D Arrays with Objects

### Example: Game Board with Pieces

```java
// Game piece class
public class GamePiece {
    private String type;
    private String color;
    
    public GamePiece(String type, String color) {
        this.type = type;
        this.color = color;
    }
    
    public String getType() { return type; }
    public String getColor() { return color; }
    
    @Override
    public String toString() {
        return color.charAt(0) + type.charAt(0);  // e.g., "WK" for White King
    }
}

// Game board class
public class GameBoard {
    private GamePiece[][] board;
    private int rows, cols;
    
    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new GamePiece[rows][cols];
    }
    
    public void placePiece(GamePiece piece, int row, int col) {
        if (isValidPosition(row, col)) {
            board[row][col] = piece;
        }
    }
    
    public GamePiece getPiece(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        }
        return null;
    }
    
    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
    
    public void printBoard() {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == null) {
                    System.out.print("--\t");
                } else {
                    System.out.print(board[r][c] + "\t");
                }
            }
            System.out.println();
        }
    }
}
```

### Example: Student Grade Matrix

```java
public class Student {
    private String name;
    private int id;
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public String getName() { return name; }
    public int getId() { return id; }
    
    @Override
    public String toString() {
        return name + "(ID:" + id + ")";
    }
}

public class GradeBook {
    private Student[] students;
    private String[] assignments;
    private double[][] grades;  // [student][assignment]
    
    public GradeBook(Student[] students, String[] assignments) {
        this.students = students;
        this.assignments = assignments;
        this.grades = new double[students.length][assignments.length];
    }
    
    public void setGrade(int studentIndex, int assignmentIndex, double grade) {
        if (isValidIndices(studentIndex, assignmentIndex)) {
            grades[studentIndex][assignmentIndex] = grade;
        }
    }
    
    public double getStudentAverage(int studentIndex) {
        if (studentIndex < 0 || studentIndex >= students.length) {
            return -1;
        }
        
        double sum = 0;
        int count = 0;
        for (int a = 0; a < assignments.length; a++) {
            if (grades[studentIndex][a] > 0) {  // Assuming 0 means no grade
                sum += grades[studentIndex][a];
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
    
    public double getAssignmentAverage(int assignmentIndex) {
        if (assignmentIndex < 0 || assignmentIndex >= assignments.length) {
            return -1;
        }
        
        double sum = 0;
        int count = 0;
        for (int s = 0; s < students.length; s++) {
            if (grades[s][assignmentIndex] > 0) {
                sum += grades[s][assignmentIndex];
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
    
    private boolean isValidIndices(int studentIndex, int assignmentIndex) {
        return studentIndex >= 0 && studentIndex < students.length &&
               assignmentIndex >= 0 && assignmentIndex < assignments.length;
    }
    
    public void printGradeReport() {
        // Print header
        System.out.print("Student\t\t");
        for (String assignment : assignments) {
            System.out.print(assignment + "\t");
        }
        System.out.println("Average");
        
        // Print student grades
        for (int s = 0; s < students.length; s++) {
            System.out.print(students[s].getName() + "\t");
            for (int a = 0; a < assignments.length; a++) {
                System.out.print(grades[s][a] + "\t");
            }
            System.out.printf("%.2f%n", getStudentAverage(s));
        }
        
        // Print assignment averages
        System.out.print("Class Avg:\t");
        for (int a = 0; a < assignments.length; a++) {
            System.out.printf("%.2f\t", getAssignmentAverage(a));
        }
        System.out.println();
    }
}
```

---

## Part V: Advanced Programming Concepts

### Design Patterns: Common Solutions to Common Problems

#### **1. The Builder Pattern**

```java
public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    
    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
    }
    
    public static class PizzaBuilder {
        private String size;
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean mushrooms = false;
        
        public PizzaBuilder(String size) {
            this.size = size;
        }
        
        public PizzaBuilder addCheese() {
            this.cheese = true;
            return this;
        }
        
        public PizzaBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }
        
        public PizzaBuilder addMushrooms() {
            this.mushrooms = true;
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
}

// Usage: Beautiful, readable code
Pizza myPizza = new Pizza.PizzaBuilder("Large")
    .addCheese()
    .addPepperoni()
    .build();
```

#### **2. The Observer Pattern**

```java
public interface Observer {
    void update(String message);
}

public class NewsAgency {
    private List<Observer> observers = new ArrayList<>();
    private String news;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
    
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

public class NewsChannel implements Observer {
    private String channelName;
    
    public NewsChannel(String name) {
        this.channelName = name;
    }
    
    @Override
    public void update(String news) {
        System.out.println(channelName + " reporting: " + news);
    }
}
```

### The Philosophy of Good Programming

#### **SOLID Principles**

**S** - Single Responsibility Principle

- Each class should have one reason to change
- One class, one job

**O** - Open/Closed Principle

- Open for extension, closed for modification
- Add new features without changing existing code

**L** - Liskov Substitution Principle

- Objects should be replaceable with instances of their subtypes
- Inheritance should make sense

**I** - Interface Segregation Principle

- Many specific interfaces are better than one general-purpose interface
- Don't force classes to depend on methods they don't use

**D** - Dependency Inversion Principle

- Depend on abstractions, not concretions
- High-level modules shouldn't depend on low-level modules

#### **Code as Craft**

Programming is both **science** and **art**:

- **Science**: Logical, systematic, provable
- **Art**: Creative, elegant, expressive
- **Craft**: Practiced skill, attention to detail, pride in workmanship

```java
// This code is functional but not beautiful:
public class C {
    public int d(int[] a) {
        int s = 0;
        for(int i = 0; i < a.length; i++) s += a[i];
        return s;
    }
}

// This code is both functional AND beautiful:
public class ArrayCalculator {
    /**
     * Calculates the sum of all elements in the given array.
     * @param numbers the array of integers to sum
     * @return the sum of all elements
     */
    public int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }
        return totalSum;
    }
}
```

---

## Part VI: Practice Problems

### Problem 1: 2D Array Manipulation

Create a program that:

1. Creates a 4x4 matrix of random numbers (1-100)
2. Finds the sum of each row
3. Finds the sum of each column
4. Finds the sum of the main diagonal
5. Prints everything in a formatted table

### Problem 2: Object-Oriented Design

Design a simple library system with:

- `Book` class (title, author, ISBN, availability)
- `Member` class (name, ID, borrowed books)
- `Library` class (manages books and members)

The system should allow:

- Adding books and members
- Borrowing and returning books
- Finding books by author or title
- Generating a report of all borrowed books

### Problem 3: Combined Challenge

Create a **Battleship Game** using:

- 2D array for the game board
- `Ship` class for different ship types
- `Player` class for game players
- `Game` class to manage the entire game

---

## Key Takeaways

### Technical Skills Mastered

1. **2D Arrays**: Declaration, initialization, manipulation, and iteration
2. **Advanced OOP**: All four pillars in action
3. **Design Patterns**: Common solutions to recurring problems
4. **System Design**: Creating cohesive, interacting objects

### Programming Mindset Developed

1. **Abstraction**: Thinking in terms of objects and relationships
2. **Decomposition**: Breaking complex problems into manageable parts
3. **Pattern Recognition**: Seeing similarities and applying known solutions
4. **Elegant Design**: Writing code that is both functional and beautiful

### The Bigger Picture

Programming is not just about making computers do things. It's about:

- **Problem Solving**: Finding creative solutions to complex challenges
- **Communication**: Writing code that other humans can understand
- **Artistry**: Creating elegant, efficient, and maintainable solutions
- **Impact**: Building systems that improve people's lives

---

## Looking Forward

You've now learned the fundamentals of Java programming and object-oriented
design. You have the tools to:

- **Build Complex Systems**: Combine multiple classes and data structures
- **Think Abstractly**: Model real-world problems as object interactions
- **Write Maintainable Code**: Create programs that others can understand and
  extend
- **Continue Learning**: Apply these principles to new languages and
  technologies

Remember: **Great programmers are not just coders—they are problem solvers,
designers, and artists.**

---

## Homework Assignment

See `Lesson7_Homework_Applied_Programming.java` for a comprehensive project that
combines 2D arrays with object-oriented programming principles.

---

_"The best programs are written not just for computers to execute, but for
humans to read and understand."_ - Harold Abelson
