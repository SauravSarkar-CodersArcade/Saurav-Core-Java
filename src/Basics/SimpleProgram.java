package Basics;

public class SimpleProgram {
    public SimpleProgram(){  // Constructor
        System.out.println("I am a constructor");
    }
    public static void main(String[] args) {
        System.out.println("We are learning Java");
        SimpleProgram obj = new SimpleProgram();
        SimpleProgram obj2 = new SimpleProgram();
    }
}
