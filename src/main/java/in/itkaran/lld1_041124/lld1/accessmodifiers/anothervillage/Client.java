package in.itkaran.lld1_041124.lld1.accessmodifiers.anothervillage;

import in.itkaran.lld1_041124.lld1.accessmodifiers.village.Family;

public class Client {
    public static void main(String[] args) {
        
        demoAccessModifiers2();
    }

    private static void demoAccessModifiers2() {
        Family family = new Family();
        //System.out.println(family.privateMember);
        //System.out.println(family.defaultMember);
        //System.out.println(family.protectedMember);
        System.out.println(family.publicMember);
    }
}
