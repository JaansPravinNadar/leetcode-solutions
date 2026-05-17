public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while(left <= right) {
            int lSquare = nums[left] * nums[left];
            int rSquare = nums[right] * nums[right];

            if(lSquare < rSquare) {
                result[k] = rSquare;
                right--;
            } else {
                result[k] = lSquare;
                left++;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = sortedSquares(nums1);
        System.out.print("Test 1: ");
        for(int n : result1) System.out.print(n + " ");
        System.out.println();

        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = sortedSquares(nums2);
        System.out.print("Test 2: ");
        for(int n : result2) System.out.print(n + " ");
        System.out.println();
    }
}