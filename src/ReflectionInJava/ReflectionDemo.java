package ReflectionInJava;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Tom", 5);
        Field[] catFields = myCat.getClass().getDeclaredFields();
//        myCat.name = "Fred"; // Not Allowed
//        myCat.setName("Fred"); // Not Allowed
        for (Field field : catFields){
            System.out.println(field.getName());
        }
        // Get all fields
        for (Field field : catFields){
            field.setAccessible(true); // Show later after exception
            if (field.getName().equals("name")){
                field.set(myCat, "Fred");
            }
        }
        System.out.println(myCat.getName());
        // Get all Methods
        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for (Method method : catMethods){
            System.out.println(method.getName());
        }
        // Look for the meow method
        for (Method method : catMethods){
            if (method.getName().equals("meow")){
               method.invoke(myCat); // no parameters
               myCat.meow(); // Same result
            }
        }
        for (Method method : catMethods){
            if (method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true); // show later
//                myCat.heyThisIsPrivate(); Error because it's private
                method.invoke(myCat);
            }
        }
        // For static methods without parameters we can call using null
        for (Method method : catMethods){
            if (method.getName().equals("thisIsAPublicStaticMethod")){
                method.setAccessible(true); // show later
                method.invoke(null);
            }
        }
        for (Method method : catMethods){
            if (method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible(true); // show later
                method.invoke(null);
            }
        }
    }
}
// Why reflection ?
// It's cool to manipulate your programs.
// Helps us understand how different parts of Java code work.
// Real World, in Frameworks, Reflection is used a lot because it(the FW) has to be compatible
// with code that hasn't even been written.
// Sprint Boot, Framework uses reflection to check all the classes that we have created in the FW
// to look for problems and workflow and errors.
// Also used to create objects of the Framework classes, manipulate them and inject them in other
// classes.
// It's way easy to break down codes using reflection. If not used properly, it can create
// serious bugs and disintegrate the application.
// Everything/Optimisation in Reflection is done at runtime. There are no compile-time optimisations.
// So, it's a little slow.

