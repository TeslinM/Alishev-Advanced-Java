package Lesson17;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner console = new Scanner(System.in);
        console.nextLine();

        myThread.shutDown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;
    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutDown() {
        this.running = false;
    }
}