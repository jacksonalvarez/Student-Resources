// ArithmeticDemo.java
// Demonstrates Java primitive types, arithmetic, and operator precedence

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        double x = 7.0;
        double y = 2.0;

        // Integer division
        System.out.println("a / b = " + (a / b)); // 3
        // Floating-point division
        System.out.println("x / y = " + (x / y)); // 3.5
        // Mixed division
        System.out.println("a / y = " + (a / y)); // 3.5

        // Operator precedence
        System.out.println("a + b * 2 = " + (a + b * 2)); // 11
        System.out.println("(a + b) * 2 = " + ((a + b) * 2)); // 18

        // Integer average
        System.out.println("(a + b) / 2 = " + ((a + b) / 2)); // 4
        // Floating-point average
        System.out.println("(a + b) / 2.0 = " + ((a + b) / 2.0)); // 4.5

        // Boolean expression
        boolean isAGreater = a > b;
        System.out.println("a > b: " + isAGreater); // true
    }
}
