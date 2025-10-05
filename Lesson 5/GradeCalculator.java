public class GradeCalculator {
    public static void main(String[] args) {
        int[] grades = {90, 74, 100, 40, 88, 91, 83};
        String[] students = { "Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"}; 
        // grads and students are ARRAY TYPES. 
        // grads[0] and students[0] will give you "Obi" and his grade which was 90.
        // {(Obi, 90),(Anakin, 74),(Yoda, 100),(Chewy, 40),(Han, 88),(Leia, 91),(Luke, 83)}

        // TODO 1: Calculate the sum of all grades
        int sum = 0;
        // Write your for loop here:
        
        
        
        // TODO 2: Calculate the average
        double average = /* your calculation here */;
        
        // TODO 3: Find the highest grade
        int highest = grades[0];
        // Write your for loop here:
        
        
        
        // TODO 4: Find the lowest grade
        int lowest = grades[0];
        // Write your for loop here:
        
        
        
        // TODO 5: Print the results
        System.out.println("Total grades: " + grades.length);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}