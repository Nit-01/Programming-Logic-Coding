/*
Given two arrays a[] and b[], your task is to determine whether b[] is a subset of a[].

Examples:

Input: a[] = [11, 7, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7]
Output: true
Explanation: b[] is a subset of a[]
Input: a[] = [1, 2, 3, 4, 4, 5, 6], b[] = [1, 2, 4]
Output: true
Explanation: b[] is a subset of a[]

*/


import java.util.*;
class isSubSet{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int m=sn.nextInt();
        int []b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sn.nextInt();
        }

        HashMap<Integer,Integer>map=new HashMap<>();
        boolean isSub=true;

        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(!map.containsKey(num) || map.get(num)==0){
                isSub=false;
                break;
            }
            map.put(num,map.get(num)-1);
        }
        System.out.println(isSub);
    }
}