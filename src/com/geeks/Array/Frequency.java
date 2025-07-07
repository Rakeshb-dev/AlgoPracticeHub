package com.geeks.Array;

import java.util.ArrayList;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {10,10,10,25,30,30};
        frequency(arr);
    }
    public static void frequency(int[] arr){

        int temp = arr[0];
        int count =1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]==temp){
                count++;
            }
            else{
                System.out.println(temp +" "+ count);
                count =1;
                temp = arr[i];
            }

        }
        System.out.println(temp +" "+ count); 
    }
}
