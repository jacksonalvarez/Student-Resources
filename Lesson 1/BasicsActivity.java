// BasicsActivity.java
// For students familiar with Python: Java syntax basics

public class BasicsActivity {
    // Every Java application starts with a class
    public static void main(String[] args) {
        // This is the main method, the entry point
        System.out.println("Hello, Java! This is your first print statement.");
        // Variables must be declared with a type
        int number = 10;
        double pi = 3.14;
        String message = "Java is different from Python!";
        // Print variables
        System.out.println("number: " + number);
        System.out.println("pi: " + pi);
        System.out.println("message: " + message);
    }
}

/*
Python vs Java quick reference:
- Python: print("Hello")   | Java: System.out.println("Hello");
- Python: x = 5            | Java: int x = 5;
- Python: def func():      | Java: public void func() { }
- Python: No main needed   | Java: main method required
*/