/*unionOfTwoSortedArray
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the 
elements in the union of the two arrays in sorted order.
Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: [1, 2, 3, 4, 5, 6, 7]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.


Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: [1, 2, 3, 4, 5]
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
 */

import java.util.*;
class unionOfTwoSortedArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sn.nextInt();
        }
        int m=sn.nextInt();
         int[]arr2=new int[n];
        for(int i=0;i<m;i++){
            arr2[i]=sn.nextInt();
        }
        TreeSet<Integer>t=new TreeSet<>();

        for(int num:arr1){
            t.add(num);
        }
        for(int num:arr2){
            t.add(num);
        }
        System.out.print(t+" ");
    }
}