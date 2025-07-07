package com.geeks.Array;

import java.util.Arrays;

import static com.geeks.Array.Rotated_one_Time.rotate;

public class Rotate_D_times {
    public static void main(String[] args) {
     int[] arr={2,6,7,8,9,23,46};
     int k =2;
        System.out.println(Arrays.toString(arr));
     rotated(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotated(int[] arr,int k){
        for(int i =1;i<=2;i++){
            rotate(arr);
        }
    }
}
