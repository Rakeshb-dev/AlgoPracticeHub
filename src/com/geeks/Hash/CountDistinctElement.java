package com.geeks.Hash;

import java.util.Arrays;
import java.util.HashSet;

public class CountDistinctElement {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(12);
        Integer[] arr1 = {1,2,3,4,4,4,5,5,5,6,6,6,6,7};
        System.out.println(count(arr));
        System.out.println(distinct(arr1));
    }
    public static int count(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i< arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static int distinct(Integer[] arr){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size();
    }
}
