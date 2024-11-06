package in.itkaran.lld1_041124.lld1.class4.inheritance;

public class Mammal extends Animal{
    Mammal(String name) {
        super(name);
        System.out.println("Mammal: " + name);
    }

    Mammal() {
        // implicit super() call
        System.out.println("Mammal Constructor");
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a Mammal");
    }
}
