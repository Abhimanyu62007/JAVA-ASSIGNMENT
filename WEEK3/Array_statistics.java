import java.util.Scanner;

public class Array_statistics {

    static int sum(int[] values) {
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return sum;
    }

    static double average(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        return (double) sum(values) / values.length;
    }

    static int minimum(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int min = values[0];

        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    static int maximum(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        int max = values[0];

        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    static int countEven(int[] values) {
        int count = 0;

        for (int value : values) {
            if (value % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static void printSignCounts(int[] values) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int value : values) {
            if (value > 0) {
                positive++;
            } else if (value < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Sum: " + sum(arr));
            System.out.println("Average: " + average(arr));
            System.out.println("Minimum: " + minimum(arr));
            System.out.println("Maximum: " + maximum(arr));

            int even = countEven(arr);
            int odd = arr.length - even;

            System.out.println("Even count: " + even);
            System.out.println("Odd count: " + odd);

            printSignCounts(arr);
        }

        input.close();
    }
}