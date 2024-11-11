package in.itkaran.lld1_041124.lld1.class6.introtothreads;

public class Client {

    public static void main(String[] args) {

        System.out.printf("Hello World from Thread: %s%n", Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread = new Thread(helloWorldPrinter);
        thread.start();

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread numberThread = new Thread(numberPrinter);
            numberThread.start();
        }
    }
}
