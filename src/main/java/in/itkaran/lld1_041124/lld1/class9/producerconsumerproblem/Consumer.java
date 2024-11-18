package in.itkaran.lld1_041124.lld1.class9.producerconsumerproblem;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private String name;
    private int maxSize;

    public Consumer(Queue<Object> queue, int maxSize, String name) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            if (queue.size() > 0) { // size 1 c1
                // pre-emption happens, context switch
                queue.remove(); // c2 removed from queue, size 0
                System.out.println("Consumer " + name + " removed an item , size of queue is " + queue.size());
            }
        }
    }
}
