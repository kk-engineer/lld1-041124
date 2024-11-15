package in.itkaran.lld1_041124.lld1.class8.solutions.synchronised.method;

public class Client {
    public static void main(String[] args) {

            Count count = new Count();
            Adder adder = new Adder(count);
            Subtractor subtractor = new Subtractor(count);

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

            System.out.println("Final Value: " + count.getValue());

    }
}
