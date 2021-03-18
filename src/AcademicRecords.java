import java.util.Scanner;

public class AcademicRecords {
    public static void main(String[] args) {
        //Creating variables to store the courses
        String course1;
        String course2;
        String course3;
        String course4;

        // Creating an object of the Class AcademicRecords
        AcademicRecords academicRecords = new AcademicRecords();

        //Creating an object of the Class Scanner to help accept input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first course: ");
        course1 = scanner.next();
        System.out.println("Enter the second course: ");
        course2 = scanner.next();

        System.out.println("Enter the third course: ");
        course3 = scanner.next();
        System.out.println("Enter the fourth course: ");
        course4 = scanner.next();

        //Call the registered_courses method to print the courses.
        academicRecords.registered_courses(course1, course2, course3, course4);
    }

    /**
     * @description this method handles the printing of registered courses passed to the method
     * @param course1
     * @param course2
     * @param course3
     * @param course4
     */
    public void registered_courses(String course1, String course2, String course3, String course4) {
        //Using System.out.println to print out to the result.
        System.out.println("Four of the courses are: " + course1 + " " + course2 + " " + course3 + " " + course4);
    }
}
