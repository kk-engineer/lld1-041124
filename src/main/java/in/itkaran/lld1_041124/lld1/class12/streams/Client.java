package in.itkaran.lld1_041124.lld1.class12.streams;

import in.itkaran.lld1_041124.lld1.class12.lambdas.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

        //demoCreateStream();
        demoStream();
    }

    private static void demoStream() {
        // Filter

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNums = nums.stream()
                .filter(num -> num % 2 != 0)
                .toList();

        System.out.println(oddNums);

        // Map

        List<Student> students = Arrays.asList(
                new Student("Dhanush", 70, 1),
                new Student("Ganesh", 60, 2),
                new Student("Mini", 90, 3),
                new Student("Khushbu", 80, 4)
        );

        List<String> names = students.stream()
                .map(student -> student.name)
                .toList();

        System.out.println(names);

        List<String> upperCaseNames = students.stream()
                .map(student -> student.name.toUpperCase())
                .toList();
        System.out.println(upperCaseNames);

        List<String> lowerCaseNames = upperCaseNames.stream().map(String::toLowerCase).toList();
        System.out.println(lowerCaseNames);

        // FlatMap
        List<List<String>> combinedList = Arrays.asList(upperCaseNames, lowerCaseNames);
        System.out.println(combinedList);

        List<String> flatCombinedList = combinedList.stream()
                .flatMap(list -> list.stream())
                .toList();

        System.out.println(flatCombinedList);

    }


    private static void demoCreateStream() {
        // 1 From List
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream1 = nums.stream();

        // 2 Directly create a stream
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 3. Stream Builder (Design Pattern)
        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        builder.add(2);
        builder.add(3);

        builder.build();
    }



}
