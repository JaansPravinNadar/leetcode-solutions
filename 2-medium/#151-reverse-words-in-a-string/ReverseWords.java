public class ReverseWords{
    public static String reverseWords(String s){
        s=s.trim();
        String [] words = s.split("\\s+");
        int start = 0;
        int end = words.length -1 ;
        while (start < end) {
            String temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        return String.join(" ", words);

    }
    public static void main(String[] args) {
        String str1= " the sky is blue ";
        String str2 ="    Hello   World   ";
        System.out.println("Input : the sky is blue ");
        System.out.println("Output : "+reverseWords(str1));
        System.out.println("Input :    Hello   World   ");
        System.out.println("Output : "+reverseWords(str2));
    }
}