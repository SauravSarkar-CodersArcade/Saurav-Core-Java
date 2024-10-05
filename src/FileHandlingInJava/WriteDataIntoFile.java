package FileHandlingInJava;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("D:\\IdeaProjects\\SoftwareTesting\\GCE Training\\Resources\\Java\\demo.txt", true);

        writer.append("\nHi there");
        writer.close();
        System.out.println("Successfully Written Into the file");
    }
}
//xls
//xlsx
