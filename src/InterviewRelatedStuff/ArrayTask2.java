package InterviewRelatedStuff;

public class ArrayTask2 {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        char ch = 'A';
        removeChar(str, ch);

    }
    public static void removeChar(String str, char c){
        int n = str.length();
        StringBuilder finalStr = new StringBuilder();
        for (int i=0; i<n; i++){
            if(str.charAt(i) != c){
                finalStr.append(str.charAt(i));
            }
        }
        System.out.println(finalStr);
    }

}
