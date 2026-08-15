import java.util.Scanner;

public class marks_processor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in 5 subjects: ");

        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int m5 = input.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}