package in.itkaran.lld1_041124.lld1.class7.mergesort.withoutthread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;

    public MergeSorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
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

       MergeSorter leftSorter = new MergeSorter(left);
        MergeSorter rightSorter = new MergeSorter(right);

        List<Integer> leftSortedArray = leftSorter.call();
        List<Integer> rightSortedArray = rightSorter.call();

        // Now merge the two sorted arrays
        List<Integer> sortedArray = new ArrayList<>();
        int i=0, j=0;

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
