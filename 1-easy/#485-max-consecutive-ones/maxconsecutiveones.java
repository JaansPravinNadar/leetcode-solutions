public class maxconsecutiveones{
    public static int counter(int [] num){
        int count = 0;
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==1){
                count++;
                if(count>max){                
                    max=count;
                }
            }else if(num[i]==0){
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,0,1}; // I have took my own example here 
        int count = counter(nums);
        System.out.println("Array has max "+count+" consecutive 1's.");
    }
}
