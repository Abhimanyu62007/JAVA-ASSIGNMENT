import java.util.Scanner;

public class Array_transformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // Transform each element
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println("Transformed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
