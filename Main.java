import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> studentList = new ArrayList<>();
        boolean running = true;

        System.out.println("=============================================");
        System.out.println("     WELCOME TO STUDENT MANAGEMENT SYSTEM");
        System.out.println("=============================================");

        while (running) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Program (e.g., BIT): ");
                    String program = scanner.nextLine();

                    System.out.print("Enter Course Code (e.g., BIT1123): ");
                    String code = scanner.nextLine();

                    System.out.print("Enter Course Name (e.g., OOP): ");
                    String courseName = scanner.nextLine();

                    System.out.print("Enter Credit Hour: ");
                    int credit = scanner.nextInt();
                    scanner.nextLine();

                    Student student = new Student(studentList.size() + 1, name, age, id, program);
                    Course course = new Course(code, courseName, credit);
                    student.enrollCourse(course);

                    studentList.add(student);
                    System.out.println("\n>> Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- STUDENT RECORDS ---");
                    if (studentList.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        for (Person p : studentList) {
                            p.displayInfo();
                        }
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("\nExiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}