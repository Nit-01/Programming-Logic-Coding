/* 
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.
Input: arr[] = [90, 80, 100, 70, 40, 30]
Output: false
Explanation: The given array is not sorted.

*/


import java.util.*;

class checkIsSorted{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
       
        int n=sn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        boolean isf=true;
        for(int i=1;i<n-1;i++){
         if(arr[i]<arr[i-1]){
             isf=false;
         }
        }
        if(!isf){
            System.out.println("false");
        } else{
            System.out.println("true");
        }
    }
}