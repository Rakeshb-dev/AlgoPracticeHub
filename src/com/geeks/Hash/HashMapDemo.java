package com.geeks.Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        map.put("Helo",3);
        map.put("Bye",3);
        map.put("Hello",3);
        System.out.println(map);
        System.out.println(map.size());
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }
    }
}
