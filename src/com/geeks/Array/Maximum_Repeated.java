package com.geeks.Array;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Repeated {
    public static void main(String[] args) {
        int[] start = {1, 2, 4};
        int[] end = {4, 5, 7};
        System.out.println(maximum(start, end));
    }

    public static int maximum(int[] start, int[] end) {
        int[] freq = new int[101];

        for (int i = 0; i < start.length; i++) {
            freq[start[i]]++;
            if (end[i] + 1 < 101) {
                freq[end[i] + 1]--;
            }
        }

        int res = 0;
        for (int i = 1; i < 100; i++) {
            freq[i] = freq[i] + freq[i - 1];
            if (freq[i] > freq[res]) {
                res = i;
            }
        }

        return res;
    }
}
