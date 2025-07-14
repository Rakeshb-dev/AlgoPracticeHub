package com.geeks.Array;

import java.util.List;

public class Minimum_Adjacent {
    public static void main(String[] args) {
     int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(minAdjDiff(arr,arr.length ));
    }
    public static int minAdjDiff(int[] arr, int n) {
        int min =Integer.MAX_VALUE;
        for(int i =1;i<arr.length;i++){
            int sum = Math.abs(arr[i-1]+(-1*arr[i]));
            if(sum<min){
                min=sum;
            }
        }
        min = Math.min(min,(Math.abs(arr[0]+(-1*arr[n-1]))));
        return min;
    }
}
