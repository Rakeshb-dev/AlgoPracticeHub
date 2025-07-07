package com.geeks.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
//      int n = 4; // current number of elements

        System.out.println("Enter 4 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 5;
        int pos = 2;
//      int n = insert(arr, n, x, pos);
        int n = delete(arr,x,arr.length);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int insert(int[] arr, int n, int x, int pos) {
        if (n >= arr.length) {
            System.out.println("No space to insert!");
            return n;
        }
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;
        return n + 1;
    }

    public static int delete(int[] arr, int x, int n) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n) {
            return n;
        }
        for(int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        return (n-1);
    }
}
