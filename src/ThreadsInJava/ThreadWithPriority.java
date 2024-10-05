package ThreadsInJava;

public class ThreadWithPriority extends Thread{
    @Override
    public void run() {
        System.out.println("Inside Run Method");
    }

    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();

        System.out.println("T1 : Priority --> " + t1.getPriority());
        System.out.println("T2 : Priority --> " + t2.getPriority());
        System.out.println("T3 : Priority --> " + t3.getPriority());

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(8);

        System.out.println("T1 : Priority --> " + t1.getPriority());
        System.out.println("T2 : Priority --> " + t2.getPriority());
        System.out.println("T3 : Priority --> " + t3.getPriority());

        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        // Thread.currentThread().setPriority(11); // Invalid (1-10)
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
        t1.start();
        t2.start();
        t3.start();
    }
}
