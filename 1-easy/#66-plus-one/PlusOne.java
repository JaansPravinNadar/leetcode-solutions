public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return  digits;
            }
            digits[i]=0;
        }
        int [] ans=new int[digits.length+1];
        ans[0]=1;
        return ans;
    }

    public static void main(String[] args) {
        int[] d1 = {1, 2, 3};
        int[] r1 = plusOne(d1);
        for(int n : r1) System.out.print(n + " ");
        System.out.println();

        int[] d2 = {9, 9, 9};
        int[] r2 = plusOne(d2);
        for(int n : r2) System.out.print(n + " ");
        System.out.println();
    }
}