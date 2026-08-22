import java.util.Scanner;

public class Array_transformation{

    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        int newLength = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[newLength] = values[i];
                newLength++;
            }
        }

        return newLength;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            result[i] = sum;
        }

        return result;
    }

    static void printArray(int[] values, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
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

        System.out.println("Original array:");
        printArray(values, values.length);

        int[] copy = reversedCopy(values);

        System.out.println("Reversed copy:");
        printArray(copy, copy.length);

        reverseInPlace(values);

        System.out.println("Array after in-place reverse:");
        printArray(values, values.length);

        System.out.print("Enter value to remove: ");
        int target = input.nextInt();

        int logicalLength = removeValue(values, target);

        System.out.println("Array after removing " + target + ":");
        printArray(values, logicalLength);

        int[] sums = runningSum(values);

        System.out.println("Running sum:");
        printArray(sums, logicalLength);

        input.close();
    }
}
