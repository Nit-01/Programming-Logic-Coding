/*
Input: arr[] = [-2, 6, -3, -10, 0, 2]
Output: 180
Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

Input: arr[] = [-1, -3, -10, 0, 6]
Output: 30
Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

Input: arr[] = [2, 3, 4] 
Output: 24 
Explanation: For an array with all positive elements, the result is product of all elements. 

*/
import java.util.*;
class MaximumProductSubarray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        System.out.println(maxsub(arr));
    }
    public static int maxsub(int[]arr){
        int max=arr[0];
        int min=arr[0];
        int ans=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(arr[i],arr[i]*max);
            min=Math.min(arr[i],arr[i]*min);
            ans=Math.max(ans,max);

        }
        return ans;
    }
}