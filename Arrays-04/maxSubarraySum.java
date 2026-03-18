/*

maxSubarraySum

Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
Note: A subarray is a contiguous part of any given array.


Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.

Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.


Input: arr[] = [100, 200, 300, 400], k = 1
Output: 400
Explanation: arr3 = 400, which is maximum.

*/
import java.util.*;
class maxSubarraySum{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int k=sn.nextInt();

        System.out.println(ssum(arr, k));

    }
    public static int ssum(int[]arr,int k){
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int msum=sum;

        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];                      //here we take sum and -start and +end creating doffernt subarray sum and 
            msum=Math.max(sum,msum);                       //and taking max result;

        }
        return msum;
    }
}