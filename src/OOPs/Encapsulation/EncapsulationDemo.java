package OOPs.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Use of the setters
        s1.setName("Gokul");
        s1.setRollNo(100);
        s1.setAge(22);

        // Use of the getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll Number: " + s1.getRollNo());
        System.out.println("Age: " + s1.getAge());
    }
}
