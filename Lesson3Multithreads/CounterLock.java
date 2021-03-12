package Lesson3Multithreads;

import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    public static int counter = 100;

    public static void main(String[] args) throws InterruptedException {

        ReentrantLock r = new ReentrantLock();
        new Thread(new Runnable() {
            @Override
            public void run() {
                r.lock();
                for (int i = 0; i < 5; i++) {
                    counter += 2;
                    System.out.println("Поток 1 (+2), значение счетчика: " + counter);
                }
                r.unlock();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                r.lock();
                for (int i = 0; i < 5; i++) {
                    counter--;
                    System.out.println("Поток 2 (-1), значение счетчика: " + counter);
                }
                r.unlock();
            }
        }).start();
    }
}
