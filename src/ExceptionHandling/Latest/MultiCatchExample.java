package ExceptionHandling.Latest;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            //int data = 100 / 0; // Throws ArithmeticException
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program continues.");
    }
}
