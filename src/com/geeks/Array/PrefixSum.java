package com.geeks.Array;

import com.geeks.Hash.Array_Count;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
        Scanner sc = new Scanner(System.in);
        int[] arr = a.arr(10);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(getSum(preProcess(arr),s,e));
    }
    public static int[] preProcess(int[] arr){
        int[] pre = new int[arr.length];
        pre[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            pre[i] = pre[i-1]+arr[i];
        }
        return pre;
    }
    public static int getSum (int[] arr,int s,int e){
        if(s==0){
            return arr[e];
        }
        return arr[e]-arr[s-1];
    }
}
