package OOPs.AssociationsInJava.Composition;

public class Composition {
    public static void main(String[] args) {
        Human h1 = new Human("Samuel");
        Cat c1 = new Cat("Tommy", h1);
        System.out.println(h1);
        System.out.println(c1);

        Human h2 = new Human("George");
        Cat c2 = new Cat("Alex", h2);
        System.out.println(h2);
        System.out.println(c2);
    }
}
