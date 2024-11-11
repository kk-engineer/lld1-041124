package in.itkaran.lld1_041124.lld1.class6.introtothreads;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World from Thread: " + Thread.currentThread().getName());
    }
}
