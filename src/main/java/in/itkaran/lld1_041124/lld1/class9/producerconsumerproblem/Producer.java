package in.itkaran.lld1_041124.lld1.class9.producerconsumerproblem;

import java.util.Objects;
import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;

    public Producer(Queue<Object> queue, int maxSize, String name) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            if (queue.size() < maxSize) {
                queue.add(new Object());
                System.out.println("Producer " + name + " added an item , size of queue is " + queue.size());
            }
        }
    }
}
