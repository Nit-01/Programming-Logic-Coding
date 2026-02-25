/* 
Given an array arr. Determine if there exists an element in the array such that the sum of the elements on its left is 
equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered 
to be zero. 

Input: arr[] = [1, 2, 3, 3]
Output: true
Explanation: Consider 1-based indexing i = 3, for [1, 2] sum is 3 and for [3] sum is also 3.

Input: arr[] = [1, 5]
Output: false
Explanation: No such index present.
*/


import java.util.*;
class leftSumEqualRight{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];
        boolean isequal=true;
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int totalsum=0;
        int leftsum=0;

        for(int num:arr){
            totalsum+=num;
        }
        for(int i=0;i<n;i++){
            totalsum-=arr[i];

            if(leftsum==totalsum){
                isequal=true;
                break;
            }else{
                leftsum+=arr[i];
            }
        }
        System.out.println(isequal);

    }
}