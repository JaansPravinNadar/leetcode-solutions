public class LengthOfLastWord {
    // what is this nothing new change

    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int len=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                break;
            }
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World")); // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy")); // 6
    }
}