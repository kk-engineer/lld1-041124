package in.itkaran.lld1_041124.lld1.class9.solution.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private final Queue<Object> queue;
    private final String name;
    private final Semaphore producerSemaphore;
    private final Semaphore consumerSemaphore;

    public Consumer(Queue<Object> queue, String name, Semaphore producerSemaphore, Semaphore  consumerSemaphore) {
        this.queue = queue;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.remove();
            System.out.println("Consumer " + name + " removed an item , size of queue is " + queue.size());
            producerSemaphore.release(); // signal producer
        }
    }
}
