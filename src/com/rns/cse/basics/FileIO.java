package com.rns.cse.basics;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
//        String[] names = {"Saurav", "Ashank", "Nikhil"};
//        BufferedWriter writer = new BufferedWriter(new FileWriter("./files/Demo.txt", true));
//        writer.write("\nTexting to a file.");
//        writer.write("\nTexting to a file once again.");
//        for (String name: names) {
//            writer.write("\n" + name);
//        }
//        writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("./files/Demo.txt"));
        String str;
        while((str = reader.readLine()) != null){
            System.out.println(str);
        }
//        System.out.println(reader.readLine()); // For 1 Line
        reader.close();
    }
}
