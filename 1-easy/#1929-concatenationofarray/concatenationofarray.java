public class concatenationofarray{
    
    public static int[] concatenationofarray(int [] arr){
        int n =arr.length;
        int [] num1 = new int [2*n];
        
        for(int i =0 ; n>i; i++){
            num1[i]=arr[i];
            num1[n+i]=arr[i];
        }
        return num1;
    }
    public static void main(String[] args) {
        int [] nums ={1,2,1};
        System.out.print("Original Array: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();

        int [] ans =concatenationofarray(nums);

        System.out.print("Concatenationed Array: ");
        for(int i =0 ;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}