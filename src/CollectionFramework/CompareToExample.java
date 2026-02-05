package CollectionFramework;
import java.util.ArrayList;
import java.util.Collections;
class MyNumber implements Comparable<MyNumber> {
    int x;
    MyNumber(int x){
        this.x = x;
    }
    // compareTo decides natural sorting
    public int compareTo(MyNumber o){
        System.out.println("Comparing " + this.x + " with " + o.x);
        return this.x - o.x; // Ascending Order
    }
}
public class CompareToExample {
    public static void main(String[] args) {
        ArrayList<MyNumber> list = new ArrayList<>();
        list.add(new MyNumber(5));
        list.add(new MyNumber(1));
        list.add(new MyNumber(3));

        Collections.sort(list);

        for (MyNumber n : list){
            System.out.print(n.x + " ");
        }
    }
}
