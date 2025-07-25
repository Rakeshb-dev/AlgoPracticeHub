package com.geeks.Maths;

import java.util.*;

public class PrintFactors {
    public static void main(String[] args) {
        printDivisors(25);
    }

    public static void printDivisors(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        // Print in sorted order
        for (int x : small) {
            System.out.print(x + " ");
        }
        Collections.reverse(large);
        for (int x : large) {
            System.out.print(x + " ");
        }
    }
}
