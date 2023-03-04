package com.saumya;

import java.util.Arrays;
import java.util.Stack;


// in stack, for adding items we use push and for removing its pop
//for stack it is FILO ( FIRST IN LAST OUT)
//Stack in java in itself is generic type


public class stacks {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public stacks(int size) {
        this.data = new int[size];     // initializing the default size of an array
    }

    public stacks(){
        this.data = new int[DEFAULT_SIZE];  // if no default size is added, we will initialize it to our custom default size
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Limit exceeded");
            return  false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return  ptr == data.length-1;
    }

    public boolean isEmpty(){
        return  ptr == -1;
    }

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(40);
        stack.push(50);
        stack.push(13);
        stack.push(24);

        // here the order of adding elements in stack is 40 50 13 24

        System.out.println(stack.pop()); // remove the last item which was inserted
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //As its FILO the order of removing(pop) will be 24 13 50 40

        //peek method gives the top most value of the stack or say the last entered value

        //-->  Custom stack class
        stacks custom_stack = new stacks();  // no size provided
        custom_stack.push(40);
        custom_stack.push(50);
        custom_stack.push(13);
        custom_stack.push(24); custom_stack.push(54);  custom_stack.push(99); custom_stack.push(59);
        custom_stack.push(51);
        custom_stack.push(33);
        custom_stack.push(65);

        System.out.println(custom_stack.peek());

        for (int i = 0; i < 10; i++) { //FILO
            System.out.print(custom_stack.pop()+" ");
        }
    }
}
