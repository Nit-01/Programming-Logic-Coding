/*
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window [-8, 2] First negative integer is -8.
Window [2, 3] No negative integers, output is 0.
Window [3, -6] First negative integer is -6.
Window [-6, 10] First negative integer is -6.



*/

import java.util.*;
class FirstNegativeInEveryWindow{
    public static void main(String[]args){

        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int k=sn.nextInt();

        System.out.print(lastNum(arr,k));

    }
    public static List<Integer> lastNum(int[]arr ,int k){

        List<Integer>res=new ArrayList<>();

        for(int i=0;i<=arr.length-k;i++){
            boolean found=false;

            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    res.add(arr[j]);
                    found=true;

                }
            }
            if(!found){
                res.add(0);
            }
        }
        return res;
    }
}