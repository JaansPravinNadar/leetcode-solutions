public class ValidPalindrome{
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start<end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    String s1 = " ";
    String s2 = "race a car";
    System.out.println("Input : "+s);
    System.out.println("Ouput  : "+isPalindrome(s));  
    System.out.println("Input : "+s1);
    System.out.println("Output : "+isPalindrome(s1));
    System.out.println("Input  : "+s2);
    System.out.println("Output  : "+isPalindrome(s2));  
    }
}
