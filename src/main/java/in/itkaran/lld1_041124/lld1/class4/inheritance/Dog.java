package in.itkaran.lld1_041124.lld1.class4.inheritance;

public class Dog extends Mammal{
    Dog(String name) {
        super(name);
        System.out.println("Dog: " + name);
    }

    Dog() {
        // implicit super() call
        System.out.println("Dog Constructor");
    }

    public void whoAmI() {
        System.out.println("I am a Dog");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}
