/**
 * Object-oriented implementation of Grade Calculator
 * This class encapsulates grade calculation functionality
 * Author: [Student Name]
 * Date: [Current Date]
 */
public class GradeCalculatorClass {
    
    // Instance variables
    private int[] grades;
    private String[] studentNames;
    private int sum;
    private double average;
    private int highest;
    private int lowest;
    private boolean calculated;
    
    /**
     * Constructor - initializes the grade calculator with student names and grades
     * @param studentNames Array of student names
     * @param grades Array of corresponding grades
     */
    public GradeCalculatorClass(String[] studentNames, int[] grades) {
        // TODO: Implement constructor
        // Validate that arrays are not null and have same length
        // Initialize instance variables
        // Set calculated to false
    }
    
    /**
     * Default constructor with preset Star Wars character data
     */
    public GradeCalculatorClass() {
        // TODO: Initialize with the same data as the original GradeCalculator
        // Use the same student names and grades from the original assignment
    }
    
    /**
     * Calculates all statistics (sum, average, highest, lowest)
     * This method should be called before accessing calculated values
     */
    public void calculateStatistics() {
        // TODO: Implement all calculations
        // Calculate sum using a loop
        // Calculate average (sum / number of grades)
        // Find highest grade using a loop
        // Find lowest grade using a loop
        // Set calculated to true
    }
    
    /**
     * Returns the sum of all grades
     * @return The sum of grades
     */
    public int getSum() {
        // TODO: Implement
        // Check if statistics have been calculated
        // Return sum
        return 0; // Replace with actual implementation
    }
    
    /**
     * Returns the average of all grades
     * @return The average grade
     */
    public double getAverage() {
        // TODO: Implement
        // Check if statistics have been calculated
        // Return average
        return 0.0; // Replace with actual implementation
    }
    
    /**
     * Returns the highest grade
     * @return The highest grade
     */
    public int getHighest() {
        // TODO: Implement
        // Check if statistics have been calculated
        // Return highest
        return 0; // Replace with actual implementation
    }
    
    /**
     * Returns the lowest grade
     * @return The lowest grade
     */
    public int getLowest() {
        // TODO: Implement
        // Check if statistics have been calculated
        // Return lowest
        return 0; // Replace with actual implementation
    }
    
    /**
     * Returns the total number of grades
     * @return Number of grades
     */
    public int getTotalGrades() {
        // TODO: Implement
        // Return length of grades array
        return 0; // Replace with actual implementation
    }
    
    /**
     * Returns a copy of the grades array
     * @return Copy of grades array
     */
    public int[] getGrades() {
        // TODO: Implement
        // Return a copy of the grades array (not the original)
        return null; // Replace with actual implementation
    }
    
    /**
     * Returns a copy of the student names array
     * @return Copy of student names array
     */
    public String[] getStudentNames() {
        // TODO: Implement
        // Return a copy of the student names array
        return null; // Replace with actual implementation
    }
    
    /**
     * Prints all student grades in the required format
     */
    public void printStudentGrades() {
        // TODO: Implement
        // Print "Student Grades:"
        // Loop through and print each student name and grade
        // Format: "StudentName: Grade"
    }
    
    /**
     * Prints all calculated statistics
     */
    public void printStatistics() {
        // TODO: Implement
        // Ensure calculations are done first
        // Print all statistics in the exact format expected
        // Total grades, Sum, Average, Highest, Lowest
    }
    
    /**
     * Prints complete report (students + statistics)
     */
    public void printCompleteReport() {
        // TODO: Implement
        // Call printStudentGrades()
        // Call printStatistics()
    }
    
    /**
     * Validates that statistics have been calculated
     * Throws an exception if not calculated
     */
    private void ensureCalculated() {
        // TODO: Implement
        // Check if calculated is true
        // If not, throw IllegalStateException with message
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        // TODO: Create instance of GradeCalculatorClass
        // TODO: Call calculateStatistics()
        // TODO: Call printCompleteReport()
        // The output should match exactly the expected output from original GradeCalculator
    }
}