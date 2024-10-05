package InterviewRelatedStuff;

public class StringCaseConversionsWithoutBuiltIns {
    public static void main(String[] args) {
        String str = "AbCdEf";
        String upperCaseStr = convertToUpperCase(str);
        System.out.println(upperCaseStr);

        String lowerCaseStr = convertToLowerCase(str);
        System.out.println(lowerCaseStr);

        String s = "laskhdlakshfasKHLKH";
        String upperCaseS = convertToUpperCase(s);
        System.out.println(upperCaseS);

        String lowerCaseS = convertToLowerCase(s);
        System.out.println(lowerCaseS);
        System.out.println('A'-'a');
    }

    // Method to convert a string to uppercase
    public static String convertToUpperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] -= 32;
            }
        }
        return new String(charArray);
    }

    // Method to convert a string to lowercase
    public static String convertToLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] += 32;
            }
        }
        return new String(charArray);
    }
}
