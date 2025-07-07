package com.geeks.Array;

import java.util.Arrays;

public class Move_Zero_to_End {
    public static void main(String[] args) {
        int[] arr = {10,0,0,20,0,30};
        System.out.println(Arrays.toString(arr));
        move(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void move(int[] arr){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    public static void swap(int[]arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
