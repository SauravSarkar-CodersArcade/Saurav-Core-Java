package AccessModifiers.package2;

import AccessModifiers.package1.ProtectedClass;

public class B extends ProtectedClass{
    public static void main(String[] args) {
        // A a = new A(); Not possible
        B b = new B();
        b.m1();
    }
}
