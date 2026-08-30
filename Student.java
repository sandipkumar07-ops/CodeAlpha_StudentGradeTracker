public class Student {

    private int id;
    private String name;
    private double[] grades;

    // Constructor
    public Student(int id, String name, double[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    // Calculate average
    public double getAverage() {
        double total = 0;

        for (double grade : grades) {
            total += grade;
        }

        return total / grades.length;
    }

    // Find highest marks
    public double getHighest() {
        double highest = grades[0];

        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    // Find lowest marks
    public double getLowest() {
        double lowest = grades[0];

        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }

    // Calculate grade
    public String getGrade() {

        double average = getAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else if (average >= 40) {
            return "E";
        } else {
            return "F";
        }
    }

    // Pass or Fail
    public String getResult() {

        if (getAverage() >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    // Display student report
    public void displayStudent() {

        System.out.println("----------------------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);

        System.out.print("Marks        : ");

        for (double grade : grades) {
            System.out.print(grade + " ");
        }

        System.out.println();

        System.out.printf("Average      : %.2f%n", getAverage());
        System.out.println("Highest      : " + getHighest());
        System.out.println("Lowest       : " + getLowest());
        System.out.println("Grade        : " + getGrade());
        System.out.println("Result       : " + getResult());
        System.out.println("----------------------------------------");
    }
}