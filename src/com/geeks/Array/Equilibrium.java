package com.geeks.Array;

public class Equilibrium {
    public static void main(String[] args) {

    }
    public static boolean ePoint(int[] arr){
        int rSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rSum+=arr[i];
        }
        int lSum =0;
        for (int j : arr) {
            rSum -= j;
            if (rSum == lSum) {
                return true;
            }
            lSum += j;
        }
        return  false;
    }

}
