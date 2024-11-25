package in.itkaran.lld1_041124.lld1.class12.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        demoComparator();
    }

    private static void demoComparator() {
//        List<Student> students1 = new ArrayList<>();
//        students1.add(new Student("Dhanush", 10, 1));
//        students1.add(new Student("Ganesh", 20, 2));
//        students1.add(new Student("Mini", 30, 3));
//        students1.add(new Student("Khushbu", 40, 4));

        List<Student> students = Arrays.asList(
            new Student("Dhanush", 70, 1),
            new Student("Ganesh", 60, 2),
            new Student("Mini", 90, 3),
            new Student("Khushbu", 80, 4)
        );

        Comparator<Student> marksComparator = (s1, s2) -> s1.marks - s2.marks;
        students.sort(marksComparator);
        System.out.println(students);

        Comparator<Student> rollNumComparator2 = (s1, s2) -> s1.rollNumber - s2.rollNumber;
        Comparator<Student> rollNumComparator = Comparator.comparingInt(s -> s.rollNumber);
        students.sort(rollNumComparator2);
        System.out.println(students);
    }
}
