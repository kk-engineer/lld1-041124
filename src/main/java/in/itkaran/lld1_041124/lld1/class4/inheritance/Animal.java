package in.itkaran.lld1_041124.lld1.class4.inheritance;

public class Animal {
    Animal(String name) {
        System.out.println("Animal: " + name);
    }

    Animal() {
        System.out.println("Animal Constructor");
    }

    public void whoAmI() {
        System.out.println("I am an Animal");
    }

    protected void abc() {
        System.out.println("Animal abc");
    }
}
