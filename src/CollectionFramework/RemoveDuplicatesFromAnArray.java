package CollectionFramework;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        String[] names = {"Tanzeem", "Mujaheed","Abdul","Tanzeem","Heena","Heena"};
        Set<String> uniqueNames = new LinkedHashSet<>();

        uniqueNames.addAll(Arrays.asList(names));
        System.out.println("After removing duplicates: ");
        //System.out.println(uniqueNames);
        // Lambda Expression
        uniqueNames.forEach(System.out::println);
    }
}
