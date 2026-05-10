import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int l=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current=num;
                int streak=1;
                while(set.contains(current+1)){
                    current++;
                    streak++;
                }
                l=Math.max(l,streak);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Test 1: " + longestConsecutive(nums1)); // 4

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Test 2: " + longestConsecutive(nums2)); // 9
    }
}
