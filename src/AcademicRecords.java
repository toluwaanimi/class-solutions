import java.util.Scanner;

public class AcademicRecords {
    public static void main(String[] args) {
        String course1;
        String course2;
        String course3;
        String course4;

        AcademicRecords academicRecords = new AcademicRecords();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first course: ");
        course1 = scanner.next();
        System.out.println("Enter the second course: ");
        course2 = scanner.next();

        System.out.println("Enter the third course: ");
        course3 = scanner.next();
        System.out.println("Enter the fourth course: ");
        course4 = scanner.next();
        academicRecords.registered_courses(course1, course2, course3, course4);
    }

    public void registered_courses(String course1, String course2, String course3, String course4) {
        System.out.println("Four of the courses are: " + course1 + " " + course2 + " " + course3 + " " + course4);
    }
}
