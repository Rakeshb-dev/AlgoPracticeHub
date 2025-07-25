package com.geeks.BitManipulation;

import com.geeks.Hash.Array_Count;

import java.util.Arrays;

public class TwoOddOccurringNumbers {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(10);
        System.out.println(Arrays.toString(find(arr)));
    }
    public static int[] find(int[] arr){

        int res = 0;
        for (int k : arr) {
            res ^= k;
        }
        int temp = res&(-res);
        int res1=0,res2=0;
        for (int j : arr) {
            if ((j & temp) != 0) {
                res1 ^= j;
            } else {
                res2 ^= j;
            }
        }
        return new int[]{res1,res2};
    }
}
