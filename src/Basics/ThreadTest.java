package Basics;
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException{
        for(int i=0; i<10; i++){
            System.out.println("Printed: " + i);
            Thread.sleep(1000);
        }
        System.out.println("Completed");
    }
}
