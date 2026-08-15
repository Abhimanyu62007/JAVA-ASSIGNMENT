import java.util.Scanner;

public class Bitmask_utility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Enter bit position (0-31): ");
        int position = input.nextInt();

        int mask = 1 << position;

       
        if ((num & mask) != 0) {
            System.out.println("Bit is SET");
        } else {
            System.out.println("Bit is NOT SET");
        }

       
        int setBit = num | mask;
        System.out.println("After setting bit: " + setBit);

     
        int clearBit = num & ~mask;
        System.out.println("After clearing bit: " + clearBit);

        
        int toggleBit = num ^ mask;
        System.out.println("After toggling bit: " + toggleBit);

        input.close();
    }
}
