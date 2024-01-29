package org.example.homeWork;

import java.io.*;

public class Prefix {
    public static void prefix(String prefix, String fileNames) {
        System.out.println(fileNames);
        String[] fileNamesArr = fileNames.split(" ");
        for (String s : fileNamesArr) {
            try (BufferedReader reader = new BufferedReader(new FileReader(s));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(prefix + s))) {
                while (reader.ready()){
                    writer.write(reader.readLine() + "\n");
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
    }
}
