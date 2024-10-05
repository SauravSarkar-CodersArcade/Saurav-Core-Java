package OOPs.Inheritance.MultiLevel;

public class A {
    void methodA(){
        System.out.println("Method of Class A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of Class B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of Class C");
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------");
        A a = new A();
        a.methodA();
        System.out.println("---------------------------------");
        B b = new B();
        b.methodA();
        b.methodB();
        System.out.println("---------------------------------");
        C c = new C();
        c.methodA();
        c.methodB();
        c.methodC();
        System.out.println("---------------------------------");
    }
}

