import java.util.Scanner;

public class finalva_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of operations: ");
        int n = input.nextInt();

        int value = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (++X, X++, --X, X--): ");
            String operation = input.next();

            if (operation.equals("++X") || operation.equals("X++")) {
                value++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                value--;
            }
        }

        System.out.println("Final value: " + value);

        input.close();
    }
}