public class GradeSwitch {
    public static void main(String[] args) {
        char grade = 'B'; // change to 'A', 'B', 'C', or other

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Needs improvement");
                break;
        }
    }
}
