/*
 * Lesson 7 Demonstration: Applied Java Programming
 * Complete working examples of 2D arrays and OOP concepts
 * 
 * This file shows complete implementations of the concepts covered in Lesson 7.
 * Use this as a reference for understanding proper implementation.
 */

// =============================================================================
// DEMONSTRATION 1: Advanced 2D Array Operations
// =============================================================================

class Matrix2D {
    private int[][] data;
    private int rows, cols;
    
    public Matrix2D(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }
    
    public Matrix2D(int[][] initialData) {
        this.rows = initialData.length;
        this.cols = initialData[0].length;
        this.data = new int[rows][cols];
        
        // Deep copy the data
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = initialData[i][j];
            }
        }
    }
    
    public void setValue(int row, int col, int value) {
        if (isValidPosition(row, col)) {
            data[row][col] = value;
        }
    }
    
    public int getValue(int row, int col) {
        if (isValidPosition(row, col)) {
            return data[row][col];
        }
        return Integer.MIN_VALUE; // Error value
    }
    
    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
    
    public int[] getRowSums() {
        int[] sums = new int[rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums[i] += data[i][j];
            }
        }
        return sums;
    }
    
    public int[] getColumnSums() {
        int[] sums = new int[cols];
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                sums[j] += data[i][j];
            }
        }
        return sums;
    }
    
    public int getDiagonalSum() {
        int sum = 0;
        int minDimension = Math.min(rows, cols);
        for (int i = 0; i < minDimension; i++) {
            sum += data[i][i];
        }
        return sum;
    }
    
    public Matrix2D transpose() {
        Matrix2D transposed = new Matrix2D(cols, rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed.data[j][i] = this.data[i][j];
            }
        }
        return transposed;
    }
    
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d ", data[i][j]);
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrix2D[").append(rows).append("x").append(cols).append("]:\n");
        for (int i = 0; i < rows; i++) {
            sb.append("[");
            for (int j = 0; j < cols; j++) {
                sb.append(String.format("%4d", data[i][j]));
                if (j < cols - 1) sb.append(",");
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}

// =============================================================================
// DEMONSTRATION 2: Complete OOP Example - Vehicle Hierarchy
// =============================================================================

// Abstract base class demonstrating abstraction
abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Abstract methods must be implemented by subclasses
    public abstract void start();
    public abstract void stop();
    public abstract double calculateInsurance();
    
    // Concrete methods can be inherited as-is
    public void displayInfo() {
        System.out.println(year + " " + brand + " " + model + " - $" + price);
    }
    
    // Getters and setters (encapsulation)
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }
    
    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }
}

// Inheritance: Car extends Vehicle
class Car extends Vehicle {
    private int numDoors;
    private boolean isAutomatic;
    
    public Car(String brand, String model, int year, double price, int numDoors, boolean isAutomatic) {
        super(brand, model, year, price); // Call parent constructor
        this.numDoors = numDoors;
        this.isAutomatic = isAutomatic;
    }
    
    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + model + " with ignition key");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping " + brand + " " + model + " - engine off");
    }
    
    @Override
    public double calculateInsurance() {
        // Simple insurance calculation based on price and age
        double baseRate = price * 0.05;
        int age = 2024 - year;
        if (age > 10) baseRate *= 0.8; // Discount for older cars
        return baseRate;
    }
    
    // Car-specific methods
    public void honkHorn() {
        System.out.println("Beep beep!");
    }
    
    public int getNumDoors() { return numDoors; }
    public boolean isAutomatic() { return isAutomatic; }
    
    @Override
    public String toString() {
        return super.toString() + " (" + numDoors + " doors, " + 
               (isAutomatic ? "Automatic" : "Manual") + ")";
    }
}

// Another inheritance example
class Motorcycle extends Vehicle {
    private int engineSize; // in CC
    private boolean hasSidecar;
    
    public Motorcycle(String brand, String model, int year, double price, int engineSize, boolean hasSidecar) {
        super(brand, model, year, price);
        this.engineSize = engineSize;
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + model + " - kick start!");
    }
    
    @Override
    public void stop() {
        System.out.println("Stopping " + brand + " " + model + " - engine off");
    }
    
    @Override
    public double calculateInsurance() {
        // Higher risk for motorcycles
        double baseRate = price * 0.08;
        if (engineSize > 600) baseRate *= 1.5; // Higher rate for powerful bikes
        return baseRate;
    }
    
    public void wheelie() {
        System.out.println("Performing a wheelie on " + brand + " " + model + "!");
    }
    
    public int getEngineSize() { return engineSize; }
    public boolean hasSidecar() { return hasSidecar; }
    
    @Override
    public String toString() {
        return super.toString() + " (" + engineSize + "cc" + 
               (hasSidecar ? ", with sidecar" : "") + ")";
    }
}

// =============================================================================
// DEMONSTRATION 3: Complex System - Game World with 2D Grid
// =============================================================================

// Game entity base class
abstract class GameEntity {
    protected int x, y;
    protected char symbol;
    protected String name;
    
    public GameEntity(int x, int y, char symbol, String name) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.name = name;
    }
    
    public abstract void interact();
    
    public int getX() { return x; }
    public int getY() { return y; }
    public char getSymbol() { return symbol; }
    public String getName() { return name; }
    
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
    
    @Override
    public String toString() {
        return name + " at (" + x + ", " + y + ")";
    }
}

// Player class
class Player extends GameEntity {
    private int health;
    private int score;
    
    public Player(int x, int y, String name) {
        super(x, y, 'P', name);
        this.health = 100;
        this.score = 0;
    }
    
    @Override
    public void interact() {
        System.out.println(name + " explores the area...");
    }
    
    public void collectTreasure(int points) {
        score += points;
        System.out.println(name + " collected treasure! Score: " + score);
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " took " + damage + " damage. Health: " + health);
    }
    
    public boolean isAlive() { return health > 0; }
    public int getHealth() { return health; }
    public int getScore() { return score; }
}

// Treasure class
class Treasure extends GameEntity {
    private int value;
    private boolean isCollected;
    
    public Treasure(int x, int y, int value) {
        super(x, y, 'T', "Treasure");
        this.value = value;
        this.isCollected = false;
    }
    
    @Override
    public void interact() {
        if (!isCollected) {
            System.out.println("Found treasure worth " + value + " points!");
            isCollected = true;
        } else {
            System.out.println("This treasure has already been collected.");
        }
    }
    
    public int getValue() { return value; }
    public boolean isCollected() { return isCollected; }
    public void collect() { isCollected = true; }
}

// Enemy class
class Enemy extends GameEntity {
    private int damage;
    private boolean isActive;
    
    public Enemy(int x, int y, String name, int damage) {
        super(x, y, 'E', name);
        this.damage = damage;
        this.isActive = true;
    }
    
    @Override
    public void interact() {
        if (isActive) {
            System.out.println(name + " attacks for " + damage + " damage!");
        } else {
            System.out.println(name + " has been defeated.");
        }
    }
    
    public int getDamage() { return damage; }
    public boolean isActive() { return isActive; }
    public void defeat() { isActive = false; }
}

// Game world manager
class GameWorld {
    private GameEntity[][] grid;
    private Player player;
    private int width, height;
    
    public GameWorld(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new GameEntity[height][width];
    }
    
    public void setPlayer(Player player) {
        this.player = player;
        placeEntity(player);
    }
    
    public void placeEntity(GameEntity entity) {
        if (isValidPosition(entity.getX(), entity.getY())) {
            grid[entity.getY()][entity.getX()] = entity;
        }
    }
    
    public void removeEntity(int x, int y) {
        if (isValidPosition(x, y)) {
            grid[y][x] = null;
        }
    }
    
    public GameEntity getEntityAt(int x, int y) {
        if (isValidPosition(x, y)) {
            return grid[y][x];
        }
        return null;
    }
    
    private boolean isValidPosition(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
    
    public boolean movePlayer(int deltaX, int deltaY) {
        int newX = player.getX() + deltaX;
        int newY = player.getY() + deltaY;
        
        if (!isValidPosition(newX, newY)) {
            System.out.println("Cannot move there - out of bounds!");
            return false;
        }
        
        GameEntity entityAtDestination = getEntityAt(newX, newY);
        
        // Clear current position
        removeEntity(player.getX(), player.getY());
        
        // Handle interaction with entity at destination
        if (entityAtDestination != null) {
            handleInteraction(entityAtDestination);
        }
        
        // Move player
        player.moveTo(newX, newY);
        placeEntity(player);
        
        return true;
    }
    
    private void handleInteraction(GameEntity entity) {
        entity.interact();
        
        if (entity instanceof Treasure) {
            Treasure treasure = (Treasure) entity;
            if (!treasure.isCollected()) {
                player.collectTreasure(treasure.getValue());
                treasure.collect();
            }
        } else if (entity instanceof Enemy) {
            Enemy enemy = (Enemy) entity;
            if (enemy.isActive()) {
                player.takeDamage(enemy.getDamage());
                enemy.defeat(); // Simple combat - enemy defeated after one hit
            }
        }
    }
    
    public void printWorld() {
        System.out.println("\n=== GAME WORLD ===");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                GameEntity entity = grid[y][x];
                if (entity == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(entity.getSymbol() + " ");
                }
            }
            System.out.println();
        }
        
        System.out.println("\nPlayer Status:");
        System.out.println("Position: (" + player.getX() + ", " + player.getY() + ")");
        System.out.println("Health: " + player.getHealth());
        System.out.println("Score: " + player.getScore());
    }
}

// =============================================================================
// DEMONSTRATION 4: Advanced Grade Management System
// =============================================================================

class AdvancedStudent {
    private String firstName, lastName;
    private int studentId;
    private String email;
    private String major;
    
    public AdvancedStudent(String firstName, String lastName, int studentId, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.major = major;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getStudentId() { return studentId; }
    public String getEmail() { return email; }
    public String getMajor() { return major; }
    
    @Override
    public String toString() {
        return getFullName() + " (ID: " + studentId + ", Major: " + major + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AdvancedStudent student = (AdvancedStudent) obj;
        return studentId == student.studentId;
    }
}

class Assignment {
    private String name;
    private double maxPoints;
    private String type; // "Quiz", "Exam", "Project", etc.
    
    public Assignment(String name, double maxPoints, String type) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.type = type;
    }
    
    public String getName() { return name; }
    public double getMaxPoints() { return maxPoints; }
    public String getType() { return type; }
    
    @Override
    public String toString() {
        return name + " (" + type + ", " + maxPoints + " pts)";
    }
}

class AdvancedGradeManager {
    private AdvancedStudent[] students;
    private Assignment[] assignments;
    private double[][] grades; // [student][assignment]
    private int numStudents, numAssignments;
    private int maxStudents, maxAssignments;
    
    public AdvancedGradeManager(int maxStudents, int maxAssignments) {
        this.maxStudents = maxStudents;
        this.maxAssignments = maxAssignments;
        this.students = new AdvancedStudent[maxStudents];
        this.assignments = new Assignment[maxAssignments];
        this.grades = new double[maxStudents][maxAssignments];
        this.numStudents = 0;
        this.numAssignments = 0;
        
        // Initialize grades to -1 (indicating no grade entered)
        for (int i = 0; i < maxStudents; i++) {
            for (int j = 0; j < maxAssignments; j++) {
                grades[i][j] = -1;
            }
        }
    }
    
    public boolean addStudent(AdvancedStudent student) {
        if (numStudents < maxStudents) {
            students[numStudents++] = student;
            return true;
        }
        return false;
    }
    
    public boolean addAssignment(Assignment assignment) {
        if (numAssignments < maxAssignments) {
            assignments[numAssignments++] = assignment;
            return true;
        }
        return false;
    }
    
    public boolean setGrade(int studentIndex, int assignmentIndex, double grade) {
        if (isValidIndices(studentIndex, assignmentIndex) && grade >= 0) {
            grades[studentIndex][assignmentIndex] = grade;
            return true;
        }
        return false;
    }
    
    public double getGrade(int studentIndex, int assignmentIndex) {
        if (isValidIndices(studentIndex, assignmentIndex)) {
            return grades[studentIndex][assignmentIndex];
        }
        return -1;
    }
    
    private boolean isValidIndices(int studentIndex, int assignmentIndex) {
        return studentIndex >= 0 && studentIndex < numStudents &&
               assignmentIndex >= 0 && assignmentIndex < numAssignments;
    }
    
    public double getStudentAverage(int studentIndex) {
        if (studentIndex < 0 || studentIndex >= numStudents) return -1;
        
        double totalPoints = 0;
        double maxPossible = 0;
        
        for (int a = 0; a < numAssignments; a++) {
            if (grades[studentIndex][a] >= 0) { // Grade has been entered
                totalPoints += grades[studentIndex][a];
                maxPossible += assignments[a].getMaxPoints();
            }
        }
        
        return maxPossible > 0 ? (totalPoints / maxPossible) * 100 : 0;
    }
    
    public double getAssignmentAverage(int assignmentIndex) {
        if (assignmentIndex < 0 || assignmentIndex >= numAssignments) return -1;
        
        double sum = 0;
        int count = 0;
        
        for (int s = 0; s < numStudents; s++) {
            if (grades[s][assignmentIndex] >= 0) {
                sum += (grades[s][assignmentIndex] / assignments[assignmentIndex].getMaxPoints()) * 100;
                count++;
            }
        }
        
        return count > 0 ? sum / count : 0;
    }
    
    public char getLetterGrade(double percentage) {
        if (percentage >= 90) return 'A';
        else if (percentage >= 80) return 'B';
        else if (percentage >= 70) return 'C';
        else if (percentage >= 60) return 'D';
        else return 'F';
    }
    
    public void printDetailedReport() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("DETAILED GRADE REPORT");
        System.out.println("=".repeat(80));
        
        // Print header
        System.out.printf("%-20s", "Student");
        for (int a = 0; a < numAssignments; a++) {
            System.out.printf("%-12s", assignments[a].getName());
        }
        System.out.printf("%-8s %-6s%n", "Average", "Grade");
        System.out.println("-".repeat(80));
        
        // Print student data
        for (int s = 0; s < numStudents; s++) {
            System.out.printf("%-20s", students[s].getFullName());
            
            for (int a = 0; a < numAssignments; a++) {
                if (grades[s][a] >= 0) {
                    double percentage = (grades[s][a] / assignments[a].getMaxPoints()) * 100;
                    System.out.printf("%-12.1f", percentage);
                } else {
                    System.out.printf("%-12s", "---");
                }
            }
            
            double average = getStudentAverage(s);
            char letterGrade = getLetterGrade(average);
            System.out.printf("%-8.1f %-6c%n", average, letterGrade);
        }
        
        System.out.println("-".repeat(80));
        
        // Print assignment averages
        System.out.printf("%-20s", "Class Average:");
        for (int a = 0; a < numAssignments; a++) {
            double avg = getAssignmentAverage(a);
            System.out.printf("%-12.1f", avg);
        }
        System.out.println();
        System.out.println("=".repeat(80));
    }
}

// =============================================================================
// MAIN DEMONSTRATION PROGRAM
// =============================================================================

public class Lesson7Demonstration {
    public static void main(String[] args) {
        System.out.println("=== LESSON 7 DEMONSTRATION: APPLIED JAVA PROGRAMMING ===\n");
        
        // Demonstration 1: 2D Array Operations
        demonstrate2DArrays();
        
        // Demonstration 2: OOP with Vehicle Hierarchy
        demonstrateOOP();
        
        // Demonstration 3: Game World System
        demonstrateGameWorld();
        
        // Demonstration 4: Advanced Grade Management
        demonstrateAdvancedGrading();
    }
    
    public static void demonstrate2DArrays() {
        System.out.println("--- DEMONSTRATION 1: 2D ARRAY OPERATIONS ---\n");
        
        // Create and populate a matrix
        int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        Matrix2D matrix = new Matrix2D(data);
        System.out.println("Original Matrix:");
        matrix.printMatrix();
        
        System.out.println("\nRow sums:");
        int[] rowSums = matrix.getRowSums();
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Row " + i + ": " + rowSums[i]);
        }
        
        System.out.println("\nColumn sums:");
        int[] colSums = matrix.getColumnSums();
        for (int i = 0; i < colSums.length; i++) {
            System.out.println("Column " + i + ": " + colSums[i]);
        }
        
        System.out.println("\nDiagonal sum: " + matrix.getDiagonalSum());
        
        System.out.println("\nTransposed Matrix:");
        Matrix2D transposed = matrix.transpose();
        transposed.printMatrix();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    public static void demonstrateOOP() {
        System.out.println("--- DEMONSTRATION 2: OBJECT-ORIENTED PROGRAMMING ---\n");
        
        // Polymorphism: Array of Vehicle references
        Vehicle[] vehicles = {
            new Car("Toyota", "Camry", 2020, 25000, 4, true),
            new Car("Ford", "Mustang", 2019, 35000, 2, false),
            new Motorcycle("Harley", "Sportster", 2021, 15000, 883, false),
            new Motorcycle("Honda", "Gold Wing", 2022, 28000, 1833, true)
        };
        
        System.out.println("Vehicle Inventory:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println("Insurance: $" + String.format("%.2f", vehicle.calculateInsurance()));
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
        
        // Demonstrate specific behaviors
        System.out.println("Specific Vehicle Behaviors:");
        Car car = (Car) vehicles[0];
        car.honkHorn();
        
        Motorcycle bike = (Motorcycle) vehicles[2];
        bike.wheelie();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    public static void demonstrateGameWorld() {
        System.out.println("--- DEMONSTRATION 3: GAME WORLD SYSTEM ---\n");
        
        // Create game world
        GameWorld world = new GameWorld(6, 4);
        
        // Create player
        Player hero = new Player(0, 0, "Hero");
        world.setPlayer(hero);
        
        // Add treasures
        world.placeEntity(new Treasure(2, 1, 100));
        world.placeEntity(new Treasure(4, 2, 150));
        world.placeEntity(new Treasure(5, 3, 200));
        
        // Add enemies
        world.placeEntity(new Enemy(3, 1, "Goblin", 20));
        world.placeEntity(new Enemy(1, 3, "Orc", 30));
        
        // Display initial world
        world.printWorld();
        
        // Simulate some moves
        System.out.println("\n--- GAME SIMULATION ---");
        world.movePlayer(1, 0); // Move right
        world.printWorld();
        
        world.movePlayer(1, 1); // Move right and down (encounter treasure)
        world.printWorld();
        
        world.movePlayer(1, 0); // Move right (encounter enemy)
        world.printWorld();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
    
    public static void demonstrateAdvancedGrading() {
        System.out.println("--- DEMONSTRATION 4: ADVANCED GRADE MANAGEMENT ---\n");
        
        // Create grade manager
        AdvancedGradeManager gradeManager = new AdvancedGradeManager(10, 6);
        
        // Add students
        gradeManager.addStudent(new AdvancedStudent("Alice", "Johnson", 1001, "alice@email.com", "Computer Science"));
        gradeManager.addStudent(new AdvancedStudent("Bob", "Smith", 1002, "bob@email.com", "Mathematics"));
        gradeManager.addStudent(new AdvancedStudent("Carol", "Williams", 1003, "carol@email.com", "Physics"));
        gradeManager.addStudent(new AdvancedStudent("David", "Brown", 1004, "david@email.com", "Engineering"));
        gradeManager.addStudent(new AdvancedStudent("Eve", "Davis", 1005, "eve@email.com", "Computer Science"));
        
        // Add assignments
        gradeManager.addAssignment(new Assignment("Quiz 1", 20, "Quiz"));
        gradeManager.addAssignment(new Assignment("Midterm", 100, "Exam"));
        gradeManager.addAssignment(new Assignment("Project", 50, "Project"));
        gradeManager.addAssignment(new Assignment("Quiz 2", 20, "Quiz"));
        gradeManager.addAssignment(new Assignment("Final", 100, "Exam"));
        
        // Set grades (realistic data)
        // Alice (excellent student)
        gradeManager.setGrade(0, 0, 19);  // Quiz 1: 95%
        gradeManager.setGrade(0, 1, 88);  // Midterm: 88%
        gradeManager.setGrade(0, 2, 47);  // Project: 94%
        gradeManager.setGrade(0, 3, 18);  // Quiz 2: 90%
        gradeManager.setGrade(0, 4, 91);  // Final: 91%
        
        // Bob (good student)
        gradeManager.setGrade(1, 0, 16);  // Quiz 1: 80%
        gradeManager.setGrade(1, 1, 78);  // Midterm: 78%
        gradeManager.setGrade(1, 2, 42);  // Project: 84%
        gradeManager.setGrade(1, 3, 17);  // Quiz 2: 85%
        gradeManager.setGrade(1, 4, 82);  // Final: 82%
        
        // Carol (average student)
        gradeManager.setGrade(2, 0, 14);  // Quiz 1: 70%
        gradeManager.setGrade(2, 1, 72);  // Midterm: 72%
        gradeManager.setGrade(2, 2, 38);  // Project: 76%
        gradeManager.setGrade(2, 3, 15);  // Quiz 2: 75%
        gradeManager.setGrade(2, 4, 74);  // Final: 74%
        
        // David (struggling student)
        gradeManager.setGrade(3, 0, 12);  // Quiz 1: 60%
        gradeManager.setGrade(3, 1, 65);  // Midterm: 65%
        gradeManager.setGrade(3, 2, 32);  // Project: 64%
        gradeManager.setGrade(3, 3, 13);  // Quiz 2: 65%
        gradeManager.setGrade(3, 4, 67);  // Final: 67%
        
        // Eve (excellent student with one missing assignment)
        gradeManager.setGrade(4, 0, 20);  // Quiz 1: 100%
        gradeManager.setGrade(4, 1, 95);  // Midterm: 95%
        // Missing Project grade
        gradeManager.setGrade(4, 3, 19);  // Quiz 2: 95%
        gradeManager.setGrade(4, 4, 96);  // Final: 96%
        
        // Print detailed report
        gradeManager.printDetailedReport();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
    }
}

/*
 * =============================================================================
 * KEY CONCEPTS DEMONSTRATED
 * =============================================================================
 * 
 * 2D Array Concepts:
 * - Creation and initialization of 2D arrays
 * - Nested loops for traversing 2D arrays
 * - Row and column operations
 * - Matrix operations (transpose, sums)
 * - Encapsulating 2D arrays in classes
 * 
 * Object-Oriented Programming:
 * - Abstraction (abstract Vehicle class)
 * - Inheritance (Car and Motorcycle extend Vehicle)
 * - Polymorphism (Vehicle array containing different types)
 * - Encapsulation (private variables, public methods)
 * - Method overriding (@Override annotations)
 * 
 * Advanced OOP Patterns:
 * - Composition (GameWorld contains GameEntities)
 * - Has-a relationships (Student has grades)
 * - Type checking and casting (instanceof operator)
 * - Complex object interactions
 * 
 * Real-World Applications:
 * - Game development (grid-based world)
 * - Educational software (grade management)
 * - Data management (student records)
 * - System design (vehicle inventory)
 * 
 * Best Practices Shown:
 * - Input validation and bounds checking
 * - Clear method names and purposes
 * - Proper use of access modifiers
 * - Meaningful toString() and equals() methods
 * - Error handling and edge cases
 * - Clean, readable code structure
 * 
 * =============================================================================
 */