/*
You are given an integer array arr[]. The task is to find the sum of it.

Examples:

Input: arr[] = [1, 2, 3, 4]
Output: 10
Explanation: 1 + 2 + 3 + 4 = 10.
Input: arr[] = [1, 3, 3]
Output: 7
Explanation: 1 + 3 + 3 = 7.

*/
import java.util.*;
class sumOfArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }

}


