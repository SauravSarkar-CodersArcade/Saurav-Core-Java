package StreamAPI;

import java.util.stream.Stream;

public class Concatenation {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Coders", " ", "Arcade", " ", "YouTube", " ", "Channel");

        String concatenatedString = stringStream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        ).toString();

        System.out.println(concatenatedString);
    }
}

