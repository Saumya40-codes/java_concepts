package com.saumya;

//Let's say we want to make a class of function related to the series of smartphone
//Every one of them will be having the function of ringing,calling,messaging etc.
//Thus while writing method related to every one of them we need to mention the method for the common properties related to all smartphones .
//With inheritance it is possible to decrease the complexity of this
public class inheritance {
    int gb = 0;

    public inheritance() {
        System.out.println("No arguments");
    }

    public inheritance(int gb) {
        this.gb = gb;
    }

    public void setgb(int gb){
        this.gb = gb;
    }
    public void getgb(){
        System.out.println("Parent class");
        System.out.println(gb);
    }
    public static void main(String[] args) {
        child c1 = new child(8);
        c1.getgb(); // Parent class 8
        c1.setGb(24);
        c1.getGb(); // Child class 24
    }
}
class child extends inheritance{
    // using super keyword to initialise the constructor of the parent class
    public child(int gb){
        super(gb);
    }

    //using super keyword to access to variable of parent class
    public void setGb(int gb){
        super.gb = gb;
    }
    public void getGb(){
        System.out.println("Child class");
        System.out.println(gb);
    }
}
