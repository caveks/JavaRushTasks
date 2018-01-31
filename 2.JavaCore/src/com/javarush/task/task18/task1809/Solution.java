package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);

        byte[] bytes = new byte[file1.available()];
        file1.read(bytes);
        for (int i = bytes.length - 1; i >= 0; i--){
            file2.write(bytes[i]);
        }
        file1.close();
        file2.close();
    }
}