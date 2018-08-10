package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(args[2]));
        if (args[0].equals("-e")){
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            for (int i = 0; i < b.length; i++) {
                outputStream.write(b[i] + 1);
            }
        } else if (args[0].equals("-d")){
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            for (int i = 0; i < b.length; i++) {
                outputStream.write(b[i] - 1);
            }

        }
        inputStream.close();
        outputStream.close();
    }
}
