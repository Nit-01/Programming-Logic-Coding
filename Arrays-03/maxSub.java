/*
Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.
*/
import java.util.*;
class maxSub{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        System.out.println(maxs(arr));
    }
    public static int maxs(int[]arr){
        int cur=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            max=Math.max(max,cur);
        }
        return max;
    }
}