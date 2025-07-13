package com.geeks.Hash;

import java.util.Scanner;

public class Array_Count {
    public int[] arr(int val){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[val];
        for(int i = 0;i<val;i++){
            arr1[i]=sc.nextInt();
        }
        return arr1;
    }
    public Integer[] arr2(int val){
        Scanner sc = new Scanner(System.in);
        Integer[] arr1 = new Integer[val];
        for(int i = 0;i<val;i++){
            arr1[i]=sc.nextInt();
        }
        return arr1;
    }
}
