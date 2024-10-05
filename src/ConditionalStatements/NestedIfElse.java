package ConditionalStatements;

public class NestedIfElse {
    public static void main(String[] args) {
        int eng_marks = 29;
        int maths_marks = 67;

        if (eng_marks > 80){
            if (maths_marks > 80){
                System.out.println("You will get a bicycle");
            }
            else {
                System.out.println("You will get an ice-cream");
            }
        }
        else {
            System.out.println("Study Harder...!!!");
        }
    }
}
