package com.play;


class Thread1 {

    public void ExeTask() throws InterruptedException {
        for(int i=0; i<10; i++){
            System.out.println("task executing printer 1 "+ i);
            Thread.sleep(50000);
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("this is task in printer 2 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


public class MyThread {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("starting the thread .........");


//        Thread1 task = new Thread1();
//        task.ExeTask();

//        Thread2 task2 = new Thread2();
//         task2.start();
//
//        for(int i =0;i<10; i++){
//            System.out.println("this is task in main fun " + i);
//            Thread.sleep(1000);
//        }


        System.out.println("Terminating the thread ............");


        System.out.println((int)Math.sqrt(81));

    }
}