/*
 * Lesson 7 Homework: Applied Java Programming
 * Student Grade Management System
 * 
 * OBJECTIVE: Create a comprehensive grade management system that demonstrates
 * your mastery of 2D arrays and object-oriented programming principles.
 * 
 * This assignment combines:
 * - 2D arrays for storing grade data
 * - Object-oriented design with multiple classes
 * - Encapsulation, inheritance, and abstraction
 * - Real-world problem solving
 * 
 * TOTAL POINTS: 100
 * - Part A: Student Class (15 points)
 * - Part B: Course Class (20 points)  
 * - Part C: GradeManager Class (35 points)
 * - Part D: Main Program (15 points)
 * - Part E: Advanced Features (15 points)
 */

// =============================================================================
// PART A: Student Class (15 points)
// =============================================================================

/**
 * Create a Student class that represents a student in the system.
 * 
 * REQUIREMENTS:
 * 1. Private instance variables: name (String), studentId (int), year (String)
 * 2. Constructor that takes name, studentId, and year
 * 3. Getter methods for all instance variables
 * 4. Setter method for year only (students can change their year level)
 * 5. toString() method that returns formatted student information
 * 6. equals() method that compares students based on studentId
 */

public class Student {
    // TODO: Implement the Student class according to requirements above
    
    
}

// =============================================================================
// PART B: Course Class (20 points)  
// =============================================================================

/**
 * Create a Course class that represents a course offering.
 * 
 * REQUIREMENTS:
 * 1. Private instance variables: courseName (String), courseCode (String), 
 *    maxStudents (int), enrolledStudents (int)
 * 2. Constructor that takes courseName, courseCode, and maxStudents
 * 3. Getter methods for all instance variables
 * 4. Method to enroll a student (increases enrolledStudents if room available)
 * 5. Method to check if course is full
 * 6. Method to get available spots
 * 7. toString() method with course information
 */

public class Course {
    // TODO: Implement the Course class according to requirements above
    
    
}

// =============================================================================
// PART C: GradeManager Class (35 points)
// =============================================================================

/**
 * Create a GradeManager class that manages grades for multiple students 
 * across multiple assignments using a 2D array.
 * 
 * REQUIREMENTS:
 * 1. Private instance variables:
 *    - students[] array to store Student objects
 *    - assignmentNames[] array to store assignment names
 *    - grades[][] 2D array to store grades (students x assignments)
 *    - numStudents and numAssignments to track current counts
 * 
 * 2. Constructor that takes maximum number of students and assignments
 * 
 * 3. Methods to implement:
 *    - addStudent(Student student): Add a student to the system
 *    - addAssignment(String assignmentName): Add an assignment
 *    - setGrade(int studentIndex, int assignmentIndex, double grade): Set a grade
 *    - getGrade(int studentIndex, int assignmentIndex): Get a specific grade
 *    - getStudentAverage(int studentIndex): Calculate student's average
 *    - getAssignmentAverage(int assignmentIndex): Calculate assignment average
 *    - getHighestGrade(): Find the highest grade in the entire system
 *    - getLowestGrade(): Find the lowest grade in the entire system
 *    - printGradeReport(): Print a formatted report of all grades
 *    - printStudentTranscript(int studentIndex): Print individual student report
 */

public class GradeManager {
    // TODO: Implement the GradeManager class according to requirements above
    
    
}

// =============================================================================
// PART D: Main Program (15 points)
// =============================================================================

/**
 * Create a main program that demonstrates the functionality of your system.
 * 
 * REQUIREMENTS:
 * Your main method should:
 * 1. Create a GradeManager for at least 5 students and 4 assignments
 * 2. Create and add at least 5 Student objects with different information
 * 3. Add 4 different assignments (e.g., "Quiz 1", "Midterm", "Project", "Final")
 * 4. Set grades for all students on all assignments (use realistic grade values)
 * 5. Demonstrate the following functionality:
 *    - Print the complete grade report
 *    - Print individual student transcripts for 2 students
 *    - Display the highest and lowest grades in the system
 *    - Show class averages for each assignment
 *    - Show individual averages for each student
 */

public class GradeManagementSystem {
    public static void main(String[] args) {
        // TODO: Implement the main program according to requirements above
        
        System.out.println("=== GRADE MANAGEMENT SYSTEM ===\n");
        
        // 1. Create GradeManager
        
        
        // 2. Create and add students
        
        
        // 3. Add assignments
        
        
        // 4. Set grades for all students
        
        
        // 5. Demonstrate functionality
        
        
    }
}

// =============================================================================
// PART E: Advanced Features (15 points)
// =============================================================================

/**
 * Implement ONE of the following advanced features for extra credit:
 * 
 * OPTION 1: Grade Statistics Class
 * Create a GradeStatistics class that provides advanced statistical analysis:
 * - Calculate standard deviation for assignments or students
 * - Find median grades
 * - Determine grade distribution (A, B, C, D, F counts)
 * - Identify students who need extra help (below class average)
 * 
 * OPTION 2: Course Enrollment System
 * Enhance your system to handle multiple courses:
 * - Modify Student to track enrolled courses
 * - Create methods to enroll students in courses
 * - Generate course rosters
 * - Calculate GPA across multiple courses
 * 
 * OPTION 3: File I/O Integration
 * Add file reading/writing capabilities:
 * - Save grade data to a file
 * - Load grade data from a file
 * - Export grade reports to text files
 * - Import student data from CSV files
 * 
 * Choose ONE option and implement it below:
 */

// TODO: Implement your chosen advanced feature here




/*
 * =============================================================================
 * GRADING RUBRIC
 * =============================================================================
 * 
 * PART A - Student Class (15 points):
 * - Correct encapsulation (private variables, public methods): 5 points
 * - All required methods implemented correctly: 5 points  
 * - toString() and equals() methods work properly: 5 points
 * 
 * PART B - Course Class (20 points):
 * - Correct class structure and encapsulation: 8 points
 * - Enrollment logic works correctly: 7 points
 * - All methods implemented and tested: 5 points
 * 
 * PART C - GradeManager Class (35 points):
 * - Correct 2D array implementation: 10 points
 * - All grade calculation methods work: 10 points
 * - Proper error handling (bounds checking): 5 points
 * - Print methods format output correctly: 10 points
 * 
 * PART D - Main Program (15 points):
 * - Creates and populates system with required data: 5 points
 * - Demonstrates all required functionality: 5 points
 * - Output is clear and well-formatted: 5 points
 * 
 * PART E - Advanced Features (15 points):
 * - Feature is fully implemented and functional: 10 points
 * - Integration with existing system: 3 points
 * - Code quality and documentation: 2 points
 * 
 * CODING STANDARDS:
 * - Proper indentation and formatting
 * - Meaningful variable and method names
 * - Appropriate comments explaining complex logic
 * - No compilation errors
 * - Follows Java naming conventions
 * 
 * =============================================================================
 * SUBMISSION INSTRUCTIONS
 * =============================================================================
 * 
 * 1. Complete all parts of this assignment
 * 2. Test your program thoroughly with different inputs
 * 3. Make sure your code compiles without errors
 * 4. Include sample output showing your program working
 * 5. Submit the completed .java file
 * 
 * DUE DATE: [To be announced by instructor]
 * 
 * ACADEMIC INTEGRITY: This is individual work. You may discuss concepts with
 * classmates, but all code must be your own original work.
 * 
 * =============================================================================
 */