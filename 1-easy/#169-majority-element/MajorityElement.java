import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap <Integer,Integer> jaans=new HashMap<>();
        for(int num: nums){
            jaans.put(num,jaans.getOrDefault(num, 0)+1);
        }
        for(int key: jaans.keySet()){
            if(jaans.get(key)>nums.length/2){
                return key;
            }
        }       
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Test 1: " + majorityElement(nums1)); // 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Test 2: " + majorityElement(nums2)); // 2
    }
}