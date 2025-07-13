package com.geeks.Array;

import com.geeks.Hash.Array_Count;

import java.util.Arrays;

public class FlipMinimum {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(10);
        System.out.println(Arrays.toString(arr));
        minimum(arr);
    }
    public static void minimum(int[] arr){
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=a){
                    System.out.print("From "+i+" to ");
                }
                else{
                    System.out.print(i-1);
                    System.out.println();
                }
            }
        }
        if(arr[arr.length-1]!=a){
            System.out.print(arr.length-1);
        }
    }
}
