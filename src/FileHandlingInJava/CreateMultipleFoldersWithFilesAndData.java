package FileHandlingInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateMultipleFoldersWithFilesAndData {
    public static void main(String[] args) throws IOException {
        String[] folderNames = {"CSE", "AI-DS", "EEE", "CIV", "MECH"};
        String[] fileNames = {"Nikhil", "Soumyashree", "Aditya", "Nandini", "Shanawaz"};
        String[] fileData = {"Coordinator", "Coordinator", "Mentor", "Faculty", "Senior Lecturer"};
        String path = "./Folders/Reva/";
        for (int i=0; i<folderNames.length; i++){
            String folderName = folderNames[i];
            File folder = new File(path + folderName);
            if (folder.mkdir()){
                System.out.println("Folder " + folder.getName() + " created successfully.");
            }else{
                System.out.println("Folder couldn't be created.");
            }
            String fileName = fileNames[i];
            File file = new File(path + folderName + "/" + fileName + ".txt");
            if (file.createNewFile()){
                System.out.println("File " + folder.getName() + " created successfully.");
            }else{
                System.out.println("File couldn't be created.");
            }
            String data = fileData[i];
            FileWriter writer = new FileWriter(path + folderName + "/" + fileName + ".txt", true);
            writer.append("\n").append(data);
            writer.close();
            System.out.println("Successfully wrote data into " + file.getName() + " inside folder " + folder.getName());
        }
    }
}
