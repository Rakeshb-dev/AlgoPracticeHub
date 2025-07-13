package com.geeks.Array;

import com.geeks.Hash.Array_Count;

public class SlidingWindow {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        int[] arr = a.arr(12);
        System.out.println(largestSumSubArray(arr,2));
    }
    public static int largestSumSubArray(int[] arr,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int current = sum;
        for(int i= k;i<arr.length;i++){
            sum= sum+arr[i]-arr[i-k];
            current=Math.max(current,sum);
        }
        return current;
    }
}
