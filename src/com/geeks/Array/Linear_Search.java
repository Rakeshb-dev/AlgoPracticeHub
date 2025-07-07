package com.geeks.Array;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr ={16,21,32,52,43,34,21};
        int target =43;

        System.out.println(linearSearch(arr,target));
    }
    public static int linearSearch(int[] arr,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
