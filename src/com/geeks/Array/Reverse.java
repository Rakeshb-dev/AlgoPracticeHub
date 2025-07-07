package com.geeks.Array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
         int [] arr = {1,98,34,56,65,23};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }

}
