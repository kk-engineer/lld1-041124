package in.itkaran.lld1_041124.lld1.class8.solutions.synchronised.block;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (count) {
                System.out.println("Subtractor " + i + " " + Thread.currentThread().getName());
                count.value -= i;
            }
        }
    }
}
