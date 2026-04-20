public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }        
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
    
    public static void main(String[] args) {
        
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Test 1: ");
        for(int n : nums1) System.out.print(n + " ");
        System.out.println();
    }
}