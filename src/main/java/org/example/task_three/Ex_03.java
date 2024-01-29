package org.example.task_three;

public class Ex_03 {
    public static void main(String[] args) {
        ReplaceSymbolText replaceSymbolText = new ReplaceSymbolText("Task_03.txt");
        replaceSymbolText.replaceChar(' ', '_');
        replaceSymbolText.replacePhrase("alarm", "будильник");
    }
}
