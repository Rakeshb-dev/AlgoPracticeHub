package com.geeks.BitManipulation;

import com.geeks.Hash.Array_Count;

public class OneOddOccurring {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(11);
        System.out.println(find(arr));
    }
    public static int find(int[] arr){
        int res =0;
        for(int x : arr){
            res^=x;
        }
        return res;
    }
}
