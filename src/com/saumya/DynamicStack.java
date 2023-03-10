package com.saumya;

public class DynamicStack extends stacks{
    public DynamicStack(){ // no size mentioned
        super();     // this will call the constructor of the parent class which takes no argument
    }
    public DynamicStack(int size){ //mentioned size
        super(size);
    }

    @Override // overiding stacks push method
    public boolean push(int item) {
        if(this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
