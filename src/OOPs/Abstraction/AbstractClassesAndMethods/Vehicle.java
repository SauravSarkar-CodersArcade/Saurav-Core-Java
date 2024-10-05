package OOPs.Abstraction.AbstractClassesAndMethods;

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with keys");
    }
}
class Scooter extends Vehicle {

    @Override
    void start() {
        System.out.println("Scooter can start with keys or kick start");
    }
}

class AbstractionTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Scooter s = new Scooter();
        s.start();
    }
}