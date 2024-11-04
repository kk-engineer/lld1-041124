package in.itkaran.lld1_041124.lld1.constructors;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        
        //demoConstructors();
        demoPassByValueOrReference();
    }

    private static void demoPassByValueOrReference() {
        int x = 10;
        fun(x);
        System.out.println(x);

        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(95);
        Student s2 = new Student("Nithin", 25, 95, marks);
        System.out.println("Name before change: " + s2.getName());
        changeName(s2);
        System.out.println("Name after change: " + s2.getName());
    }

    private static void changeName(Student s) {
        s.setName("Dharma");
    }

    private static void fun(int x) {
        x+=10;
    }

    private static void demoConstructors() {
        Student s1 = new Student();
        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(95);
        Student s2 = new Student("Nithin", 25, 95, marks);
        // Assignment is NOT copy
        Student s3 = s2;
        // Copy constructor
        Student s4 = new Student(s2);
        s4.setName("Sandeep");
        s4.setAge(31);
        s4.getMarks().add(96);
        System.out.println("Debug");
    }
}
