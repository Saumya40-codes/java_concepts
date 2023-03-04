package com.saumya;


import java.util.LinkedList;
import java.util.Queue;

//It is kind of implemented from linked list
//Queue is FIFO data structure
public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(40);
        queue.add(12);
        queue.add(22);
        queue.add(24);

        // peek gets the item
        System.out.println(queue.peek()); // 40 (as its the first item)
        // as it is FIFO , the first item will get removed first
        System.out.println(queue.remove()); // 40
        System.out.println(queue.remove()); //12
    }
}
