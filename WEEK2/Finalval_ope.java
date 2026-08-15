import java.util.Scanner;

public class Finalval_ope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        final int value = 10;

        int addition = num + value;
        int subtraction = num - value;
        int multiplication = num * value;
        int division = num / value;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        input.close();
    }
}
