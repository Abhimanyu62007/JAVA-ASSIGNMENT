public class Array_construction{

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }

    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }

        return answer;
    }

    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i];
            answer[i + nums.length] = nums[i];
        }

        return answer;
    }

    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer[i] = sum;
        }

        return answer;
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array_construction obj = new Array_construction();

        String[] operations = {"--X", "X++", "X++"};
        System.out.println("LC 2011: " +
                obj.finalValueAfterOperations(operations));

        int[] nums1 = {0, 2, 1, 5, 3, 4};
        System.out.print("LC 1920: ");
        printArray(obj.buildArray(nums1));

        int[] nums2 = {1, 2, 1};
        System.out.print("LC 1929: ");
        printArray(obj.getConcatenation(nums2));

        int[] nums3 = {1, 2, 3, 4};
        System.out.print("LC 1480: ");
        printArray(obj.runningSum(nums3));
    }
}