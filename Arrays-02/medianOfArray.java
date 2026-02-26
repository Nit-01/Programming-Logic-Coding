/*
Given an array arr[] of integers, calculate the median.

Examples:

Input: arr[] = [90, 100, 78, 89, 67]
Output: 89
Explanation: After sorting the array middle element is the median 

Input: arr[] = [56, 67, 30, 79]
Output: 61.5
Explanation: In case of even number of elements, average of two middle elements is the median. 
*/

import java.util.*;
class medianOfArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];   
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        Arrays.sort(arr);

        if(n%2==1){
            System.out.println(arr[n/2]);
        }else{
            System.out.println((arr[n/2]+arr[n/2-1])/2.0);
        }
    }
}

