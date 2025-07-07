package com.geeks.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
       for(int i=0;i<5;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println(Arrays.toString(arr));
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr){
        int largest = 0;
        int second = -1;

        for(int i =1;i<arr.length;i++) {
            if (arr[i] > arr[largest]) {
                second = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (second == -1 || arr[i] > arr[second]) {
                    second = i;
                }
            }
        }
        return second;
    }
}
