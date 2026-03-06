//FrequenciesInLimitedArray

/*
Input: arr[] = [2, 3, 2, 3, 5]
Output: [0, 2, 2, 0, 1]
Explanation: We have: 1 occurring 0 times, 2 occurring 2 times, 3 occurring 2 times, 4 occurring 0 times, and 5 occurring 1 time.


Input: arr[] = [3, 3, 3, 3]
Output: [0, 0, 4, 0]
Explanation: We have: 1 occurring 0 times, 2 occurring 0 times, 3 occurring 4 times, and 4 occurring 0 times.


Input: arr[] = [1]
Output: [1]
Explanation: We have: 1 occurring 1 time, and there are no other numbers between 1 and the size of the array.
*/
import java.util.*;
class FrequenciesInLimitedArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        int[] freq=new int[n];

        for(int i=0;i<n;i++){
            if(arr[i]<=n){
                freq[arr[i]-1]++;
            }
        }
        for(int num:freq){
            System.out.print(num+" ");
        }
    }
}