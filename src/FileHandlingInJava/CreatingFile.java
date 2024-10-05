package FileHandlingInJava;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) {
        File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\GCE Training\\Resources\\Java\\demo.txt");
        try {
            if (obj.createNewFile()){
                System.out.println("File created successfully: " + obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Something unexpected happened...!!!");
        }
    }
}
