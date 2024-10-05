package OOPs.BasicProgram;

public class BankEmployees {
    String name;
    int empId;
    String department;
    int salary;

    public BankEmployees(String name, int empId, String department, int salary){
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }
    public void employeeDetails(){
        System.out.println("The details of the employee are: ");
        System.out.println("Name: " + this.name);
        System.out.println("Emp ID: " + this.empId);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
    }
    public static void salaryCheck(int m1, int m2){
        if (m1>m2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

class Test {
    public static void main(String[] args) {
        BankEmployees e1 = new BankEmployees("Sachin", 101, "Accounts", 35000);
        BankEmployees e2 = new BankEmployees("Samar", 102, "Development", 60000);

        e1.employeeDetails();
        e2.employeeDetails();
        BankEmployees.salaryCheck(e1.salary, e2.salary);

    }
}
