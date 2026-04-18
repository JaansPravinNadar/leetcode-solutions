public class IsSubsequence{
        public static boolean isSubsequence(String s, String t) {
         int i=0;
         int j=0;
         while(s.length()>i && t.length()>j){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
         }
         return s.length()==i;
        }
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbghc"));
    }
}
