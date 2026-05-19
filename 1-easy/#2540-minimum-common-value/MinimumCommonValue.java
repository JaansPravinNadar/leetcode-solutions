public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        while(i<n1&&j<n2){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums2[j]>nums1[i]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};
        System.out.println("Test 1: " + getCommon(nums1, nums2)); // Expected: 2

        int[] nums3 = {1, 2, 3, 6};
        int[] nums4 = {2, 3, 4, 5};
        System.out.println("Test 2: " + getCommon(nums3, nums4)); // Expected: 2

        int[] nums5 = {1, 5, 7};
        int[] nums6 = {2, 4, 6};
        System.out.println("Test 3: " + getCommon(nums5, nums6)); // Expected: -1
    }
}