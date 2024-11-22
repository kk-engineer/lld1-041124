package in.itkaran.lld1_041124.lld1.class11.collections;

public class Car implements Comparable<Car>{
    private String name;
    private Integer price;
    private Integer maxSpeed;

    public Car(String name, Integer price, Integer maxSpeed) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car other) {
        //return this.price - other.price;
        //return this.name - other.name;
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " " + price + " " + maxSpeed;
    }
}
