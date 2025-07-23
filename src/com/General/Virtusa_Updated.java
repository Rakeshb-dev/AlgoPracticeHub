package com.General;

import com.geeks.Hash.Array_Count;

import java.util.Arrays;
import java.util.Comparator;

public class Virtusa_Updated {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        Integer[] arr = a.arr2(14);
        Arrays.sort(arr, Comparator.comparing(Virtusa_Updated::count));
        System.out.println(Arrays.toString(arr));
    }
    public static int count(int num){
        int count =0;
        while(num>0){
            if((num%10)==7||(num%10)==5||(num%10)==3||(num%10)==2){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
