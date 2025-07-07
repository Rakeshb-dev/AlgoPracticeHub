package com.geeks.Array;

public class SortedOrNot {
    public static void main(String[] args) {
         int[] arr ={10,10,10};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){

        if(arr[0]<arr[1]){
            for(int i =1;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else {
            for(int i =1;i<arr.length-1;i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
