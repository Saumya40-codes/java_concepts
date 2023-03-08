package com.saumya;


import java.util.LinkedList;
import java.util.Queue;

//It is kind of implemented from linked list
//Queue is FIFO data structure
public class queue {
    private int[] data;
    int end =0;
    int size = 5;

    public queue(){
        this.data = new int[this.size];
    }

    public queue(int size){
        this.data = new int[size];
    }

    public boolean add(int item){
        if(isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty())
            throw  new Exception("Queue is Empty");

        int removed = data[0];
        // shifting the elements so that first element gets automatically removed or updated
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int fromFirst() throws Exception{
        if(isEmpty())
            throw new Exception("Queue is empty");
        return data[0];
    }
    
    public void displayQueue(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }
    public boolean isFull(){
        return  end == data.length;
    }
    public boolean isEmpty(){
        return  end == 0;
    }
    public static void main(String[] args) throws Exception {
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

        // Implementation of custom queue
        queue custom_queue = new queue(6);
        custom_queue.add(33);
        custom_queue.add(3);
        custom_queue.add(53);
        custom_queue.add(23);
        custom_queue.add(53);
        custom_queue.add(63);

        custom_queue.displayQueue(); //33 3 53 23 53 63 END

        custom_queue.remove();
        custom_queue.remove();
        custom_queue.displayQueue(); //53 23 53 63 END

        custom_queue.remove();
        System.out.println(custom_queue.fromFirst());
    }
}
