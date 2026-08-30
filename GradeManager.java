import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    // Constructor
    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println();
        System.out.println("========================================");
        System.out.println("          STUDENT SUMMARY REPORT");
        System.out.println("========================================");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Display class statistics
    public void displayClassStatistics() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        double totalAverage = 0;
        double highestScore = 0;
        double lowestScore = 100;

        for (Student student : students) {

            totalAverage += student.getAverage();

            if (student.getHighest() > highestScore) {
                highestScore = student.getHighest();
            }

            if (student.getLowest() < lowestScore) {
                lowestScore = student.getLowest();
            }
        }

        double classAverage = totalAverage / students.size();

        System.out.println();
        System.out.println("========================================");
        System.out.println("           CLASS STATISTICS");
        System.out.println("========================================");

        System.out.printf("Class Average : %.2f%n", classAverage);
        System.out.println("Highest Score : " + highestScore);
        System.out.println("Lowest Score  : " + lowestScore);
        System.out.println("Total Students: " + students.size());

        System.out.println("========================================");
    }
}