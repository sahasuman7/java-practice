package com.JavaTutorial;

class MyThread implements Runnable{

    public void run() {
        for(int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+i);
            try{
                Thread.sleep(1000);
            }catch(Exception ie){

            }
        }

    }
}


public class PracticeRunnable {
    public static void main(String[] args) {
        MyThread mt =new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.setName("Red");
        t2.setName("Green");
        t3.setName("Blue");
//        try{
            t1.start();
            t2.start();
//        }catch(Exception ie){

            t3.start();

//        }

    }
}
