import java.util.Scanner;

public class Number_onebit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            count += temp & 1;
            temp = temp >>> 1;
        }

        System.out.println("Number of 1 bits: " + count);

        input.close();
    }
}
