package Lesson3Multithreads;

public class PingPong {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Thread myThreadPing = new Thread(() -> System.out.println("Ping"));
            Thread myThreadPong = new Thread(() -> System.out.println("Pong"));

            myThreadPing.start();
            myThreadPing.join();

            myThreadPong.start();
            myThreadPong.join();
        }
    }
}
