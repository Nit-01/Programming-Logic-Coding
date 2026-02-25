/*

The Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

*/


import java.util.*;
class SecondLargest{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int first,second;
        int n=sn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        
        if(arr[0]>arr[1]){
            first=arr[0];
            second=arr[1];
        }else{
            first=arr[1];
            second=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]==first && arr[i]==second){
                second=-1;
            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}