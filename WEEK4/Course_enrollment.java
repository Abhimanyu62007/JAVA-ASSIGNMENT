public class Course_enrollment {
    String studentName;
    String courseName;
    int courseId;

    Course_enrollment(String studentName, String courseName, int courseId) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.courseId = courseId;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course ID: " + courseId);
    }

    public static void main(String[] args) {
        Course_enrollment course =
                new Course_enrollment("Abhimanyu", "Computer Science", 101);

        course.display();
    }
}
