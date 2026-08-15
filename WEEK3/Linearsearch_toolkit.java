import java.util.Scanner;

public class Linearsearch_toolkit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = input.nextInt();

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found");
        }

        input.close();
    }
}