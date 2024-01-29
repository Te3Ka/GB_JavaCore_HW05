package org.example.task_four;

public class Ex_04 {
    public static void main(String[] args) {
        ShowCurrentDirectory showCurrentDirectory = new ShowCurrentDirectory();
        showCurrentDirectory.printFiles();
        System.out.println("*".repeat(30));
        showCurrentDirectory.printAllFiles(0);
    }
}
