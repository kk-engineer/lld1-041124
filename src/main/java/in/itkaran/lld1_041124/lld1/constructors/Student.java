package in.itkaran.lld1_041124.lld1.constructors;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {
    private String name;
    private int age;
    private double psp;
    private List<Integer> marks;


    public Student(String name, int age, double psp, List<Integer> marks) {
        // Object is created with default values
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.marks = marks;
    }

    public Student() {
        // Object is created with default values
    }

    // Copy constructor
    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        // Shallow copy
        //this.marks = marks;
        // Deep copy
        this.marks = new ArrayList<>(student.marks);
    }
}
