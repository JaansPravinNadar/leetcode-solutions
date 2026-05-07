import java.util.HashSet;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

        //Sum Method
        /*int l=nums.length;
        int ES=l*(l+1)/2;
        int AS=0;
        for(int num:nums){
            AS+=num;
        }
        return ES-AS;*/

        /*
         * XOR Method
         *   int l=nums.length;
        for(int i=0;i<nums.length;i++){
            l=l^i^nums[i];
        }
        return l;
         */
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Test 1: " + missingNumber(nums1)); // 2

        int[] nums2 = {0, 1};
        System.out.println("Test 2: " + missingNumber(nums2)); // 2

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Test 3: " + missingNumber(nums3)); // 8

        int[] nums4 = {0};
        System.out.println("Test 4: " + missingNumber(nums4)); // 1
    }
}