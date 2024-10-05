package OOPs.Abstraction.AbstractClassesAndMethods;

abstract class Animals {
    // Abstract Method
    public abstract void sound();
    // Normal or Concrete method
    public void run(){
        System.out.println("I am running...!!!");
    }
}
class Tiger extends Animals{

    @Override
    public void sound() {
        System.out.println("I am a tiger. I have a very loud voice...!!!");
    }
}
class Turtle extends Animals{

    @Override
    public void sound() {
        System.out.println("I am a turtle. I have a very low voice...!!!");
    }
}

class AbstractionDemo{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sound();
        tiger.run();
        Turtle turtle = new Turtle();
        turtle.sound();
        turtle.run();
    }
}
