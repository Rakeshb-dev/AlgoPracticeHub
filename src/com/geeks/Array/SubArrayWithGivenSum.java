package com.geeks.Array;

import com.geeks.Hash.Array_Count;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(2);
        System.out.println(sum(arr,3));
    }
    public static boolean sum(int[] arr,int target){
        int start= 0;
        int end =0;
        int sum =0;
        while(start< arr.length&&end<arr.length){
            if(target>sum){
                sum+=arr[end];
                end++;
            }
            if (target<sum){
                sum-=arr[start];
                start++;
            }
            if(target==sum){
                return true;
            }
        }
        return false;
    }
}
