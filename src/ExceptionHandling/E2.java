package ExceptionHandling;

public class E2 {
    static void ageCheck(int age){
        if (age < 18){
            throw new RuntimeException("Access Denied - Age is less than 18");
        }
        else{
            System.out.println("Access granted - You are eligible");
        }
    }
    public static void main(String[] args) {
        ageCheck(16);
    }
}
