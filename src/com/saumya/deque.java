package com.saumya;

import java.util.ArrayDeque;
import java.util.Deque;


//deque is used for the insertion and deletion from both the side
//Array deques have no capacity restrictions; they grow as necessary to support usage.
//This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(23);
        deque.addFirst(13);
        deque.addLast(342);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
    }
}
