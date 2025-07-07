package com.geeks.Array;

import java.util.Arrays;

public class Efficient_Rotation {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 8, 9, 23, 46};
        int k = 2;
        System.out.print(Arrays.toString(arr));

        rotate1(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate1(int[] arr, int d) {
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int d, int i) {
        while (d < i) {
            swap(arr, d, i);
            d++;
            i--;
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}

