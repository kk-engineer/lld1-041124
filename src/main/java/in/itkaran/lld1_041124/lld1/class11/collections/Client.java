package in.itkaran.lld1_041124.lld1.class11.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        demoComparable();
    }

    private static void demoComparable() {

        Car car1 = new Car("Audi", 5000000, 200);
        Car car2 = new Car("BMW", 6000000, 220);
        Car car3 = new Car("Ferrari", 7000000, 240);
        Car car4 = new Car("Porsche", 4000000, 180);
        Car car5 = new Car("Lamborghini", 8000000, 250);

        Queue<Car> pqCars = new PriorityQueue<>();
        pqCars.add(car1);
        pqCars.add(car2);
        pqCars.add(car3);
        pqCars.add(car4);
        pqCars.add(car5);

        while (!pqCars.isEmpty()) {
            Car car = pqCars.poll();
            System.out.println(car);
        }
    }
}