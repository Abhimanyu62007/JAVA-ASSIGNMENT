public class Array_pointer {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int[] ptr = arr;

        System.out.println("arr[0] = " + arr[0]);
        System.out.println("ptr[0] = " + ptr[0]);

        ptr[0] = 100;

        System.out.println("After changing ptr:");
        System.out.println("arr[0] = " + arr[0]);
    }
}
