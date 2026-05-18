import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int total=0;
        for(int index=0;index<s.length();index++){
            int currentValue=map.get(s.charAt(index));
            if(index<s.length()-1 && currentValue<map.get(s.charAt(index+1))){
                total-=currentValue;
            }else{
                total+=currentValue;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Test 1: " + romanToInt("III"));      // Expected: 3
        System.out.println("Test 2: " + romanToInt("LVIII"));    // Expected: 58
        System.out.println("Test 3: " + romanToInt("MCMXCIV"));  // Expected: 1994
        System.out.println("Test 4: " + romanToInt("IV"));       // Expected: 4
        System.out.println("Test 5: " + romanToInt("IX"));       // Expected: 9
    }
}