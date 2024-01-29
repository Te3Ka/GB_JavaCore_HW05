package org.example.homeWork;

import java.io.*;

public class BackupFiles {
    static final String backupDir = "./backup";
    static final String currentDir = ".";


    public static void backupFiles() {
        File nameCurrentDirectory = new File(currentDir);
        File nameBackupDirectory = new File(backupDir);
        nameBackupDirectory.mkdir();

        File[] filesCurrentDirectory = nameCurrentDirectory.listFiles();
        for (File f : filesCurrentDirectory) {
            if (f.isFile()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(f));
                     BufferedWriter writer = new BufferedWriter(new FileWriter(backupDir + "/" + f.getName()))) {
                    while (reader.ready()) {
                        writer.write(reader.readLine() + "\n");
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex.getMessage());
                }
            }
        }

    }
}
