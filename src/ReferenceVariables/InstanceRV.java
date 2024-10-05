package ReferenceVariables;

public class InstanceRV {
    int number = 10;
    String name = "Gokul";

    public static void main(String[] args) {
        InstanceRV obj = new InstanceRV();
        System.out.println(obj.number);
        System.out.println(obj.name);
        // System.out.println(number); can't access without object creation
        System.out.println();
    }
}
