public class RotateArray {
    
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        
        reverse(nums, 0, n - 1);
        
        reverse(nums, 0, k - 1);
        
        reverse(nums, k, n - 1);
    }
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Before: ");
        printArray(nums1);
        rotate(nums1, 3);
        System.out.print("After (k=3): ");
        printArray(nums1);
        System.out.println();
    }
}