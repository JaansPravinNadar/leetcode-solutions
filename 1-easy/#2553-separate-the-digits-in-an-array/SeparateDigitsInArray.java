import java.util.*;
public class SeparateDigitsInArray {

    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums){
            String str=String.valueOf(num);
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                list.add(ch-'0');
            }
        }
        int [] answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {13, 25, 83, 77};
        int[] result1 = separateDigits(nums1);
        System.out.print("Test 1: ");
        for (int n : result1) System.out.print(n + " ");
        System.out.println();

        int[] nums2 = {7, 1, 3, 9};
        int[] result2 = separateDigits(nums2);
        System.out.print("Test 2: ");
        for (int n : result2) System.out.print(n + " ");
        System.out.println();
    }
}