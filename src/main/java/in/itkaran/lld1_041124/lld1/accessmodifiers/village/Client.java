package in.itkaran.lld1_041124.lld1.accessmodifiers.village;

public class Client {
    public static void main(String[] args) {

        demoAccessModifiers();
    }

    private static void demoAccessModifiers() {
        Family family = new Family();
        //System.out.println(family.privateMember);
        System.out.println(family.defaultMember);
        System.out.println(family.protectedMember);
        System.out.println(family.publicMember);
    }
}
