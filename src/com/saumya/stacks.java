package com.saumya;

import java.util.Stack;


// in stack, for adding items we use push and for removing its pop
//for stack it is FILO ( FIRST IN LAST OUT)
//Stack in java in itself is generic type


public class stacks {
    public static void main(String[] args) {
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
    }
}
