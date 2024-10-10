package ExceptionHandling.Latest;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            checkNumber(1);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkNumber(int number) throws Exception {
        if (number < 0) {
            throw new Exception("Negative number not allowed");
        } else {
            System.out.println("Number is positive");
        }
    }
}
