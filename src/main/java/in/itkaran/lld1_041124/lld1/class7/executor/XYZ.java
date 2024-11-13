package in.itkaran.lld1_041124.lld1.class7.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class XYZ {
    public static void main(String[] args) {

        demoExecutor();
    }

    private static void demoExecutor() {
        //ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            //  1 request
            executorService.execute(new NumberPrinter(i));
        }
        executorService.shutdown();
    }
}
