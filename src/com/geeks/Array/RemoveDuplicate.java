package com.geeks.Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
    int[] arr ={10,20,20,20,30,30,30,30};
        System.out.println(Arrays.toString(arr));
        int n = reverse(arr);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int reverse(int[] arr){
        int res =1;
        for(int i =1;i< arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
