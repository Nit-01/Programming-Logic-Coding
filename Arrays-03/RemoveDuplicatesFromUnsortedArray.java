/*
Input: arr[] = [1, 2, 3, 1, 4, 2]
Output: [1, 2, 3, 4]
Explanation: 2 and 1 have more than 1 occurence.


Input: arr[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: There is no duplicate element.

*/
import java.util.*;
public class RemoveDuplicatesFromUnsortedArray {
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
       LinkedHashSet<Integer>h=new LinkedHashSet<>();

       for(int num:arr){
        h.add(num);
       }
       System.out.println(new ArrayList<>(h));
    }
}
