import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverage() {

        double total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        return total / students.size();
    }

    public double findHighest() {

        double highest = students.get(0).getMarks();

        for (Student student : students) {

            if (student.getMarks() > highest) {
                highest = student.getMarks();
            }
        }

        return highest;
    }

    public double findLowest() {

        double lowest = students.get(0).getMarks();

        for (Student student : students) {

            if (student.getMarks() < lowest) {
                lowest = student.getMarks();
            }
        }

        return lowest;
    }

    public void displayStudents() {

        System.out.println("\n----- STUDENT GRADE REPORT -----");

        for (Student student : students) {

            System.out.println(
                "Name: " + student.getName()
                + " | Marks: " + student.getMarks()
            );
        }

        System.out.println("--------------------------------");

        System.out.println(
            "Average Marks: " + calculateAverage()
        );

        System.out.println(
            "Highest Marks: " + findHighest()
        );

        System.out.println(
            "Lowest Marks: " + findLowest()
        );
    }
}