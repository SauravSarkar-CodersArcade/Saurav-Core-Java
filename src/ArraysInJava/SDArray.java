package ArraysInJava;

public class SDArray {
    public static void main(String[] args) {
        String[] names = {"Sanjay", "Rahul", "Sachin", "Samar"};
        //System.out.println(names[0]);
        //System.out.println(names[1].charAt(0));
        //System.out.println(names.length);

        int[] numbers = {1,2,3,4,5,6,7};
        //System.out.println(numbers[0]);
        /*
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int j=0; j<names.length;j++){
            System.out.print(names[j] + " ");
        }
        System.out.println();
        */
        // Enhanced For Loop : Arrays / Data Structures : Collections
        for (String i : names){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int j : numbers){
            System.out.print(j + " ");
        }
    }
}
