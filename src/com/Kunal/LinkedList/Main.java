package com.Kunal.LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertFirst(19);
        list.insertFirst(89);
        list.insertFirst(12);
        list.insertFirst(65);
        list.insertLast(96);
        list.insertMiddle(55,3);
        list.display();
        System.out.println(list.deleteIndex(2));
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();

        DoubleLinkedList list1 = new DoubleLinkedList();
        list1.insertFirst(21);
        list1.insertFirst(22);
        list1.insertFirst(23);
        list1.insertFirst(25);
        list1.insertFirst(28);
        list1.insertFirst(29);
        list1.insertLast(20);
        list1.display();
    }
}
