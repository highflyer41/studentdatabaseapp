import java.util.Scanner;

public class Student {
    
    private String firstName, lastName, studentID, courses = "";
    private int balance = 0, gradeYear; 
    private static int costOfCourse = 600;
    private static int id = 1000;
    private static Scanner in = new Scanner(System.in);

    public Student() {
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = Integer.parseInt(in.nextLine());

        setStudentId();

    }

    private void setStudentId() {
        id++;
        studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n  " + course;
                balance += costOfCourse;
            } else {
                break;
            }
        } while(true);
        
    }

    public void getBalance() {
        System.out.println("BALANCE: " + balance);
    }

    public void payBalance() {
        getBalance();
        System.out.print("Enter your payment: $");
        int payment = Integer.parseInt(in.nextLine());
        balance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        getBalance();
    }

    public String toString() {
        return String.format("Name: %s %s\nGrade Level: %d\nStudent ID: %s\nCourses Enrolled: %s\nBalance: $%d", firstName, lastName, gradeYear, studentID, courses, balance);
    }
}