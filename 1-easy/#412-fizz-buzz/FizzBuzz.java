import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(i%15==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(3));
    }
}