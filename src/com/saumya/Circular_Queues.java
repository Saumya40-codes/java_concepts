package com.saumya;

// one of problem with the custom queues were once after the removal of the element that particular index was removing empty
//with the help of the circular queues it is possible to solve this and to also initiate adding and removal in O(1) time

public class Circular_Queues {
    private int[] data;
    int end = 0;
    int front = 0;
    int size = 0;

    public Circular_Queues(int size){
        this.data = new int[size];
    }

    public boolean add(int item){
        if(isFull())
            return false;
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty())
            throw  new Exception("Queue is Empty");

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void display(){
        if(isEmpty()) {
            System.out.println("Empty !!");
            return;
        }
       int i = front;
       do{
           System.out.print(data[i] + " ");
           i++;
           i %= data.length;
       } while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        Circular_Queues ce = new Circular_Queues(5);
        ce.add(12);
        ce.add(23);
        ce.add(234);
        ce.add(27);
        ce.add(36);
        ce.display();  //12 23 234 27 36 END
        //removing item
        System.out.println("Removed item:"+ ce.remove()); //Removed item:12
        //inserting new items > size
        ce.add(594);
        ce.display(); // 23 234 27 36 594 END
    }
}