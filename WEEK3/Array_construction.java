import java.util.Scanner;

public class Array_construction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array elements:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        input.close();
    }
}
