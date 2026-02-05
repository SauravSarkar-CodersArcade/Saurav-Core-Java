package ThreadsInJava;

class JoinProof {

    static class Task extends Thread {
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
            System.out.println("Task finished");
        }
    }

    public static void main(String[] args) throws Exception {

        Task t = new Task();
        t.start();

        t.join();   // GUARANTEED wait

        System.out.println("Main thread resumes");
    }
}
