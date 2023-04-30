package com.saumya;

public class Multithreading implements  Runnable{ //extends Thread
    private  int thread_num;

    public Multithreading(){

    }
    public Multithreading(int thread){
        this.thread_num = thread;
    }
    @Override
    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " from thread " + thread_num);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("e");
            }
        }
    }
}
