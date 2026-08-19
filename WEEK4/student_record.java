public class student_record {
    String name;
    int age;
    int rollNo;

    student_record(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        student_record student = new student_record("Abhimanyu", 19, 101);
        student.display();
    }
}