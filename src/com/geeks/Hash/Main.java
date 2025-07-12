package com.geeks.Hash;

public class Main {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);

        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        mh.insert(72);

        mh.display();

        System.out.println("Search 15: " + mh.search(15));  // true
        System.out.println("Search 5: " + mh.search(5));    // false

        mh.delete(15);
        mh.display();

        System.out.println("Search 15 after removal: " + mh.search(15)); // false
    }
}
