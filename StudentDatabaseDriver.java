import java.util.Scanner;

/**
 * StudentDatabaseDriver
 */
public class StudentDatabaseDriver {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of new students to enroll: ");
        int number = in.nextInt();
        Student[] students = new Student[number];

        for(int i = 0; i < number; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payBalance();
        }

        for(Student ele: students) {
            System.out.println(ele.toString());
        }

        in.close();
    }
}