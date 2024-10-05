package CollectionFramework;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        // Top-down & right - left storage
        // Initial fixed size is 11 and 11 buckets are given from 0-10
        // hashing algorithm is used after dividing by 11 and getting the remainder
        // hashing is the process of providing a unique integer value by the JVM for each particular object/integer value.
        // If the same index clashes, it's called hash collision, then they are stored in a linked list in the same index
        // And then displayed top-down , right-left
        ht.put(106, "Saurav"); // 7
        ht.put(102, "Nikhil"); // 3
        ht.put(108, "Ashank"); // 9
        ht.put(117, "Chandan");// 7

        for (Map.Entry<Integer, String > entry : ht.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " <-> " + "Value: " + value);
        }
    }
}
