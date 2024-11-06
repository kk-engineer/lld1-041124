package in.itkaran.lld1_041124.lld1.class4.inheritance;

public class Lion extends Cat{
    Lion(String name) {
        super(name);
        System.out.println("Lion: " + name);
    }

    Lion() {
        // implicit super() call
        System.out.println("Lion Constructor");
    }

    @Override
    public void whoAmI() {
        System.out.println("I am a Lion");
    }

    public void fun(int x, String name) {
        System.out.println("Lion fun: " + x + " " + name);
    }

//    public int fun(int x, String name) {
//        System.out.println("Lion fun: " + x + " " + name);
//        return x;
//    }

    public void fun(String name, int x) {
        System.out.println("Lion fun: " + name + " " + x);
    }
}
