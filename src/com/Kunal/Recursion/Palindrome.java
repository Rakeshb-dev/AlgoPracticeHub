package com.Kunal.Recursion;

public class Palindrome {

    static int sum =0;
    public static int reverse(int n){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n = 12321;
        boolean flag = n==reverse(n);
        System.out.println(flag);
    }

}
