package com.General;

import com.geeks.Hash.Array_Count;

import java.util.Arrays;

public class OneandZero {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(10);
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int countB =0;
        for (int j : arr) {
            if (j == 1) {
                countB++;
            }
        }
        for(int i =0;i<arr.length;i++){
           if(countB>0){
               arr[i]=1;
               countB--;
           }
           else{
               arr[i]=0;
           }
        }
        return arr;
    }
}
