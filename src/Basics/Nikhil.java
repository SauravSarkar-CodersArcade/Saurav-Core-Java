package Basics;

public class Nikhil {
    static {
        System.out.println("Nikhil TL Banega");
    }
    // IIB -> Instance Initializer Block
    {
        System.out.println("Java");
    }
    public static void main(String[] args) {
        Nikhil n = new Nikhil();
        char[] arr = {'N','K','R'};
//        String name = arr.toString(); // Wrapper Class
        String name = new String(arr);
        String jumbledData = " Nikhil1Kumar1Rai ";
        System.out.println(jumbledData.trim());
        String[] data = jumbledData.split("1");
        System.out.println(data[2]);
        System.out.println(name);
    }
    {
        System.out.println("Python");
    }
}
