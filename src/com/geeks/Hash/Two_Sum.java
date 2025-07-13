package com.geeks.Hash;

import java.util.Arrays;
import java.util.HashSet;

public class Two_Sum {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(4);
        System.out.println(check(arr,5));
    }
    public static boolean check(int[] arr , int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(set.contains(target - arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
}
