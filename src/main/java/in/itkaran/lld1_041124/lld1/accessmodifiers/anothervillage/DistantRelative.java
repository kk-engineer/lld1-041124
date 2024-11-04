package in.itkaran.lld1_041124.lld1.accessmodifiers.anothervillage;

import in.itkaran.lld1_041124.lld1.accessmodifiers.village.Family;

public class DistantRelative extends Family {

    public void checkAccess() {
        //System.out.println(privateMember);
        //System.out.println(defaultMember);
        System.out.println(protectedMember);
        System.out.println(publicMember);
    }
}
