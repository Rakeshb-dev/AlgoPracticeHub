package com.Kunal.Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr ={1,3,6,9,10,13,16,19,20,25,28};
        int target = 29;
        System.out.println(binary(arr,target,0, arr.length-1));
    }
    public static int binary(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]<target){
            return binary(arr,target,m+1,e);
        }

            return binary(arr,target,s,m-1);

    }
}
