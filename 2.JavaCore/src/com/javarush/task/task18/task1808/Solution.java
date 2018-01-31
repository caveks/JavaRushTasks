package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        reader.close();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        int count = file1.available();
            if (count % 2 == 0) {
                int n = 0;
                while (file1.available() > 0) {
                    if (n == 0) {
                        byte[] buff = new byte[file1.available() / 2];
                        file1.read(buff);
                        file2.write(buff);
                        n++;
                    } else {
                        byte[] buff = new byte[file1.available()];
                        file1.read(buff);
                        file3.write(buff);
                    }
                }
            } else {
                int n = 0;
                while (file1.available() > 0) {
                    if (n == 0) {
                        byte[] buff = new byte[file1.available() / 2 + 1];
                        file1.read(buff);
                        file2.write(buff);
                        n++;
                    } else {
                        byte[] buff = new byte[file1.available()];
                        file1.read(buff);
                        file3.write(buff);
                    }
                }
            }
        file1.close();
        file2.close();
        file3.close();
    }
}