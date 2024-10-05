package ThreadsInJava;

public class ThreadExample {
    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new NumberPrinterThread("Thread 1");
        Thread thread2 = new NumberPrinterThread("Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

class NumberPrinterThread extends Thread {
    private String threadName;

    public NumberPrinterThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);

            // Introduce a small delay to make it easier to see the interleaved output
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

