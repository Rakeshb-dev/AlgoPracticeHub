package com.geeks.Array;

public class Rain_Water_Trap {
    public static void main(String[] args) {
         int[] arr ={5,0,6,2,3};
        System.out.println(total(arr));
    }
    public static int total(int[] arr){
        int res =0;
        int length = arr.length;
        int[] lmax = new int[length];
        int[] rmax = new int[length];

        lmax[0]=arr[0];
        for(int i = 1;i<length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        rmax[length-1]=arr[length-1];
        for(int i = length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }

        for(int i =1;i<length-1;i++){
            res = res +  (Math.min(lmax[i],rmax[i])-arr[i]);
        }
        return res;
    }
}
