// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class GradeCalculator {
    public static void main(String[] args) {
        int[] grades = {90, 74, 100, 40, 88, 91, 83};
        String[] students = { "Obi", "Anakin", "Yoda", "Chewy", "Han", "Leia", "Luke"}; 
        // grades and students are ARRAY TYPES. 
        // grades[0] and students[0] will give you "Obi" and his grade which was 90.
        // {(Obi, 90),(Anakin, 74),(Yoda, 100),(Chewy, 40),(Han, 88),(Leia, 91),(Luke, 83)}
        
        System.out.println("* Student Grades:");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("* " + students[i] + ": " + grades[i]);
            
        }
            

        // TODO 1: Calculate the sum of all grades
        int sum = 0;
        int highest = grades[0];
	    int lowest = grades[0];

        // Write your for loop here to add up all grades
        
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            
            if (grades[i] > highest) {
		    highest = grades[i];
                }

		if (grades[i] < lowest) {
		    lowest = grades[i];
        	}
	}
        
        // TODO 2: Calculate the average
	
	double average = (double) sum / grades.length;
    System.out.println("* Total grades: " + grades.length);
	System.out.println("* Sum: " + sum);
	System.out.println("* Average: " + average);
	System.out.println("* Highest: " + highest);
	System.out.println("* Lowest: " + lowest);



	

        // TODO 3: Find the highest grade. Is there a way you can do this without sorting?
      
        // Write your for loop here to find the maximum value

        
        
        // TODO 4: Find the lowest grade. Is there a way you can do this without sorting?
        
        // Write your for loop here to find the minimum value



        // TODO 5: Print all students and their grades
        
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