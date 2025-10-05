public class GradeCalculator {
    public static void main(String[] args) {
        int[] grades = {90, 74, 100, 40, 88, 91, 83};
        String[] students = { "Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"}; 
        // grades and students are ARRAY TYPES. 
        // grades[0] and students[0] will give you "Obi" and his grade which was 90.
        // {(Obi, 90),(Anakin, 74),(Yoda, 100),(Chewy, 40),(Han, 88),(Leia, 91),(Luke, 83)}

        // TODO 1: Calculate the sum of all grades
        int sum = 0;
        // Write your for loop here to add up all grades

        
        
        
        // TODO 2: Calculate the average


        // TODO 3: Find the highest grade. Is there a way you can do this without sorting?
        int highest = grades[0];
        // Write your for loop here to find the maximum value

        
        
        
        // TODO 4: Find the lowest grade. Is there a way you can do this without sorting?
        int lowest = grades[0];
        // Write your for loop here to find the minimum value



        // TODO 5: Print all students and their grades
        System.out.println("Student Grades:");
        // Write your for loop here to print each student and their grade

        // TODO 6: Print the results (make sure to print ALL required values)
    }
}

/* 
 * Expected Output(try and match what is in the " " exactly):

"
 * Student Grades:
 * Obi: 90
 * Anakin: 74
 * Yoda: 100
 * Chewy: 40
 * Han: 88
 * Leia: 91
 * Luke: 83
 * Total grades: 7
 * Sum: 566
 * Average: 80.85714285714286
 * Highest: 100
 * Lowest: 40
"
 
 */