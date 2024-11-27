package in.itkaran.lld1_041124.lld1.class13.finalize;

public class Student {

    public void finalize() throws Throwable{
        System.out.println("Finalize called");
        System.out.println("Free resources");
    }

    public static void main(String[] args) throws Throwable {
        Student student = new Student();
        student.finalize();
        student.finalize();

        // Set the object as null for garbage collection
        student = null;
        System.gc();
    }
}
