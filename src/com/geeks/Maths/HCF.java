package com.geeks.Maths;

public class HCF {
    public static void main(String[] args) {
        HCF h = new HCF();
        System.out.println(h.gcd(200,100));
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }
}
