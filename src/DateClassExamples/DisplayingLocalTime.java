package DateClassExamples;

import java.time.LocalTime;

public class DisplayingLocalTime {
    public static void main(String[] args) {
        LocalTime obj = LocalTime.now();
        System.out.println("The current time is : " + obj);
    }
}
