package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class My_Number {
    int x;
    My_Number(int x){
        this.x = x;
    }
}
// Separate comparator class
class MySort implements Comparator<My_Number>{
    public int compare(My_Number a, My_Number b){
        System.out.println("Comparing " + a.x + " with " + b.x);
        return a.x - b.x; // Ascending
    }
}
public class CompareExample {
    public static void main(String[] args) {
        ArrayList<My_Number> list = new ArrayList<>();
        list.add(new My_Number(5));
        list.add(new My_Number(1));
        list.add(new My_Number(3));

        Collections.sort(list, new MySort()); // uses compare()
        for (My_Number n : list){
            System.out.print(n.x + " ");
        }
    }
}
