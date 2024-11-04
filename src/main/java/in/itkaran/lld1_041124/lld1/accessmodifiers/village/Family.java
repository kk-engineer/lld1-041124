package in.itkaran.lld1_041124.lld1.accessmodifiers.village;

public class Family {
    private String privateMember;
    Integer defaultMember;
    protected boolean protectedMember;
    public String publicMember;

    public void checkAccess() {
        System.out.println(privateMember);
        System.out.println(defaultMember);
        System.out.println(protectedMember);
        System.out.println(publicMember);
    }

    private class InnerFamily {
        public void checkAccess() {
            System.out.println(privateMember);
            System.out.println(defaultMember);
            System.out.println(protectedMember);
            System.out.println(publicMember);
        }
    }
}
