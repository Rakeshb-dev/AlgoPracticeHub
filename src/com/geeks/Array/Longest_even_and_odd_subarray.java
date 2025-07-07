package com.geeks.Array;

public class Longest_even_and_odd_subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6,7,8,9};
        System.out.println(check(arr));
    }
    public static int check(int[] arr){
        int result =1;
        int current =1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]%2==0&&arr[i-1]%2!=0||arr[i-1]%2==0&&arr[i]%2!=0){
                current++;
                result=Math.max(result,current);
            }
            else{
                current=1;
            }
        }
        return result;
    }
}
