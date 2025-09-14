public class GradeChecker {
    public static void main(String[] args) {
        int score = 88; // change this value to test different scores
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Score: " + score + " Grade: " + grade);
    }
}
