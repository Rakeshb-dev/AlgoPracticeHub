package com.geeks.Array;

import java.util.Arrays;

public class D_Time_Rotate {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 8, 9, 23, 46};
        int k = 2;
        System.out.print(Arrays.toString(arr));

    rotation(arr, k);
        System.out.println(Arrays.toString(arr));
}
    public static void rotation(int[] arr,int d){
        int[] temp =new int[d];

        for(int i =0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i =d;i< arr.length;i++){
            arr[i-d] = arr[i];
        }

        for(int i = 0;i<d;i++){
            arr[arr.length-d+i]=temp[i];
        }

    }
}
