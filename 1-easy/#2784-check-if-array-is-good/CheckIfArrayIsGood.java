import java.util.*;
public class CheckIfArrayIsGood {
public static boolean isGood(int[] nums) {
    Arrays.sort(nums);
    for(int index=0;index<nums.length-1;index++){
        if(nums[index]!=index+1){
           return false;
        }
    }
    if(nums[nums.length-1]!=nums.length-1){
        return false;
    }
    return true;
}
public static void main(String[] args) {
        int[] nums1 = {2, 1, 3, 3};
        System.out.println("Test 1: " + isGood(nums1)); // true

        int[] nums2 = {1, 3, 3, 2};
        System.out.println("Test 2: " + isGood(nums2)); // true

        int[] nums3 = {3, 4, 4, 1, 2};
        System.out.println("Test 3: " + isGood(nums3)); // false

        int[] nums4 = {1, 1};
        System.out.println("Test 4: " + isGood(nums4)); // true
    }
}