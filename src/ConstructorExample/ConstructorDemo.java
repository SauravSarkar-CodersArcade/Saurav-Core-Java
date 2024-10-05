package ConstructorExample;

public class ConstructorDemo {
    int x;
    int y;
    public ConstructorDemo(){
        x = 10;
        y = 20;
    }
    public ConstructorDemo(int a, int b){
        x = a;
        y = b;
    }

    public ConstructorDemo(double a, double b){
        x = (int) a;
        y = (int) b;
    }
}
class Constructor{
    public static void main(String[] args) {
        ConstructorDemo o1 = new ConstructorDemo();
        System.out.println(o1.x);
        System.out.println(o1.y);

        ConstructorDemo o2 = new ConstructorDemo(1,2);
        System.out.println(o2.x);
        System.out.println(o2.y);

        ConstructorDemo o3 = new ConstructorDemo(1.2, 4.5);
        System.out.println(o3.x);
        System.out.println(o3.y);
    }

}
