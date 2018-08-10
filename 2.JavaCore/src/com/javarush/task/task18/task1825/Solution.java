package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<String> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputFileName = reader.readLine();
            if (inputFileName.equals("end")) {
                break;
            }
            set.add(inputFileName);
        }

        String outFileName = set.first().split("\\.")[0] + "." + set.first().split("\\.")[1];
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outFileName));

        for (String s : set) {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s));
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            for (int i = 0; i < b.length; i++) {
                outputStream.write(b[i]);
            }
         inputStream.close();
        }
        outputStream.close();
        reader.close();
    }
}
