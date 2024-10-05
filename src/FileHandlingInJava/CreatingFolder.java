package FileHandlingInJava;

import java.io.File;

public class CreatingFolder {
    public static void main(String[] args) {
        File obj = new File("./resources/Demo");
        if (obj.mkdir()){
            System.out.println("Folder has been created: " + obj.getName());
        }
        else{
            System.out.println("Folder already exists.");
        }
    }
}
