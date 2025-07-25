package com.geeks.Maths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(check(1321));
    }
    public static boolean check(int n){
        int temp =n;
        int rev =0;
        while(temp>0){
            int digit =temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        return (n==rev);
    }
}
