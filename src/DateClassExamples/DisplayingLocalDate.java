package DateClassExamples;

import java.time.LocalDate;

public class DisplayingLocalDate {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now().minusDays(5);
        System.out.println("The date is: " + obj);
    }
}
