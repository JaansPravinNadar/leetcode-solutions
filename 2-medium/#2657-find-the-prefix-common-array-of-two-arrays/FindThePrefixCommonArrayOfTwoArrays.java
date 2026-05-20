public class FindThePrefixCommonArrayOfTwoArrays {

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int [] result=new int[n];
        int [] test=new int [n+1];
        int count=0;
        for(int index=0;index<n;index++){
            test[index]++;
            if(test[index]==2){
                count++;
            }
            test[index]++;
            if(test[index]==2){
                count++;
            }
            result[index]=count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A1 = {1, 3, 2, 4};
        int[] B1 = {3, 1, 2, 4};
        int[] result1 = findThePrefixCommonArray(A1, B1);
        System.out.print("Test 1: ");
        for (int n : result1) System.out.print(n + " ");
        System.out.println();

        int[] A2 = {2, 3, 1};
        int[] B2 = {3, 1, 2};
        int[] result2 = findThePrefixCommonArray(A2, B2);
        System.out.print("Test 2: ");
        for (int n : result2) System.out.print(n + " ");
        System.out.println();
    }
}