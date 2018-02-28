package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName1));
        BufferedInputStream inputStream2 = new BufferedInputStream(new FileInputStream(fileName2));
        BufferedInputStream inputStream3 = new BufferedInputStream(new FileInputStream(fileName3));

        byte[] b2 = new byte[inputStream2.available()];
        inputStream2.read(b2);
        byte[] b3 = new byte[inputStream3.available()];
        inputStream3.read(b3);
        for (int i = 0; i < b2.length; i++) {
            outputStream.write(b2[i]);
        }
        for (int i = 0; i < b3.length; i++) {
            outputStream.write(b3[i]);
        }
        reader.close();
        outputStream.close();
        inputStream2.close();
        inputStream3.close();
    }
}
