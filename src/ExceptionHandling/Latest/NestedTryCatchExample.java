package ExceptionHandling.Latest;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            try {
                int data = 100 / 0; // Will throw ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: " + e);
            }
            int[] arr = new int[5];
            arr[5] = 10; // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: " + e);
        }
        System.out.println("Program continues.");
    }
}
