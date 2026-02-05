package StreamAPI;
import java.util.*;
import java.util.stream.*;
class Employee {
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}
public class MapEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Amit", 40000),
            new Employee("Neha", 65000)
        );

        List<String> names = employees.stream()
                                      .map(e -> e.name)
                                      .collect(Collectors.toList());

        System.out.println(names);
    }
}
