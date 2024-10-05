package Basics;

public class TSA_Cuboid {
    void tsaCuboid(int l, int b, int h){
        int tsa = 2 * (l*b+b*h+l*h);
        System.out.println("The tsa is : " + tsa + " sq. units");
    }
    int sumOfNTerms(int n){
        int sum = (n*(n+1))/2;
        return sum;
    }
    int sumUsingForLoop(int n){
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        TSA_Cuboid obj = new TSA_Cuboid();
        obj.tsaCuboid(5,6,7);
        int res = obj.sumOfNTerms(10);
        System.out.println("Sum of n terms: " + res);

        int sum = obj.sumUsingForLoop(100);
        System.out.println("Sum using for loop: " + sum);

    }
}
