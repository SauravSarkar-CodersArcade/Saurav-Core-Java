package ExceptionHandling.Latest;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
        System.out.println("Program continues.");
    }
}
