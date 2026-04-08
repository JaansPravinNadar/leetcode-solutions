public class sumof1darray {

    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println("---Sum of 1d array---");
        int [] arr ={1,2,3,4,5};
        int [] answer = runningSum(arr);
        System.out.print("Input: [ 1,2,3,4,5 ] \nOutput: [ ");
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print(" ]");
    }
}