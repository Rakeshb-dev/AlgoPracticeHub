package com.geeks.Hash;

import java.util.HashSet;

public class SubArraySum0 {
    public static void main(String[] args) {
        Array_Count a = new Array_Count();
       int[] arr = a.arr(5);
        System.out.println(check(arr));
    }
   public static boolean check(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;

       for (int j : arr) {
           pre_sum += j;

           if (h.contains(pre_sum)) {
               return true;  // duplicate prefix sum means subarray sum = 0
           }

           if (pre_sum == 0) {
               return true;  // subarray from index 0 to i has sum 0
           }

           h.add(pre_sum);
       }

        return false;
    }


}
