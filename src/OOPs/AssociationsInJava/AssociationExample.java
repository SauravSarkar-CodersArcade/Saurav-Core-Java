package OOPs.AssociationsInJava;
class Driver {
    String name;
    Driver(String name){
        this.name = name;
    }
}
class Car {
    String model;
    Car(String model){
        this.model = model;
    }
    void assignDriver(Driver driver){
        System.out.println(driver.name + " is driving the " + model);
    }
}
public class AssociationExample {
    public static void main(String[] args) {
        Driver driver = new Driver("Charles");
        Car car = new Car("Tesla");
        car.assignDriver(driver);
    }
}

