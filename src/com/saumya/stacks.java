package com.saumya;

import java.util.Stack;


// in stack, for adding items we use push and for removing its pop
//for stack it is FILO ( FIRST IN LAST OUT)
//Stack in java in itself is generic type


public class stacks {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 5;

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
//        stacks custom_stack = new stacks();  // no size provided
//        custom_stack.push(40);
//        custom_stack.push(50);
//        custom_stack.push(13);
//        custom_stack.push(24); custom_stack.push(54);
//
//
//        System.out.println(custom_stack.peek());
//
//        for (int i = 0; i < 10; i++) { //FILO
//            System.out.print(custom_stack.pop()+" ");
//        }
        // but in this custom stack, there is limitation of array length
        //we can remove that by implementing dyanamic stack i.e whenever array.length is reached we increase it by any mulltiple, in this case of 2
        stacks ds = new DynamicStack(5); // In this the output will be the same as doing DynamicStack ds = new DynamicStack(5)
        ds.push(40);           // the above statement is one of the functionality of the OOP where ds can only use the method of the reference class which is stacks , but in the case when method is overridden the method of child class is initiated
        ds.push(50);
        ds.push(13);
        ds.push(24); ds.push(54);
        ds.push(34);
        for (int i = 0; i < 6; i++) {
            System.out.print(ds.pop()+" ");
        }
    }
}
