package DateClassExamples;

import java.time.LocalDateTime;

public class DisplayingLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Local Date & Time are : " + obj);
    }
}
