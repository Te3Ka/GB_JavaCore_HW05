package org.example.task_three;

import java.io.*;

public class ReplaceSymbolText {
    private final String fileNameOld;
    public ReplaceSymbolText(String fileName) {
        this.fileNameOld = fileName;
    }

    public void replaceChar(char targetCharacter, char replaceCharacter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameOld));
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameOld + "_replaced.txt"))) {
            while (reader.ready()) {
                char curChar = (char) reader.read();
                if (curChar == targetCharacter) {
                    curChar = replaceCharacter;
                }
                writer.write(curChar);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    public void replacePhrase(String targetStr, String replaceStr) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNameOld));
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileNameOld + "_replacedPhrase.txt"))) {
            while (reader.ready()) {
                String currentStr = reader.readLine();
                if (currentStr.contains(targetStr)) {
                    writer.write(currentStr.replace(targetStr, replaceStr) + "\n");
                } else {
                    writer.write(currentStr + "\n");
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
