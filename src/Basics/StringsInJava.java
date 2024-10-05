package Basics;

public class StringsInJava {
    public static void main(String[] args) {
        String message = "Hello";
        char[] chars = {'H','e','l','l','o'};
        String newString = new String(chars);
        System.out.println(message);
        System.out.println(newString);
        // Accessing Elements :
        // First Element
        System.out.println(message.charAt(0));
        // Last Element
        System.out.println(message.charAt(message.length()-1));
        // finding the length of a string :
        System.out.println("Length = " + message.length());
        // Concatenation : Adding of Strings
        String m1 = "Ghousia";
        String m2 = "College";
        String m3 = "10";
        String m4 = "20";
        System.out.println(m1+ " " +m2);
        System.out.println(m3+m4);
        String lCaps = "core java";
        System.out.println(lCaps.toUpperCase());
        System.out.println("Original String: " + lCaps);
        String space = "    Python  Programming   ";
        // trimming the start and end whitespaces
        System.out.println(space.trim());

        String m = "Abhishek1is1learning1Java";
        String[] sm = m.split("1");
        System.out.println(sm);
        for (String elem : sm ){
            System.out.print(elem + " ");
        }
    }
}
