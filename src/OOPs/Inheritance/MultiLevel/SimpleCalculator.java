package OOPs.Inheritance.MultiLevel;

public class SimpleCalculator {
    float addition(float a, float b){
        return a+b;
    }
}
class AdvancedCalculator extends SimpleCalculator{
    float subtraction(float a, float b){
        return a-b;
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    float multiplication(float a, float b){
        return a*b;
    }
    float division(float a, float b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("------------------------------");
        SimpleCalculator sc = new SimpleCalculator();
        float r1 = sc.addition(1,2);
        System.out.println(r1);
        System.out.println("------------------------------");
        AdvancedCalculator adc = new AdvancedCalculator();
        float r2 = adc.addition(4,5);
        float r3 = adc.subtraction(5,3);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("------------------------------");
        SuperAdvancedCalculator sadc = new SuperAdvancedCalculator();
        float r4 = sadc.addition(5,6);
        float r5 = sadc.subtraction(2.3f, 4.5f);
        float r6 = sadc.multiplication(10,20);
        float r7 = sadc.division(100,50);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println("------------------------------");
    }
}
