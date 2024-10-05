package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        /*
        pattern : input Pattern
        target : String Matcher
         */
        Pattern pattern = Pattern.compile("core java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("We are learning Core Java");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);

        if (matchFound){
            System.out.println("Match has been found");
        }
        else{
            System.out.println("Match has not been found");
        }

    }
}
