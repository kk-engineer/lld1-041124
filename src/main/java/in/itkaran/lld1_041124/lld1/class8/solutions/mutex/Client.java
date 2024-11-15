package in.itkaran.lld1_041124.lld1.class8.solutions.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {

        Count count = new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread adderThread = new Thread(adder);
        Thread subtractorThread = new Thread(subtractor);

        subtractorThread.start();
        adderThread.start();

        try {
            adderThread.join();
            subtractorThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finally : " + count.value);

    }
}
