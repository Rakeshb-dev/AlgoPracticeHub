package com.geeks.Array;

public class Efficient_Sum_of_SubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr){
        int current = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            current = Math.max((current+arr[i]),arr[i]);
            max = Math.max(max,current);
        }
        return max;
    }
}
