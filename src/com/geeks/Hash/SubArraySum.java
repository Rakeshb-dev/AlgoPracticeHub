package com.geeks.Hash;

import java.util.HashSet;

public class SubArraySum {
    public static void main(String[] args) {

    }
    public static boolean check(int[] arr,int target){
        HashSet<Integer> set = new HashSet<>();
        int preSum =0;
        for(int x:arr){
            preSum+=x;
            if(preSum==target) return true;
            if(set.contains(preSum-target)){
                return true;
            }
            set.add(preSum);
        }
        return false;
    }
}
