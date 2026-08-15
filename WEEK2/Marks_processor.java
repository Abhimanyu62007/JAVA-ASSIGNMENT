import java.util.Scanner;

public class Marks_processor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = input.nextInt();
            total += marks;
        }

        double average = (double) total / n;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        input.close();
    }
}