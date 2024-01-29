package org.example.homeWork;

import java.io.*;

public class ArrayCrossesAndZeros {
    public static void saveArray(int[] arrInt) {
        try (FileOutputStream fileOutputStreamBit = new FileOutputStream("ACAZ_bite.txt");
             FileOutputStream fileOutputStreamInt = new FileOutputStream("ACAZ_int.txt")) {
            int compactedValue = 0;
            int bitPosition = 0;
            for (int i = 0; i < 9; i++) {
                fileOutputStreamInt.write(String.valueOf(arrInt[i]).getBytes());
                compactedValue |= (arrInt[i] & 0b11) << bitPosition;
                bitPosition += 2;
                if (bitPosition >= 8) {
                    fileOutputStreamBit.write(compactedValue);
                    compactedValue = 0;
                    bitPosition = 0;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
