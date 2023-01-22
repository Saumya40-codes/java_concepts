package com.saumya;
public class constructor {
    public static void main(String[] args) {
        //Initially every method has one default constructor while creating its object
        //default constructor takes no parameter
        class Employee {
            float CGPA;
            int exp;
            public Employee(String name , float CGPA){
                System.out.println("name: "+name);
                System.out.println("CGPA:"+CGPA);
                if(CGPA>=3){
                    this.CGPA = CGPA;
                }
            }
            public Employee(String name , int experience){
                System.out.println("name: "+name);
                System.out.println("years of experience:"+experience);
                if(experience >= 1){
                    this.exp =experience;
                }
            }
        }
        Employee e1 = new Employee("a",2);   //Constructor initialize the certain values while creating the object of it
        System.out.println(e1); //name: a
                               //years of experience:2
        Employee e2 = new Employee("b", (float)3.23);
        System.out.println(e2); //name: b
                               //CGPA:3.23
    }
}
