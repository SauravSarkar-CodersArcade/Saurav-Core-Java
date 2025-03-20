import java.util.Hashtable;
import java.util.Map;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Yashas"); // 3
        ht.put(117, "Shruti"); // 2
        ht.put(128, "Vinutha"); // 1
        ht.put(102, "Adarsh"); // 4
        ht.put(100, "Vani"); // 4
        for (Map.Entry kv : ht.entrySet()){
            System.out.println(kv.getKey() + " " + kv.getValue());
        }
    }
}
