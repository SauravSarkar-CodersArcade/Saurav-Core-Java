package FinalKeywordInJava;

public class FinalVariable {
    final int parameter = 100;

    final int value; // final variables are initialised inside constructor
    static final int number;
    // Initialising static final variable in the static block
    static {number = 20;}
    FinalVariable(){
        value = 10;
        System.out.println(value);
    }
    void change(){
        // parameter = 200; Not Possible
    }

    public static void main(String[] args) {
        new FinalVariable();
        System.out.println(number);
    }
}
