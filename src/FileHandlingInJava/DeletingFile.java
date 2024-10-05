package FileHandlingInJava;

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\GCE Training\\Resources\\Java\\demo.txt");
        if (obj.delete()){
            System.out.println("Text File deleted successfully: " + obj.getName());
        }
        else{
            System.out.println("Failed to delete the text file...!!!");
        }
    }
}
