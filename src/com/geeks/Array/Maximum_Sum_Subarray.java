package com.geeks.Array;

public class Maximum_Sum_Subarray {
    public static void main(String[] args) {
      int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(maximum(arr));
    }
    public static int maximum(int[] arr){
        int result = arr[0];
        for(int i =0;i<arr.length;i++){
            int current =0;
            for (int j = i; j < arr.length ; j++) {
                current=current+arr[j];
                result=Math.max(result,current);
            }
        }
        return result;
    }
}
