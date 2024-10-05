package LoopingStatements;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while (condition)
        {
        statements...
        increment or decrement
        }
         */
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while(i<5);
    }
}
