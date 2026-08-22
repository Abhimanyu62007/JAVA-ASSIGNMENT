import java.util.Scanner;

public class Max_operation {

    static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sums[i] += matrix[i][j];
            }
        }

        return sums;
    }

    static int[] columnSums(int[][] matrix) {
        int columns = matrix[0].length;
        int[] sums = new int[columns];

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sums[j] += matrix[i][j];
            }
        }

        return sums;
    }

    static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length ||
                first[0].length != second[0].length) {
            return null;
        }

        int[][] result = new int[first.length][first[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        return result;
    }

    static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    static int[][] multiply(int[][] first, int[][] second) {
        if (first[0].length != second.length) {
            return null;
        }

        int[][] result = new int[first.length][second[0].length];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                for (int k = 0; k < first[0].length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Operation not possible due to invalid dimensions");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows for first matrix: ");
        int rows1 = input.nextInt();

        System.out.print("Enter columns for first matrix: ");
        int columns1 = input.nextInt();

        int[][] first = new int[rows1][columns1];

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                first[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter rows for second matrix: ");
        int rows2 = input.nextInt();

        System.out.print("Enter columns for second matrix: ");
        int columns2 = input.nextInt();

        int[][] second = new int[rows2][columns2];

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                second[i][j] = input.nextInt();
            }
        }

        System.out.println("First Matrix:");
        printMatrix(first);

        System.out.println("Second Matrix:");
        printMatrix(second);

        System.out.println("Row Sums of First Matrix:");
        int[] rows = rowSums(first);

        for (int value : rows) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Column Sums of First Matrix:");
        int[] columns = columnSums(first);

        for (int value : columns) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Addition:");
        printMatrix(add(first, second));

        System.out.println("Transpose of First Matrix:");
        printMatrix(transpose(first));

        System.out.println("Multiplication:");
        printMatrix(multiply(first, second));

        input.close();
    }
}
