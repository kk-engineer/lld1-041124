package in.itkaran.lld1_041124.lld1.class7.mergesort.multithread;

import in.itkaran.lld1_041124.lld1.class7.mergesort.multithread.MergeSorter;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(7,4,5,6,1,3,2,9,8, 7,4,5,6,1,3,2,9,8, 7,4,5,6,1,3,2,9,8, 7,4,5,6,1,3,2,9,8, 7,4,5,6,1,3,2,9,8);
        //ExecutorService executorService = Executors.newFixedThreadPool(20);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(numbers, executorService);
        Future<List<Integer>> sortedNumbersFuture = executorService.submit(mergeSorter);
        System.out.println(sortedNumbersFuture.get());
        executorService.shutdown();
    }
}
