import java.util.*;
class RotateArray{
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        int m=sn.nextInt();
        int[]arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sn.nextInt();
        }
        int k=sn.nextInt();
        rotate(arr, k);

        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    public static void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;

        reverse(arr,0,n-1);
        reverse(arr,n,k-1);
        reverse(arr,k,n-1);

    }
    public static void reverse(int[]arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
