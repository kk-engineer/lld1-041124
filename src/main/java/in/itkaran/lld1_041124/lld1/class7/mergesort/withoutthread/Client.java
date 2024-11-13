package in.itkaran.lld1_041124.lld1.class7.mergesort.withoutthread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(7,4,5,6,1,3,2,9,8);
        MergeSorter mergeSorter = new MergeSorter(numbers);
        List<Integer> sortedNumbers = mergeSorter.call();
        System.out.println(sortedNumbers);
    }
}
