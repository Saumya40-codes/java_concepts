package com.saumya;
/*
A thread is a execution unit in java

in normal programs a particular function/operation start when another operation ends

with multithreading you can carry out different operations on the same time thus better optimization
 */
public class multithreading_main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Multithreading mt_m = new Multithreading(i);
            Thread myThread = new Thread(mt_m);
            myThread.start();
//            try {
//                myThread.join();   //though this basically affects the purpose of multithread, by this you can stop other thread from execute while a particular thread is still running
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(myThread.isAlive()); //return boolean whether the given thread is alive or not
        }
    }
}
