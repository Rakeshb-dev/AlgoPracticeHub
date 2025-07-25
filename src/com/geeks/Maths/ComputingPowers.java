package com.geeks.Maths;

public class ComputingPowers {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int temp =power(x,n/2);
        temp = temp*temp;
        if(n%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }
}
