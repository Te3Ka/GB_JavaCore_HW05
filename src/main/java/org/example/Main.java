package org.example;


import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Seminar # 5");

        int[] intArray = new int[9];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        String fileName = "sem5_byte.txt";

        /*
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sem5.txt"))) {
            bufferedWriter.write(Arrays.toString(intArray));
        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        */
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (Integer num : intArray) {
                dataOutputStream.writeByte(num);
                dataOutputStream.writeByte(0);
            }
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            byte[] byteArr = dataInputStream.readAllBytes();

            int[] arrInt = IntStream.range(0, byteArr.length).map(i -> byteArr[i] & 0xFF).filter(i -> i != 0).toArray();
            System.out.println(Arrays.toString(arrInt));

        } catch (IOException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}