package in.itkaran.lld1_041124.lld1.class10.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //demoObjectSolution();
        // demoGeneric();
        //demoGenericMethod();
        demoGenericStaticMethod();
    }

    private static void demoGenericStaticMethod() {
        GenericPair<String, Integer> p1 = new GenericPair<>();
        List<Integer> list = new ArrayList<>();
        //p1.funStatic("India");  // DO NOT DO THIS WAY - NOT RECOMMENDED
        GenericPair.<String>funStatic("India");
        GenericPair.funStatic(10);
        GenericPair.funStatic(true);

        GenericPair<Integer, String> p2 = new GenericPair<>();
        GenericPair<String, String> p3 = new GenericPair<>();

        GenericPair.funStatic(true);
        GenericPair.funStatic(10);
        GenericPair.funStatic("India");
    }

    private static void demoGenericMethod() {
        Pair p = new Pair();
        p.fun(10, "India");
        p.fun("India", 10);
        p.fun(10, 10);
        p.fun("India", "India");
    }

    private static void demoGeneric() {
        GenericPair<String, Long> p1 = new GenericPair<>();
        p1.first = "India";
        p1.second = 140L;  // crores

        GenericPair<String, Long> p2 = new GenericPair<>();
        p2.first = "USA";
        //p2.second = "UK"; // crores   // compilation error

    }

    private static void demoObjectSolution() {
        Pair p1 = new Pair();
        p1.first = "India";
        p1.second = 140L;  // crores

        // mistake
        Pair p2 = new Pair();
        p2.first = 32L; // crores
        p2.second = "USA";

        Long indiaPopulation = (Long) p1.second;
        Long usaPopulation = (Long) p2.second; // ClassCastException
        System.out.println("India population: " + indiaPopulation + " crores");
        System.out.println("USA population: " + usaPopulation + " crores");
    }
}
