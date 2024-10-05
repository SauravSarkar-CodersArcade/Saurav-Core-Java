package RegularExpressions;

public class SplitAStringIntoArray {
    public static void main(String[] args) {
        String data = "Hello1We1Are1Learning1Core1Java";
        char[] letters = data.toCharArray();
        System.out.println(letters[0]);
        String[] message = data.split("1");
        System.out.println(message[4]);
        for (String word : message){
            System.out.print(word + " ");
        }
    }
}
