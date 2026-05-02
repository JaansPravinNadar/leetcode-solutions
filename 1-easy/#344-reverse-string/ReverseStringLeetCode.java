public class ReverseStringLeetCode {

    public static void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        char temp;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.print("Test 1: ");
        for(char ch : s1) System.out.print(ch + " ");
        System.out.println();

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.print("Test 2: ");
        for(char ch : s2) System.out.print(ch + " ");
        System.out.println();
    }
}