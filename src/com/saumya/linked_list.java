package com.saumya;
public class linked_list {
    public static void main(String[] args) {
        linked_list l1 = new linked_list();
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.insertFirst(4);
        l1.insertFirst(5);

        l1.display();  //5 -> 4 -> 2 -> 3 -> end
    }
    private Node head;
    private Node tail;
    private int size;
    public linked_list(){
        this.size = size;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    private class Node{
        private int  value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
