package in.itkaran.lld1_041124.lld1.class12.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Client {

    public static void main(String[] args) {

        // Anonymous Class
        SampleFunctionalInterface sfi2 = new SampleFunctionalInterface() {
            //@Override
            public void fun() {
                System.out.println("Hello World");
            }
        };
        sfi2.fun();

    // Lambda Function
        SampleFunctionalInterface sfi = () -> System.out.println("Hello");
        sfi.fun();


        ABC abc = new ABC() {
            @Override
            public void fun() {
                System.out.println("Hello World");
            }

            @Override
            public void fun2() {
                System.out.println("Hello World 2");
            }
        };
        abc.fun();
        abc.fun2();


        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 20);

        Predicate<Integer> predicate = (a) -> a%2==1;
        System.out.println(predicate.test(20));

        BiPredicate<String, Integer> biPredicate = (a, b) -> a.length() > b;
        System.out.println(biPredicate.test("Scaler", 3));

        BiPredicate<String, Integer> biPredicate2 = (a, b) -> { return a.length() > b;};
        System.out.println(biPredicate2.test("Ganesh", 5));
        
        demoRunnable();
    }

    private static void demoRunnable() {
        // Anonymous Class
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // Lambda Function
        Runnable runnable2 = () -> {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();


        // More concise Lambda Function
        Thread thread3 = new Thread(() -> {
            System.out.println("Hello from thread " + Thread.currentThread().getName());
        });
        thread3.start();

    }
}
