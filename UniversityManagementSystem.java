class Student {
    private static String universityName = "Chitkara University"; // Static variable
    private final int rollNumber; // Final variable
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student stu1 = new Student(862, "Rhea", "A");
        Student stu2 = new Student(863, "Janvi", "B");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
    }
}

