package FileHandlingInJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateMultipleFoldersAndFiles {
    public static void main(String[] args) throws IOException {
        String[] folderNames = {"Bizotic", "Pentagon Space", "Audaz", "Ten Seconds", "Seventh Sense"};
        String[] fileNames = {"Biz", "Pent", "Aud", "Ten", "Seventh"};
        String[] invoiceData = {"4500/-", "6000/-", "6000/-", "4500/-", "4000/-"};
        String path = "./Folders/Saurav/";
        for (int i = 0; i < folderNames.length; i++){
            String folderName = folderNames[i];
            File folder = new File(path + folderName);
            if (folder.mkdir()){
                System.out.println("Folder " + folder.getName() + " created successfully.");
            }else{
                System.out.println("Failed to create the folder.");
            }
            String fileName = fileNames[i];
            File file = new File(path + folderName + "/" + fileName + ".txt");
            if (file.createNewFile()){
                System.out.println("File " + file.getName() + " created successfully.");
            }else{
                System.out.println("Failed to create the file.");
            }
            String data = invoiceData[i];
            FileWriter writer = new FileWriter(path + folderName + "/" + fileName + ".txt");
            writer.append("\n").append(data);
            System.out.println("Successfully wrote to the file.");
            writer.close();
        }
    }
}
