package OOPs.Abstraction.Interfaces;

public interface AnimalsInterface {
    void size();
    void colour();
}
class Lion implements AnimalsInterface{

    @Override
    public void size() {
        System.out.println("Lion has huge size");
    }

    @Override
    public void colour() {
        System.out.println("Lion's colour is brownish-yellow");
    }

}
class Squirrel implements AnimalsInterface {

    @Override
    public void size() {
        System.out.println("Squirrel's size is small");
    }

    @Override
    public void colour() {
        System.out.println("Squirrel's colour is dark-brown");
    }
}

class InterfaceTest {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.size();
        l.colour();
        Squirrel s = new Squirrel();
        s.size();
        s.colour();
    }
}