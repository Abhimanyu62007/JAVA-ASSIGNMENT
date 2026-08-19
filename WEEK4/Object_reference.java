public class Object_reference {
    String name;
    int age;

    Object_reference(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Object_reference student1 = new Object_reference("Abhimanyu", 19);

        Object_reference student2 = student1;

        student2.name = "Rahul";

        student1.display();
        student2.display();
    }
}
