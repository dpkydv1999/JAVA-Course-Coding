import java.io.IOException;

class Car implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " got into car to drive");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " lets drive the car");
            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " got car into parking");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
}

public class SynchronizedJava {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
