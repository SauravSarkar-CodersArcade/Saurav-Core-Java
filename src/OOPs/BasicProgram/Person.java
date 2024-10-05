package OOPs.BasicProgram;

public class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    int usn;
    Student(String name, int usn){
        super(name);
        this.usn = usn;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Student obj = new Student("Person 1", 123);
        Student obj1 = new Student("Person 2", 456);
        System.out.println(obj.name + " - "+ obj.usn);
    }
}
