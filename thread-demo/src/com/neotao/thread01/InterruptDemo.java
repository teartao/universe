package com.neotao.thread01;


public class InterruptDemo implements Runnable {

    private static volatile boolean isRunning = false; //中断标识

    @Override
    public void run() {
        while (!isRunning) { //!true
            //TODO
        }

    }

    public static void main(String[] args) {
        System.out.println("test");
        Thread thread = new Thread();
        thread.interrupt();//isRunning=true;
    }

}
