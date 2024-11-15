package in.itkaran.lld1_041124.lld1.class8.solutions.mutex;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            System.out.println("Subtractor " + i + " " + Thread.currentThread().getName());
            count.value -= i;
            lock.unlock();
        }

    }
}
