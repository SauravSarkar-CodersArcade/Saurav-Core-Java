package AccessModifiers.package1;

public class ABC {
    private int value = 20;
    private void message(){
        System.out.println("Private Method");
    }
}
class A{
    public static void main(String[] args) {
        ABC obj = new ABC();
        // obj.value; Not allowed
        // obj.message(); Not allowed
    }
}
