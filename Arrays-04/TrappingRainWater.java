/*

Input: arr[] = [3, 0, 2, 0, 4]
Output: 7
Explanation: Total water trapped = 0 + 3 + 1 + 3 + 0 = 7 units.

Input: arr[] = [1, 2, 3, 4]
Output: 0
Explanation: We cannot trap water as there is no height bound on both sides.


Input: arr[] = [2, 1, 5, 3, 1, 0, 4]
Output: 9
Explanation: Total water trapped = 0 + 1 + 0 + 1 + 3 + 4 + 0 = 9 units.


Water gets stored only when:
There is a tall wall on LEFT
AND a tall wall on RIGHT

Step-by-Step 
Look at index 1 (height = 0)
Left side max = 3
Right side max = 4

Water fills up to the smaller wall

min(3, 4) = 3

So:

water = 3 - 0 = 3

Look at index 2 (height = 1)
Left max = 3
Right max = 4
water = 3 - 1 = 2

Look at index 3 (height = 0)
Left max = 3
Right max = 4
water = 3 - 0 = 3

total Water
3 + 2 + 3 = 8

*/
import java.util.*;
class TrappingRainWater{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        System.out.println(res(arr));
    }
    public static int res(int[]arr){
        int n=arr.length;
        int[]leftmax=new int[n];
        int[]rightmax=new int[n];

        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }

        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int result=0;
        for(int i=0;i<n;i++){
            result+=Math.min(leftmax[i],rightmax[i])-arr[i];
        }

        return result;
    }
}