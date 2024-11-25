package in.itkaran.lld1_041124.lld1.class12.lambdas;


public class Student {
    public String name;
    public Integer marks;
    public Integer rollNumber;

    public Student(String name, Integer marks, Integer rollNumber) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    public String toString() {
        return rollNumber + " " + name + " " + marks;
    }
}
