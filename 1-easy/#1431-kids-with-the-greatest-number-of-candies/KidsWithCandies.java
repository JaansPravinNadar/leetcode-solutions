import java.util.*;
public class KidsWithCandies{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];
    for(int i=1;i<candies.length;i++){
        if(max<candies[i]){
            max=candies[i];
        }
    } 
    List <Boolean> result = new ArrayList<>();
    for(int i=0;i<candies.length;i++){
        result.add(candies[i]+extraCandies>=max);
    }
    return result;
    }
    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3};
        System.out.println(kidsWithCandies(candies1, 3));

    }
}