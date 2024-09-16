import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        List<int[]>l=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==s){
                    int []t=new int[2];
                    t[0]=Math.min(arr[i],arr[j]);
                    t[1]=Math.max(arr[i],arr[j]);
                    l.add(t);

                }
            }
        }
        l.sort((a,b) -> {if(a[0]!=b[0]) return a[0]-b[0];
        else return a[1]-b[1];
        });
        return l;

        
    }
}


// Sample Input 1:
// 5 5
// 1 2 3 4 5
// Sample Output 1:
// 1 4
// 2 3
// Explaination For Sample Output 1:
// Here, 1 + 4 = 5
//       2 + 3 = 5
// Hence the output will be, (1,4) , (2,3).
// Sample Input 2:
// 5 0
// 2 -3 3 3 -2
// Sample Output 2:
// -3 3
// -3 3
// -2 2
