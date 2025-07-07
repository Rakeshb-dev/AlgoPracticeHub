package com.geeks.Array;

public class Largest {
    public static void main(String[] args) {
        int[] arr ={1000,5,300,86,100};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr) {
        int max = 0;
        for(int i =1;i<arr.length-1;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
