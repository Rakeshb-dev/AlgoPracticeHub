package com.geeks.BitManipulation;

public class SetBitOrNotkth {
    public static void main(String[] args) {
        System.out.println(check(8,3));
    }
    public static boolean check(int n ,int k){
        int x = (1<<(k-1));
        return (x & n) != 0;
    }
}
