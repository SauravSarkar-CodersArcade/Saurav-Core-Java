package DateClassExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayingFormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Date/Time before formatting : " + obj);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, MMM dd yyyy");
        // E --> Day of the week (Mon - Sun)
        // D --> Day of the year (365 days)
        String formattedDateTime = obj.format(format);
        System.out.println("Date/Time after formatting : " + formattedDateTime);

    }
}
