package FileHandlingInJava;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFoldersFilesWriteData {
    public static void main(String[] args) throws IOException {
        String[] studentNames = {"Vinisha", "Mayank", "Fazil", "Eshana", "Revathi"};
        String[] courseNames = {"Python", "Java", "SQL", "Ruby", "JavaScript"};
        String[] projectName = {"MachineLearning", "SpringFramework", "HospitalDatabase", "InternetOfThings", "MagicUI"};
        String path = "./Folders/Saurav/";
        for (int i = 0; i < studentNames.length; i++){
            String folderName = studentNames[i];
            File folder = new File(path + folderName);
            if (folder.mkdir()){
                System.out.println("Folder " + folder.getName() + " created successfully.");
            }else{
                System.out.println("Failed to create the folder.");
            }
            String fileName = courseNames[i];
            File file = new File(path + folderName + "/" + fileName + ".txt");
            if (file.createNewFile()){
                System.out.println("File " + file.getName() + " created successfully.");
            }else{
                System.out.println("Failed to create the file.");
            }
            String data = projectName[i];
            FileWriter writer = new FileWriter(path + folderName + "/" + fileName + ".txt");
            writer.append("\n").append(data);
            System.out.println("Successfully wrote to the file.");
            writer.close();
        }
    }
}
