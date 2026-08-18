import java.util.ArrayList;

public class Student extends Person {
    private String studentId;
    private String program;
    private ArrayList<Course> enrolledCourses;

    public Student(int id, String name, int age, String studentId, String program) {
        super(id, name, age);
        this.studentId = studentId;
        this.program = program;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }

    public void enrollCourse(Course c) {
        enrolledCourses.add(c);
    }

    @Override
    public void displayInfo() {
        System.out.println("-----------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + getName());
        System.out.print("Enrolled Course(s): ");
        if (enrolledCourses.isEmpty()) {
            System.out.println("None");
        } else {
            for (Course c : enrolledCourses) {
                System.out.print(c.getCourseCode() + " - " + c.getCourseName() + "  ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}