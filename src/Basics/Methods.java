package Basics;

public class Methods {
    void mySum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is : " + sum);
    }
    void myDiff(int a, int b){
        int diff = a-b;
        System.out.println("Diff is: " + diff);
    }
    int product(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        // Unstructured Programming
        int a = 100;
        int b = 200;
        String ab = " ";

        int sum = a + b;
        //System.out.println("Sum is : " + sum);
        // Classname obj = new Classname();
        Methods obj = new Methods();
        obj.mySum(200,300);
        obj.myDiff(200, 100);
        int result = obj.product(2,3);
        System.out.println(result);
        System.out.println(obj.product(10,20));
    }
}
