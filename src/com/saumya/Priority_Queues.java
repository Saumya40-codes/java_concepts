package com.saumya;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queues {
    public static void main(String[] args) {
        // YAY
        Queue<Integer> pq = new PriorityQueue<>();

        // on default priority queue is min heap
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        System.out.println(pq);

        //removing elements
        pq.poll();
        System.out.println(pq);

        //peeking elements (i.e next element to be removed)
        System.out.println(pq.peek());

        System.out.println();

        //max heap
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.offer(10);
        pq2.offer(20);
        pq2.offer(30);
        System.out.println(pq2);

        //removing elements
        pq2.poll();
        System.out.println(pq2);

        //peeking elements (i.e next element to be removed)
        System.out.println(pq2.peek());
    }
}
