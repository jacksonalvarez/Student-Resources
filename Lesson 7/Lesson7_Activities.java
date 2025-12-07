/*
 * Lesson 7 Practice Activities: Applied Java Programming
 * 2D Arrays and Object-Oriented Programming
 * 
 * These activities help you practice the concepts from Lesson 7 before
 * attempting the homework assignment.
 */

// =============================================================================
// ACTIVITY 1: Basic 2D Array Operations (Warm-up)
// =============================================================================

/**
 * Complete the following methods to practice 2D array manipulation.
 */
public class Array2DPractice {
    
    /**
     * Activity 1A: Create and initialize a 2D array
     * Create a 3x3 matrix filled with the numbers 1-9 in row order
     * Expected output:
     * 1 2 3
     * 4 5 6  
     * 7 8 9
     */
    public static int[][] createMatrix() {
        // TODO: Create and return the 3x3 matrix
        
        
    }
    
    /**
     * Activity 1B: Sum of diagonal elements
     * Calculate the sum of the main diagonal (top-left to bottom-right)
     */
    public static int sumMainDiagonal(int[][] matrix) {
        // TODO: Calculate and return the sum of main diagonal
        
        
    }
    
    /**
     * Activity 1C: Find the position of maximum element
     * Return an array with [row, column] of the maximum element
     */
    public static int[] findMaxPosition(int[][] matrix) {
        // TODO: Find and return the position of maximum element
        
        
    }
    
    /**
     * Activity 1D: Print matrix in formatted output
     * Print the matrix with proper spacing and alignment
     */
    public static void printMatrix(int[][] matrix) {
        // TODO: Print the matrix in a nice format
        
        
    }
}

// =============================================================================
// ACTIVITY 2: Object-Oriented Design Practice
// =============================================================================

/**
 * Activity 2: Design a simple Rectangle class
 * This helps you practice encapsulation and method design
 */
class Rectangle {
    // TODO: Add private instance variables for width and height
    
    
    // TODO: Add constructor that takes width and height
    
    
    // TODO: Add getter methods for width and height
    
    
    // TODO: Add setter methods with validation (positive values only)
    
    
    // TODO: Add method to calculate area
    
    
    // TODO: Add method to calculate perimeter
    
    
    // TODO: Add toString method that returns formatted string
    
    
    // TODO: Add equals method that compares rectangles
    
    
}

/**
 * Activity 2B: Inheritance Practice
 * Create a Square class that extends Rectangle
 */
class Square extends Rectangle {
    // TODO: Create constructor that takes only one side length
    
    
    // TODO: Override toString to indicate it's a square
    
    
}

// =============================================================================
// ACTIVITY 3: Combining 2D Arrays with Objects
// =============================================================================

/**
 * Activity 3: Simple Tic-Tac-Toe Board
 * Practice using 2D arrays to store objects
 */
class TicTacToeBoard {
    private char[][] board;
    private int size;
    
    public TicTacToeBoard() {
        this.size = 3;
        this.board = new char[size][size];
        // TODO: Initialize all positions to empty space ' '
        
    }
    
    /**
     * Place a mark (X or O) at the specified position
     */
    public boolean placeMark(int row, int col, char mark) {
        // TODO: Validate position and place mark if valid
        // Return true if successful, false otherwise
        
        
    }
    
    /**
     * Check if the game has a winner
     * Return 'X', 'O', or ' ' for no winner
     */
    public char checkWinner() {
        // TODO: Check rows, columns, and diagonals for winner
        
        
    }
    
    /**
     * Check if the board is full
     */
    public boolean isFull() {
        // TODO: Check if all positions are filled
        
        
    }
    
    /**
     * Print the current board state
     */
    public void printBoard() {
        // TODO: Print board with grid lines
        // Example format:
        //  X | O |   
        // -----------
        //    | X | O 
        // -----------
        //  O |   | X 
        
        
    }
}

// =============================================================================
// ACTIVITY 4: Test Your Understanding
// =============================================================================

/**
 * Activity 4: Predict the Output
 * Look at the following code and predict what it will print.
 * Then run it to check your understanding.
 */
public class PredictOutput {
    public static void main(String[] args) {
        // Question 1: What does this print?
        int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Matrix1 dimensions: " + matrix1.length + "x" + matrix1[0].length);
        
        // Question 2: What does this print?
        int[][] matrix2 = {{1, 2, 3}, {4, 5}, {6}};
        for (int i = 0; i < matrix2.length; i++) {
            System.out.println("Row " + i + " has " + matrix2[i].length + " elements");
        }
        
        // Question 3: What does this calculate?
        int sum = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (i == j) {
                    sum += matrix1[i][j];
                }
            }
        }
        System.out.println("Sum: " + sum);
        
        // Question 4: Object interaction
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("Rectangles equal? " + r1.equals(r2));
    }
}

// =============================================================================
// ACTIVITY 5: Mini-Project - Student Grade Tracker (Simplified)
// =============================================================================

/**
 * Activity 5: Create a simplified version of the homework assignment
 * This helps you understand the concepts before the full implementation
 */

class SimpleStudent {
    // TODO: Create a basic Student class with name and ID
    
}

class SimpleGradeTracker {
    private SimpleStudent[] students;
    private double[][] grades;  // [student][assignment]
    private int numStudents;
    private int numAssignments;
    
    public SimpleGradeTracker(int maxStudents, int maxAssignments) {
        // TODO: Initialize arrays and counters
        
    }
    
    public void addStudent(SimpleStudent student) {
        // TODO: Add student to the array
        
    }
    
    public void setGrade(int studentIndex, int assignmentIndex, double grade) {
        // TODO: Set grade with bounds checking
        
    }
    
    public double getStudentAverage(int studentIndex) {
        // TODO: Calculate average for one student
        
    }
    
    public void printSimpleReport() {
        // TODO: Print a basic grade report
        
    }
}

// =============================================================================
// TESTING YOUR ACTIVITIES
// =============================================================================

/**
 * Use this class to test your implementations
 */
public class ActivityTester {
    public static void main(String[] args) {
        System.out.println("=== TESTING LESSON 7 ACTIVITIES ===\n");
        
        // Test Activity 1: 2D Arrays
        System.out.println("--- Activity 1: 2D Arrays ---");
        // TODO: Test your Array2DPractice methods
        
        
        // Test Activity 2: Objects
        System.out.println("\n--- Activity 2: Objects ---");
        // TODO: Test your Rectangle and Square classes
        
        
        // Test Activity 3: Tic-Tac-Toe
        System.out.println("\n--- Activity 3: Tic-Tac-Toe ---");
        // TODO: Test your TicTacToeBoard class
        
        
        // Test Activity 5: Grade Tracker
        System.out.println("\n--- Activity 5: Simple Grade Tracker ---");
        // TODO: Test your SimpleGradeTracker class
        
    }
}

/*
 * =============================================================================
 * ACTIVITY COMPLETION CHECKLIST
 * =============================================================================
 * 
 * Activity 1 - 2D Array Operations:
 * [ ] createMatrix() method works correctly
 * [ ] sumMainDiagonal() calculates correctly  
 * [ ] findMaxPosition() returns correct coordinates
 * [ ] printMatrix() formats output nicely
 * 
 * Activity 2 - Object-Oriented Design:
 * [ ] Rectangle class has proper encapsulation
 * [ ] All getter/setter methods work correctly
 * [ ] area() and perimeter() calculations are correct
 * [ ] toString() and equals() methods implemented
 * [ ] Square class properly extends Rectangle
 * 
 * Activity 3 - 2D Arrays with Objects:
 * [ ] TicTacToeBoard initializes correctly
 * [ ] placeMark() validates input and places marks
 * [ ] checkWinner() detects all win conditions
 * [ ] isFull() correctly checks board state
 * [ ] printBoard() displays formatted board
 * 
 * Activity 4 - Understanding Check:
 * [ ] Correctly predicted output for all questions
 * [ ] Understand 2D array dimensions and access
 * [ ] Understand object equality vs reference equality
 * 
 * Activity 5 - Mini-Project:
 * [ ] SimpleStudent class implemented
 * [ ] SimpleGradeTracker manages students and grades
 * [ ] Grade calculations work correctly
 * [ ] Report generation produces readable output
 * 
 * =============================================================================
 * READY FOR HOMEWORK?
 * =============================================================================
 * 
 * If you've completed all activities successfully, you're ready for the
 * homework assignment! The homework builds on these concepts but requires
 * more sophisticated implementation and additional features.
 * 
 * =============================================================================
 */