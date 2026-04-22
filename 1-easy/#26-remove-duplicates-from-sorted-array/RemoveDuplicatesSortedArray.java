public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int [] nums){
        if(nums.length == 0){
            return 0;
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    } 
  public static void main(String[] args) {
      int[] nums1 = {1, 1, 2};
        int result1 = removeDuplicates(nums1);
        System.out.print("Test 1: " + result1 + " -> [ ");
        for(int i = 0; i < result1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("]");
  }  
}
