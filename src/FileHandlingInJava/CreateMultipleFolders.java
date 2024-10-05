package FileHandlingInJava;

import java.io.File;

public class CreateMultipleFolders {
    public static void main(String[] args) {
        String[] folderNames = {"Ashank", "Chandan", "Nikhil", "Saurav", "Tanmay", "Ujjwal"};
        String path = "./Folders/";
        for (String folderName : folderNames) {
            File obj = new File(path + folderName);
            if (obj.mkdir()) {
                System.out.println("Folder " + obj.getName() + " created successfully.");
            } else {
                System.out.println("Folder " + obj.getName() + " couldn't be created.");
            }
        }
    }
}
