package com.example.demo.practice;

public class TestinngClass implements Runnable {

    public static void main(String[] args) {

        TestinngClass thread = new TestinngClass();
        Thread t = new Thread(thread);
        t.start();
    }

    @Override
    public void run() {
        for(int i = 0 ; i<= 10 ; i ++){
            System.out.println(i);
        }
    }
}
