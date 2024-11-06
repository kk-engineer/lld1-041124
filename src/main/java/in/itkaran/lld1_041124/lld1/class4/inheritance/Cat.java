package in.itkaran.lld1_041124.lld1.class4.inheritance;

public class Cat extends Mammal{
    Cat(String name) {
        //super(name);
        System.out.println("Cat: " + name);
    }

    Cat() {
        // implicit super() call
        System.out.println("Cat Constructor");
    }

    public void whoAmI() {
        System.out.println("I am a Cat");
    }
}
