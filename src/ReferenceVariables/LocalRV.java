package ReferenceVariables;

public class LocalRV {
    public static void main(String[] args) {
        int count = 10;
        String college = "Ghousia";
        int number = 0;
        System.out.println(count);
        System.out.println(college);
        System.out.println(number);
        //System.out.println(newNumber); Error - Cannot Access
    }
    void display(){
        int newNumber = 20;
        System.out.println(newNumber);
        // System.out.println(number); Error - Cannot Access
    }
}
