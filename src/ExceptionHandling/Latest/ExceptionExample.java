package ExceptionHandling.Latest;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may raise an exception
            int data = 100 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            // Exception handling code
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues after exception handling.");
    }
}
