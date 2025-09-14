public class AgeEligibility {
    public static void main(String[] args) {
        // Change this value to test different ages
        int age = 15;

        if (age >= 13 && age <= 19) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        // Extension: validate input range
        if (age < 0 || age > 120) {
            System.out.println("Invalid age");
        }
    }
}
