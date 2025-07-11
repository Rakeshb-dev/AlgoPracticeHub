package com.Kunal.LinkedList;

public class SingleLinkedList {
     private Node head ;
     private Node tail;
     private int size;
     public SingleLinkedList(){
         this.size=0;
     }
     /* Insertion At First */
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    /* Insertion At End */
    public void insertLast(int val){
        if(tail ==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next =node;
        tail=node;
        size++;
    }

    /* Insertion at Middle */
    public void insertMiddle(int val ,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp =head;
        for (int i = 1; i < index; i++) {
            temp =temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;

        size++;

    }
    /* Delete At First */
    public int deleteFirst() {
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail= null;
        }
        size--;
        return value;
    }
    /* Delete At Last */
    public int deleteLast(){
        if(size<=1) {
            return deleteFirst();
        }
        Node secondLarget =get(size-2);
        int value = tail.val;
       tail = secondLarget;
       tail.next=null;
       size--;
       return value;

    }

    /* Delete at Index*/
    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int value = prev.next.val;
        prev.next=prev.next.next;
        size--;
        return value;
    }

    /* Find Method */
    public Node find(int value){
        Node node = head;
        while(node !=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    /* Get Method */
    public Node get(int index){
        Node node =head;
        for(int i =0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    /* Display */
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp =temp.next;
        }
        System.out.println("END");
    }

    /* Class Node */

     class Node{
         private int val;
         private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next=next;
        }
     }
}
