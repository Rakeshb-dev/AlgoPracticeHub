package com.Kunal.LinkedList;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    /* Insertion At First */
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        node.prev=null;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    /* Insert At Last */
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
        }
        Node node = new Node(val);
        node.next=null;
        node.prev=tail;
        tail=node;
        size++;
    }
    /* Display */
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" <-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }


        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
