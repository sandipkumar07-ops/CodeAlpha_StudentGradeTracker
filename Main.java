import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeManager manager = new GradeManager();

        System.out.println("========================================");
        System.out.println("        STUDENT GRADE TRACKER");
        System.out.println("========================================");

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println();
            System.out.println("Enter details for Student " + i);
            System.out.println("----------------------------------------");

            // Student ID
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Student Name
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            // Number of subjects
            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            double[] grades = new double[subjects];

            // Enter marks
            for (int j = 0; j < subjects; j++) {

                while (true) {

                    System.out.print(
                        "Enter marks for Subject " + (j + 1) + " (0-100): "
                    );

                    double marks = sc.nextDouble();

                    if (marks >= 0 && marks <= 100) {
                        grades[j] = marks;
                        break;
                    } else {
                        System.out.println(
                            "Invalid marks! Please enter marks between 0 and 100."
                        );
                    }
                }
            }

            // Create Student object
            Student student = new Student(id, name, grades);

            // Add student
            manager.addStudent(student);
        }

        // Display report
        manager.displayAllStudents();

        // Display class statistics
        manager.displayClassStatistics();

        System.out.println();
        System.out.println("Thank you for using Student Grade Tracker!");

        sc.close();
    }
}