package ThreadsInJava;

public class MultiThreadDemo {
    public static void main(String[] args) {
        MultiThread thread1 = new MultiThread();
        MultiThread thread2 = new MultiThread();
        thread1.start();
        thread2.start();
    }
}
