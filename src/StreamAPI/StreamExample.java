package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> stream = numbers.stream();
//         Alternatively, you can create a stream directly from an array
         int[] arr = {1, 2, 3, 4, 5};
         IntStream stream1 = Arrays.stream(arr);

        stream.forEach(System.out::println);
    }
}

