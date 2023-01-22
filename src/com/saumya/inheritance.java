package com.saumya;

//Let's say we want to make a class of function related to the series of smartphone
//Every one of them will be having the function of ringing,calling,messaging etc.
//Thus while writing method related to every one of them we need to mention the method for the common properties related to all smartphones .
//With inheritance it is possible to decrease the complexity of this
public class inheritance {
    public static void main(String[] args) {
         class Smartphones{
             public static void call() {
                 System.out.println("call");
                 System.out.println("Class:Smartphones");
             }
             public static void ring(){
                 System.out.println("ringing");
                 System.out.println("Class:Smartphones");
             }
             public static void message() {
                 System.out.println("Ringing");
                 System.out.println("Class:Smartphones");
             }
             }
             //now with taking Smartphones class as a template we can other smartphone related class by having property of Smartphones call and adding new property to it
         class s1 extends Smartphones{
             //s1 inherits smartphones
             public static void connect(){
                 System.out.println("connecting");
             }
         }
         class a1 extends Smartphones{
             public static void music(){
                 System.out.println("Music");
             }
         }
         //Class is template of an object and object is an instance of a class
        Smartphones s = new Smartphones();
         s.call(); //call  //Class:Smartphones
         s1 sm1 = new s1();
         sm1.call(); //call  //Class:Smartphones
         sm1.connect(); //connecting
         a1 am1 = new a1();
         am1.ring(); //ringing //Class:Smartphones
         am1.music();//Music
         }
    }