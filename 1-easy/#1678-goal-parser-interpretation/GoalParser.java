/*
 * LeetCode #1678: Goal Parser Interpretation
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/goal-parser-interpretation/
 *
 * Problem:
 * Interpret the command string:
 * "G" → "G"
 * "()" → "o"
 * "(al)" → "al"
 *
 * Example 1:
 * Input:  "G()(al)"
 * Output: "Goal"
 *
 * Example 2:
 * Input:  "G()()()()(al)"
 * Output: "Gooooal"
 *
 * Concepts used: String methods, replace()
 */

public class GoalParser {
    
    public static String interpret(String command) {
        String result =command;
        result=result.replace("()","o");
        result=result.replace("(al)","al");

        return result;
        
    }
    
    public static void main(String[] args) {
        
        // Test case 1
        String cmd1 = "G()(al)";
        System.out.println("Input:  " + cmd1);
        System.out.println("Output: " + interpret(cmd1));
        System.out.println();
        
        // Test case 2
        String cmd2 = "G()()()()(al)";
        System.out.println("Input:  " + cmd2);
        System.out.println("Output: " + interpret(cmd2));
        System.out.println();
        
        // Test case 3
        String cmd3 = "(al)G(al)()()G";
        System.out.println("Input:  " + cmd3);
        System.out.println("Output: " + interpret(cmd3));
    }
}