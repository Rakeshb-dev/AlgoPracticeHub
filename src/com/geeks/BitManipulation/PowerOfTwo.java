package com.geeks.BitManipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(check(10));
    }
    public static boolean check(int n){
        return ((n&(n-1))==0);
    }
}
