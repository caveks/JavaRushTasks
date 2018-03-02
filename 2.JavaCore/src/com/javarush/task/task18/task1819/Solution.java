package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(fileName1));
        byte[] b1 = new byte[inputStream1.available()];
        while (inputStream1.available() > 0) {
            inputStream1.read(b1);
        }
        BufferedOutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream(fileName1));
        BufferedInputStream inputStream2 = new BufferedInputStream(new FileInputStream(fileName2));
        byte[] b2 = new byte[inputStream2.available()];
        while (inputStream2.available() > 0){
            inputStream2.read(b2);
        }

        outputStream1.write(b2);
        outputStream1.write(b1);

        reader.close();
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();
    }
}
