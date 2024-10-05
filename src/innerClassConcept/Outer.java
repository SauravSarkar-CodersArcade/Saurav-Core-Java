package innerClassConcept;
public class Outer {
    private int value = 20;
    class Inner{
        void display(){
            System.out.println("Value is: " + value);
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        // OuterClass.InnerClass in_obj = out_obj.new Inner();
        in.display();
    }
}
