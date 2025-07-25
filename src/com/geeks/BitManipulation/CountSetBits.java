package com.geeks.BitManipulation;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.print(count(Integer.MAX_VALUE));
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
