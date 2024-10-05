package ReflectionInJava;

import java.util.ArrayList;

public class DynamicObjectCreationExample {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> myClass = Class.forName("java.util.ArrayList");
        ArrayList<String> list = (ArrayList<String>) myClass.newInstance();
        list.add("Hello");
        list.add("World");
        System.out.println(list); // Output: [Hello, World]
    }
}

