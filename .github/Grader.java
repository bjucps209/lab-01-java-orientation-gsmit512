import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Use scanner for pipeline usage
        int nStudents = scan.nextInt();  // Grab the number of students

        for (int i = 0; i < nStudents; i++) {
            int grade = scan.nextInt();
            if (grade < 38) {  // <38: grade stays the same
                System.out.println(grade);
                break;
            }
            // Round to the nearest mulitple of 5 (n/5)
            double dividedBy5 = grade / 5.0;
            double round = Math.ceil(dividedBy5);   // Round up (whole number)
            double multipleOf5 = round * 5; // The next multiple of 5 
            int roundedGrade = (int) multipleOf5;    // Convert to a whole number
            if ((roundedGrade - grade) < 3) {
                System.out.println(roundedGrade);
            } else {
                System.out.println(grade);
            }
        }
        scan.close();
    }
}
