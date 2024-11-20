package in.itkaran.lld1_041124.lld1.class10.generics;

import java.util.HashMap;
import java.util.List;

public class Pair {
    Object first;
    Object second;

   public <G, M> M fun(G data1, M data2) {
       System.out.println("Generic method: " + data1 + " " + data2);
       return data2;
    }

    public void fun(List<Integer> nums) {
       // TODO
    }

    public void fun(HashMap<String, Integer> strings) {
       // TODO
    }
}
