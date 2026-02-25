/*
Given an array, arr[] of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.

Examples:

Input: arr[] = [2, 4, 3, 5, 6]
Output: [2, 3] 
Explanation: 2 and 3 are respectively the smallest and second smallest elements in the array.
Input: arr[] = [1, 1, 1]
Output: [-1]
Explanation: Only element is 1 which is smallest, so there is no second smallest element.

*/



import java.util.*;
class firstAndSecondSmallest{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sn.nextInt();
        }
        TreeSet<Integer>t=new TreeSet<>();

        for(int num:arr){
            t.add(num);
        }
        ArrayList<Integer>a=new ArrayList<>();

        if(t.size()<2){
            a.add(-1);

        }else{
            Iterator<Integer>i=t.iterator();
            a.add(i.next());
            a.add(i.next());
        }
        System.out.print(a);
    }

}

