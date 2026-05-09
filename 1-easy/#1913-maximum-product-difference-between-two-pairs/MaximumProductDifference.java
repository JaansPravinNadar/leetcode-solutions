//import java.util.*;
public class MaximumProductDifference {

    public static int maxProductDifference(int[] nums) {
        //This isn't that effective //Tried on own but not efficient
        /*Arrays.sort(nums);
        int r=0;
        int l=nums.length;
        r=(nums[l-2]*nums[l-1])-(nums[0]*nums[1]);
        return r;*/

        //--- Method 2 ---
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }else if(num>max2){
                max2=num;
            }
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }
        return (max1*max2)-(min1*min2);
        
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 6, 2, 7, 4};
        System.out.println("Test 1: " + maxProductDifference(nums1)); // 34

        int[] nums2 = {4, 2, 5, 9, 7, 4, 8};
        System.out.println("Test 2: " + maxProductDifference(nums2)); // 64
    }
}