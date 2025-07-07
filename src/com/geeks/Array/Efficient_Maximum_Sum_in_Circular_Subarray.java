package com.geeks.Array;

public class Efficient_Maximum_Sum_in_Circular_Subarray {
    public static void main(String[] args) {
        int[] arr ={5,-2,3,4};
        System.out.println(circularSum(arr));
    }
    public static int normalSum(int[] arr){
        int result = arr[0];
        int max= arr[0];
        for(int i =1;i< arr.length;i++){
            max = Math.max(max+arr[i],arr[i]);
            result = Math.max(result,max);
        }
        return result;
    }

    public static int circularSum(int[] arr){
        int maxNormal = normalSum(arr);
        if(maxNormal<0){
            return maxNormal;
        }
        int arrSum = 0;
        for(int i =0;i< arr.length;i++){
            arrSum+=arr[i];
            arr[i]= -arr[i];
        }
        int max = arrSum+normalSum(arr);
        return Math.max(max,maxNormal);
    }
}
