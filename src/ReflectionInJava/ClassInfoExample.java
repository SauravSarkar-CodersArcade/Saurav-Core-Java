package ReflectionInJava;

public class ClassInfoExample {
    public static void main(String[] args) {
        Class<?> myClass = String.class;
        System.out.println("Class Name: " + myClass.getName());
        System.out.println("Superclass: " + myClass.getSuperclass().getName());
        System.out.println("Is Interface: " + myClass.isInterface());
    }
}
