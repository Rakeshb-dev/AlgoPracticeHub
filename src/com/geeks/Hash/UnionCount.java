package com.geeks.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UnionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array_Count a = new Array_Count();
        System.out.println("Enter First Array : ");
        int n = sc.nextInt();
        Integer[] arr1 = a.arr2(n);
        System.out.println("Enter Second Array : ");
        int m = sc.nextInt();
        Integer[] arr2 = a.arr2(m);
        System.out.println(union(arr1,arr2));

    }
    public static HashSet<Integer> union (Integer[] arr1,Integer[] arr2){
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr1));

        set.addAll(Arrays.asList(arr2));
        return set;
    }
}
