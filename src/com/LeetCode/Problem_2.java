package com.LeetCode;

public class Problem_2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6};
        int[] arr2 = {5,4,3};
        System.out.println(sum(arr1,arr2));
    }
    public static int sum(int[]arr1,int[] arr2){
        int Max = Math.max(arr1.length,arr2.length);
        int sum1=0;
        int sum2=0;
        for(int i =0;i<Max;i++){
            if(i<arr1.length){
                sum1=sum1*10+arr1[i];
            }
            if(i<arr2.length){
                sum2=sum2*10+arr2[i];
            }
        }
        return sum1+sum2;
    }
}
