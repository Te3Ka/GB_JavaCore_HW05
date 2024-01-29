package org.example.homeWork;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        /*
        Задание 1
        Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
        во вновь созданную папку ./backup
         */
        BackupFiles.backupFiles();

        /*
        Задание 2.
        Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
        и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
        где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
        Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
        Записать в файл 9 значений так, чтобы они заняли три байта.
         */
        Random random = new Random();
        int[] arrInt = new int[9];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = random.nextInt(0, 4);
        }
        System.out.println(Arrays.toString(arrInt));
        ArrayCrossesAndZeros.saveArray(arrInt);

        /*
        Задание 3.
        Написать функцию, добавляющую префикс к каждому из набора файлов,
        названия которых переданы ей в качестве параметров через пробел.
         */
        String names = "ACAZ_bite.txt sem5.txt Task_03.txt_replaced.txt sem5_int.txt";
        Prefix.prefix("000_", names);
    }
}
