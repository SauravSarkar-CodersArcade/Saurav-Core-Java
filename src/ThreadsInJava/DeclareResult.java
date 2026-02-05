package ThreadsInJava;
public class DeclareResult {
    synchronized void declareResult() throws InterruptedException{
        System.out.println("Waiting for approval.");
        wait();
        System.out.println("Result declared");
    }
    synchronized void approve(){
        System.out.println("Now it's approved for declaring result.");
        notify();
    }
    public static void main(String[] args) throws InterruptedException{
        DeclareResult dr = new DeclareResult();
        new Thread(() -> {
            try {
                dr.declareResult();
            }catch (InterruptedException e){}
        }).start();
        Thread.sleep(3000);
        new Thread(dr::approve
        ).start();
        /*
        or
        new Thread(() -> dr.approve()
        ).start();
         */
    }
}
