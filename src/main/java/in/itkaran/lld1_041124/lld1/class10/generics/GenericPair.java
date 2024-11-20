package in.itkaran.lld1_041124.lld1.class10.generics;

public class GenericPair <F, S> {
    F first;
    S second;

    public S fun(F data1, S data2) {
        System.out.println("Generic method: " + data1 + " " + data2);
        return data2;
    }

    public static <F> void funStatic(F data) {
        System.out.println("Generic method: " + data);
    }

    public static void funStatic2(boolean data) {
        System.out.println("Generic method: " + data);
    }
}
