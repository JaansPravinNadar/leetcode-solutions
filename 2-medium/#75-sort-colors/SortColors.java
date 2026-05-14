public class SortColors {

    public static void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int num:nums){
            if(num==0){
                zeroCount++;
            }else if(num==1){
                oneCount++;
            }else if(num==2){
                twoCount++;
            }
        }
        for(int index=0;index<zeroCount;index++){
            nums[index]=0;
        }
        for(int index=zeroCount;index<zeroCount + oneCount;index++){
            nums[index]=1;
        }
        for(int index=zeroCount+oneCount;index<nums.length;index++){
            nums[index]=2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.print("Test 1: ");
        for(int n : nums1) System.out.print(n + " ");
        System.out.println();

        int[] nums2 = {2, 0, 1};
        sortColors(nums2);
        System.out.print("Test 2: ");
        for(int n : nums2) System.out.print(n + " ");
        System.out.println();
    }
}