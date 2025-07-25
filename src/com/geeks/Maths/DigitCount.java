package com.geeks.Maths;

public class DigitCount {
    public static void main(String[] args) {
        System.out.print(count(123456789));
    }
    public static int count(int n){
        int count =0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}
