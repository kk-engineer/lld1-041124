package in.itkaran.lld1_041124.lld1.class7.executor;

public class NumberPrinter implements Runnable{

        private int number;

        public NumberPrinter(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Number: " + number + " from Thread: " + Thread.currentThread().getName());
        }
}
