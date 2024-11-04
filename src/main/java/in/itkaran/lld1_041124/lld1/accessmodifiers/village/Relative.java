package in.itkaran.lld1_041124.lld1.accessmodifiers.village;

public class Relative extends Family {

    public void checkAccess() {
        //System.out.println(privateMember);
        System.out.println(defaultMember);
        System.out.println(protectedMember);
        System.out.println(publicMember);
    }
}
