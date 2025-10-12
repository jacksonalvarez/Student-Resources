import java.io.*;

/**
 * Test class for GradeCalculator.java
 * This test captures the output from GradeCalculator and compares it to the expected output
 * Handles compilation errors gracefully and provides a score
 * 
 * To run this test:
 * 1. javac GradeCalculator.java GradeCalculatorTest.java
 * 2. java GradeCalculatorTest
 */
public class GradeCalculatorTest {
    
    // Class to store test results
    static class TestResult {
        boolean success;
        String errorMessage;
        String output;
        
        TestResult(boolean success, String errorMessage, String output) {
            this.success = success;
            this.errorMessage = errorMessage;
            this.output = output;
        }
    }
    
    public static void main(String[] args) {
        // Expected output (exact match required)
        String expectedOutput = "Student Grades:\n" +
                               "Obi: 90\n" +
                               "Anakin: 74\n" +
                               "Yoda: 100\n" +
                               "Chewy: 40\n" +
                               "Han: 88\n" +
                               "Leia: 91\n" +
                               "Luke: 83\n" +
                               "Total grades: 7\n" +
                               "Sum: 566\n" +
                               "Average: 80.85714285714286\n" +
                               "Highest: 100\n" +
                               "Lowest: 40\n";
        
        // Test GradeCalculator class
        TestResult result = testGradeCalculatorClass("GradeCalculator", expectedOutput);
        
        // Print results
        printTestResult("GradeCalculator", result, expectedOutput);
        
        // Calculate and print final score
        printFinalScore(result);
    }
    
    /**
     * Tests a specific GradeCalculator class
     * @param className The name of the class to test
     * @param expectedOutput The expected output
     * @return TestResult object containing the results
     */
    private static TestResult testGradeCalculatorClass(String className, String expectedOutput) {
        try {
            // Try to get the class and run its main method
            Class<?> clazz = Class.forName(className);
            String actualOutput = captureOutput(clazz);
            
            boolean success = testOutput(expectedOutput, actualOutput);
            return new TestResult(success, null, actualOutput);
            
        } catch (ClassNotFoundException e) {
            return new TestResult(false, "Class not found: " + className + ".java file missing or not compiled", "");
        } catch (NoSuchMethodException e) {
            return new TestResult(false, "Main method not found in " + className, "");
        } catch (Exception e) {
            String errorType = e.getClass().getSimpleName();
            String errorMsg = e.getMessage();
            return new TestResult(false, "Runtime error in " + className + ": " + errorType + 
                                 (errorMsg != null ? " - " + errorMsg : ""), "");
        }
    }
    
    /**
     * Prints the results for a specific class test
     * @param className The name of the class tested
     * @param result The test result
     * @param expectedOutput The expected output for detailed comparison
     */
    private static void printTestResult(String className, TestResult result, String expectedOutput) {
        System.out.println(className + ": " + (result.success ? "[x] PASS" : "[ ] FAIL"));
        if (!result.success && result.errorMessage != null) {
            System.out.println("  Error: " + result.errorMessage);
        }
    }
    
    /**
     * Calculates and prints the final score
     * @param result Result for GradeCalculator
     */
    private static void printFinalScore(TestResult result) {
        int score = result.success ? 100 : 0;
        
        System.out.println("\nSCORE: " + score + "/100 (" + score + "%)");
        
        // Show what functionality is working
        System.out.println("Functionality Status:");
        System.out.println("  GradeCalculator: " + (result.success ? "Working" : "Not Working"));
        
        // Show errors and fixes
        if (!result.success) {
            System.out.println("\nGradeCalculator Error: " + 
                (result.errorMessage != null ? result.errorMessage : "Output doesn't match expected"));
            System.out.println("Recommended Fix: " + getRecommendedFix(result));
        }
    }
    
    /**
     * Gets recommended fix based on error type
     * @param result The test result
     * @return Recommended fix string
     */
    private static String getRecommendedFix(TestResult result) {
        if (result.errorMessage == null) {
            return "Check output formatting - ensure exact spacing, line breaks, and text match";
        }
        
        if (result.errorMessage.contains("Class not found")) {
            return "Create the .java file or compile it with 'javac ClassName.java'";
        }
        
        if (result.errorMessage.contains("Main method not found")) {
            return "Add 'public static void main(String[] args)' method to your class";
        }
        
        if (result.errorMessage.contains("Runtime error")) {
            return "Fix compilation errors or logic issues in your code";
        }
        
        return "Review code for syntax errors and ensure all TODOs are completed";
    }
    
    /**
     * Captures the output from a specific class's main() method using reflection
     * @param clazz The class to execute
     * @return The captured output as a string
     * @throws Exception if there are issues with reflection or execution
     */
    private static String captureOutput(Class<?> clazz) throws Exception {
        // Save original System.out
        PrintStream originalOut = System.out;
        
        try {
            // Create a ByteArrayOutputStream to capture output
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream captureOut = new PrintStream(baos);
            
            // Redirect System.out to our capture stream
            System.setOut(captureOut);
            
            // Get the main method and invoke it
            java.lang.reflect.Method mainMethod = clazz.getMethod("main", String[].class);
            mainMethod.invoke(null, (Object) new String[0]);
            
            // Get the captured output
            captureOut.flush();
            String output = baos.toString();
            
            return output;
            
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }
    
    /**
     * Tests if the actual output matches the expected output exactly
     * @param expected The expected output
     * @param actual The actual output from GradeCalculator
     * @return true if outputs match exactly, false otherwise
     */
    private static boolean testOutput(String expected, String actual) {
        // Normalize line endings for cross-platform compatibility
        expected = expected.replace("\r\n", "\n").replace("\r", "\n");
        actual = actual.replace("\r\n", "\n").replace("\r", "\n");
        
        return expected.equals(actual);
    }
    
    /**
     * Prints a detailed comparison when the test fails
     * @param expected The expected output
     * @param actual The actual output
     */
    private static void printDetailedComparison(String expected, String actual) {
        System.out.println("EXPECTED OUTPUT:");
        System.out.println("----------------");
        System.out.println("\"" + expected + "\"");
        
        System.out.println("\nACTUAL OUTPUT:");
        System.out.println("--------------");
        System.out.println("\"" + actual + "\"");
        
        System.out.println("\nLINE-BY-LINE COMPARISON:");
        System.out.println("-------------------------");
        
        String[] expectedLines = expected.split("\n");
        String[] actualLines = actual.split("\n");
        
        int maxLines = Math.max(expectedLines.length, actualLines.length);
        
        for (int i = 0; i < maxLines; i++) {
            String expectedLine = (i < expectedLines.length) ? expectedLines[i] : "[MISSING LINE]";
            String actualLine = (i < actualLines.length) ? actualLines[i] : "[MISSING LINE]";
            
            String status = expectedLine.equals(actualLine) ? "✅" : "❌";
            
            System.out.println(String.format("Line %d: %s", i + 1, status));
            System.out.println("  Expected: \"" + expectedLine + "\"");
            System.out.println("  Actual:   \"" + actualLine + "\"");
            
            if (!expectedLine.equals(actualLine)) {
                System.out.println("  >>> MISMATCH DETECTED <<<");
            }
            System.out.println();
        }
        
        // Character-by-character comparison for debugging
        System.out.println("CHARACTER-BY-CHARACTER COMPARISON:");
        System.out.println("-----------------------------------");
        int minLength = Math.min(expected.length(), actual.length());
        
        for (int i = 0; i < minLength; i++) {
            if (expected.charAt(i) != actual.charAt(i)) {
                System.out.println(String.format("First difference at position %d:", i));
                System.out.println(String.format("  Expected: '%c' (ASCII: %d)", expected.charAt(i), (int)expected.charAt(i)));
                System.out.println(String.format("  Actual:   '%c' (ASCII: %d)", actual.charAt(i), (int)actual.charAt(i)));
                break;
            }
        }
        
        if (expected.length() != actual.length()) {
            System.out.println("Length difference:");
            System.out.println("  Expected length: " + expected.length());
            System.out.println("  Actual length:   " + actual.length());
        }
    }
}