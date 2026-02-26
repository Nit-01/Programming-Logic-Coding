/*AdditionOfTwoMatrices
You are given two square matrices, a[][] and b[][], each of size n x n. Your task is to compute the sum of these two 
matrices and store the result in the matrix a[][] itself.

Examples:

Input: a[][] = [[1, 2], [3, 4]],
       b[][] = [[4, 3], [2, 1]]
Output: [[5, 5], [5, 5]]
Explanation: The will be: [[5, 5], [5, 5]] on adding the corresponding elements of both matrices.


Input: a[][] = [[7, 8], [9, 10]],
       b[][] = [[1, 2], [3, 4]]
Output: [[8, 10], [12, 14]]
Explanation: The result will be [[8, 10], [12, 14]] after adding the corresponding elements of both matrices. 

 */

import java.util.*;
class AdditionOfTwoMatrices{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        int sum[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}