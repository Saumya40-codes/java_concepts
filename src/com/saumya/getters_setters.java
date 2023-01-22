package com.saumya;
//referencing getters and setters with the code of constructors.java
public class getters_setters {
    public static void main(String[] args) {
            //Initially every method has one default constructor while creating its object
            //default constructor takes no parameter
            class Employee {
                public float CGPA;
                int exp;
                /*public Employee(String name , float CGPA){
                    System.out.println("name: "+name);
                    System.out.println("CGPA:"+CGPA);
                    if(CGPA>=3){
                        this.CGPA = CGPA;
                    }
                } */   //instead of this we can use getters and setters ( as name suggests setters -> sets value , getters -> returns value)

                public void setcpga(float c){
                    this.CGPA = c;
                }
                public float getcgpa(){
                    return this.CGPA;
                }
                public void setExp(int exp) {
                    this.exp = exp;
                }
                public int getExp() {
                    return this.exp;
                }
                /*
                public Employee(String name , int experience){
                    System.out.println("name: "+name);
                    System.out.println("years of experience:"+experience);
                    if(experience >= 1){
                        this.exp =experience;
                    }
                } */
            }
            Employee e1 = new Employee();
            e1.setcpga((float) 3.23);
            System.out.println(e1.getcgpa()); //3.23
            Employee e2 = new Employee();
            e2.setExp(2);
            System.out.println(e2.getExp()); //2
    }
}
