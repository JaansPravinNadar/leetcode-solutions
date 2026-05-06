import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        // Step 1: Count frequency of each element
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println("Test 1: " + singleNumber(nums1)); // 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Test 2: " + singleNumber(nums2)); // 4

        int[] nums3 = {1};
        System.out.println("Test 3: " + singleNumber(nums3)); // 1
    }
}