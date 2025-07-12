package com.geeks.Hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(21);
        set.add(66);
        set.add(81);
        boolean check =set.contains(81);
        boolean check2 = set.contains(44);
        System.out.println(check+" "+check2);
        set.remove(21);
        System.out.println(set.isEmpty());
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
        set.clear();
        System.out.println(set.isEmpty());
    }
}
