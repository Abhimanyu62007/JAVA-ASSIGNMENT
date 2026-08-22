import java.util.Scanner;

public class Linearsearch_toolkit {

    static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int lastIndexOf(int[] values, int target) {
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int countOccurrences(int[] values, int target) {
        int count = 0;

        for (int value : values) {
            if (value == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] values = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = input.nextInt();

        System.out.println("Contains: " + contains(values, target));
        System.out.println("First index: " + firstIndexOf(values, target));
        System.out.println("Last index: " + lastIndexOf(values, target));
        System.out.println("Occurrences: " + countOccurrences(values, target));

        input.close();
    }
}