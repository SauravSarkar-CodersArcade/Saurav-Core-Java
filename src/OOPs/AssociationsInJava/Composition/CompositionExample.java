package OOPs.AssociationsInJava.Composition;
class Engine {
    String type;
    Engine(String type){
        this.type = type;
    }
    void showType(){
        System.out.println("Engine type: " + type);
    }
}
class Car {
    String model;
    Engine engine;
    Car(String model, String engineType){
        this.model = model;
        this.engine = new Engine(engineType);
    }
    void showDetails(){
        System.out.println("Car model: " + model);
        engine.showType();
    }
}
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Electric");
        car.showDetails();
    }
}
