/*

Input: arr[] = [-1, 2, -1, 3, 2]
Output: 3
Explanation: -1 and 2 are repeating whereas 3 is the only number occuring once. Hence, the output is 3. 

Input: arr[] = [1, 1, 1]
Output: 0
Explanation: There is not present any non-repeating element so answer should be 0.


*/

import java.util.*;
class NonRepeatingElement{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int[]arr=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int num:arr){
            if(map.get(num)==1){
                System.out.println(num);
                return;
            }
        }
        System.out.println("0");
    }
}
