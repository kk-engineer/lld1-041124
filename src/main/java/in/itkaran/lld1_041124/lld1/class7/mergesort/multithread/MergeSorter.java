package in.itkaran.lld1_041124.lld1.class7.mergesort.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;
        List<Integer> left = new ArrayList<>();
        for (int i=0; i<mid; i++) {
            left.add(arrayToSort.get(i));
        }

        List<Integer> right = new ArrayList<>();
        for (int i=mid; i<arrayToSort.size(); i++) {
            right.add(arrayToSort.get(i));
        }

        MergeSorter leftSorter = new MergeSorter(left, executorService);
       MergeSorter rightSorter = new MergeSorter(right, executorService);

        // We get a future object when we submit a callable to executor service
        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftSorter); // Asynchronous call
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightSorter);   // Asynchronous call

        // Now merge the two sorted arrays
        List<Integer> sortedArray = new ArrayList<>();
        int i=0, j=0;

        List <Integer> leftSortedArray = leftSortedArrayFuture.get(); // Blocking call
        List <Integer> rightSortedArray = rightSortedArrayFuture.get(); // Blocking call


        while(i<leftSortedArray.size() && j<rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        // Add remaining elements
        while(i<leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j<rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
