package in.itkaran.lld1_041124.lld1.class4.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        //demoInheritance();
        demoPolymorphism();
    }

    private static void demoPolymorphism() {
        // Method overloading
        Lion l1 = new Lion("Leo");
        l1.fun(10, "Leo");
        l1.fun("Leo2", 10);
        //l1.whoAmI();
        l1.abc();

        Animal a = new Lion();

        // Method overriding
//        Animal a1 = new Lion("Leo");
//        a1.whoAmI();

        // Polymorphism
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Lion("Leo"));
        animalList.add(new Cat("Tom"));
        animalList.add(new Dog("Spike"));

        for (Animal a : animalList) {
            a.whoAmI();
        }
    }

    private static void demoInheritance() {
        //Lion lion = new Lion();
//        Lion lion1 = new Lion("Simba");
//        lion1.whoAmI();

//        Animal a1 = new Lion("Leo");
//        a1.whoAmI();

//        Animal a2 = new Animal("Animal");
//        a2.whoAmI();


        // TypeCasting

        Animal a3 = new Cat("Tom");
//        Animal a4 = new Dog("Spike");
//        a4.whoAmI();
//        Dog d1 = (Dog) a4;
//        d1.whoAmI();

        // Double check before casting
        // avoid casting - as far as possible
        //Dog d2 = (Dog) a3; // ClassCastException
//        d2.whoAmI();

        Animal a4 = new Dog("Spike");
        // a4.play(); wont compile
        Dog d3 = (Dog) a4;
        d3.play();
//        Dog d1 = new Dog("Rhyme");
//        d1.play();

    }
}
