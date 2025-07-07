package com.geeks.Array;

public class Max_Difference {
    public static void main(String[] args) {
       int[] arr = {2,3,10,6,4,8,1};

        System.out.println(maxDifference(arr));
    }
    public static int maxDifference(int[] arr){
        int res = arr[0]-arr[1];
        int min = arr[0];

        for(int j = 1;j< arr.length;j++){
            res = Math.max(res,arr[j]-min);
            min = Math.min(min,arr[j]);
        }
        return res;
    }
}
