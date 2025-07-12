package com.geeks.Hash;
import java.util.*;

class MyHash {
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<>();
        for(int i =0;i<b;i++){
            table.add(new LinkedList<>());
        }
    }
    /* Insert */
    public void insert(int n){
        int i = n%BUCKET;
        table.get(i).add(n);
    }

    /* Delete */
    public void delete(int n){
        int i = n%BUCKET;
        table.get(i).remove((Integer)n);
    }

    /* Search */
    public boolean search(int n){
        int i = n%BUCKET;
       return table.get(i).contains(n);
    }

    /* Display */

    public void display(){
        for(int i =0;i<BUCKET;i++){
            System.out.print(i+ " : ");
            for(int n:table.get(i)){
                System.out.print(n+" -> ");
            }
            System.out.println("NULL");
        }
    }
}

