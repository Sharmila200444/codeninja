//Reverse an array

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int k=arr.size();
        int j=1;
        for(int i=m+1; i<(m+1+(k-(m+1))/2); i++){
            int temp=arr.get(i);
            arr.set(i,arr.get(k-j));
            arr.set(k-j,temp);
            j++;
            
        }
        
        // Write your code here.
    }
}
