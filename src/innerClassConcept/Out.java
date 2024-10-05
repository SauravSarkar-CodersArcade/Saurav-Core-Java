package innerClassConcept;

public class Out {
    private int param = 10;
    class In{
        void show(){
            System.out.println("Param is: " + param);
        }
    }

    public static void main(String[] args) {
        Out out = new Out();
        Out.In in = out.new In();
        in.show();
    }
}
