/*
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by 
d steps, where d is a positive integer. Do the mentioned change in the array in place.

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]

Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]

*/

import java.util.*;
class rotateArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();

        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int d=sn.nextInt();
        d=d%n;
        int []result=new int[n];
        int index=0;

        for(int i=d;i<n;i++){
            result[index++]=arr[i];
        }
        for(int i=0;i<d;i++){
            result[index++]=arr[i];
        }
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
