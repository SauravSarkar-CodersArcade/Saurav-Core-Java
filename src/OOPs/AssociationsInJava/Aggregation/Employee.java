package OOPs.AssociationsInJava.Aggregation;

public class Employee {
    int empId;
    String name;
    Address address;

    public Employee(int empId, String name, Address address){
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Employee details: ");
        System.out.println("Name: " + this.name + " ID: " + this.empId);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state );
        System.out.println("Country: " + address.country);
    }
}
class EmployeeDetails {
    public static void main(String[] args) {
        Address address1 = new Address("Bangalore", "Karnataka", "India");
        Address address2 = new Address("Gulbarga", "Karnataka", "India");
        Employee e1 = new Employee(101, "Mujaheed", address1);
        Employee e2 = new Employee(102, "Anas", address2);

        e1.display();
        e2.display();
    }
}
