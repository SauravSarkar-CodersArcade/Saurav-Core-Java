package FinalKeywordInJava;

public class FinalParameter {
    int square(final int x){
        // x = 10; Cannot change final parameter value
        return x*x;
    }

    public static void main(String[] args) {
        System.out.println(new FinalParameter().square(5));
    }

}
