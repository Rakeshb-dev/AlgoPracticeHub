package com.geeks.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array_Count a = new Array_Count();
        System.out.println("Enter First Array : ");
        int n = sc.nextInt();
        Integer[] arr1 = a.arr2(n);
        System.out.println("Enter Second Array : ");
        int m = sc.nextInt();
        Integer[] arr2 = a.arr2(m);
        intersection(arr1,arr2);

    }
    public static void intersection(Integer[] arr1,Integer[] arr2){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr2));
        for (Integer integer : arr1) {
            if (set.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
