package OOPs.Polymorphism.Overloading;

public class Addition {
    /** Static keyword is used for better memory management
     * Static methods can be accessed from inside a class directly without object
     * Static methods can be accessed outside a class using the class name
     * Static methods belong to the class and not to any particular object
     */
    static int add(int a, int b){ return a+b; }
    static int add(int a, int b, int c){ return a+b+c;}
    static int add(int a, int b, int c, int d){ return a+b+c+d;}
    static float add(float a, float b){ return a+b;}
    /*
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
        System.out.println(add(1.2f, 1.3f));
    }
     */
}
class Overloading {
    public static void main(String[] args) {
        // Accessing static method of different class using Class name
        System.out.println(Addition.add(1,2));
    }
}

