package FileHandlingInJava;

import java.io.File;

public class DeletingFolder {
    public static void main(String[] args) {
        //File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\GCE Training\\Resources\\Java");
        File obj1 = new File("D:\\IdeaProjects\\SoftwareTesting\\GCE Training\\BMS\\CSE");
        if (obj1.delete()){
            System.out.println("Folder Deleted Successfully: " + obj1.getName());
        }
        else{
            System.out.println("Failed to delete the folder");
        }
    }
}
