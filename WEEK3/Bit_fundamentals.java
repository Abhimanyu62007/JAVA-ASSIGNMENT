public class Bit_fundamentals {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Bitwise AND (&): " + (a & b));
        System.out.println("Bitwise OR (|): " + (a | b));
        System.out.println("Bitwise XOR (^): " + (a ^ b));
        System.out.println("Bitwise NOT (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}
