package dp.fibonacci;
public class FibonacciRecursive {
    public static int fib(int n){
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        // elements -> n O(n), Recursion -> Stack -> O(n)
        // O(n^2)
        int n = 6;
        System.out.println("Fibonacci of " + n + "th is " + fib(n));
    }
}
