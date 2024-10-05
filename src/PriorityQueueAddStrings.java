/*package whatever //do not write package name here */

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueAddStrings {

    public static void main(String[] args)
    {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add("A");
        pq.add("B");
        pq.add("C");

        System.out.println(pq);
    }
}
