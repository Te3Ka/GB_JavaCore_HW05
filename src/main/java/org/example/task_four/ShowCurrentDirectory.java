package org.example.task_four;

import java.io.File;
import java.util.Objects;

public class ShowCurrentDirectory {
    public void printFiles() {
        File file = new File(".");
        for (File f : Objects.requireNonNull(file.listFiles())) {
            System.out.println(f.getName());
        }
    }

    public void printAllFiles(int level) {
        File file = new File(".");
        diveDeep(file, 0);
    }
    private void diveDeep (File currentFile, int level) {
        if (currentFile.isFile()) {
            System.out.println("=".repeat(level) + " " + currentFile.getName());
        } else {
            System.out.println("=".repeat(level) + " " + currentFile.getName().toLowerCase() + ":");
            for (File f : Objects.requireNonNull(currentFile.listFiles())) {
                diveDeep(f, level + 1);
            }
        }
    }
}
