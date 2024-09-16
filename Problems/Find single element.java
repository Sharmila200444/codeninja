import java.util.*;
public class Solution {
    public static int getSingleElement(int []arr){
        HashMap<Integer, Integer> s=new HashMap<>();
        for(int i:arr){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(s.get(i)==1){
                return i;

            }
            
        }
        return -1;

        // Write your code here.
    }
}
