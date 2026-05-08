public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 2, 3};
        int len1 = removeElement(nums1, 3);
        System.out.print("Test 1: length = " + len1 + " -> ");
        for(int i = 0; i < len1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int len2 = removeElement(nums2, 2);
        System.out.print("Test 2: length = " + len2 + " -> ");
        for(int i = 0; i < len2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}