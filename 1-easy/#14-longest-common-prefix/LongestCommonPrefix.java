public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i =1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Test 1: " + longestCommonPrefix(strs1)); // fl

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Test 2: " + longestCommonPrefix(strs2)); // ""

        String[] strs3 = {"interview", "internet", "internal"};
        System.out.println("Test 3: " + longestCommonPrefix(strs3)); // inte
    }
}