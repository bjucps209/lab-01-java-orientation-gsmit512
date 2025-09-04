import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //  Use scanner for pipeline usage
        int nStudents = scan.nextInt();  // Grab the number of students
        for (int i = 0; i < nStudents; i++) {
            System.out.println(scan.nextInt());
        }
        scan.close();
    }
}
