package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2));
        String s;
        StringBuilder builderReader = new StringBuilder();
        StringBuilder builderWriter = new StringBuilder();

        while ((s = bufferedReader.readLine()) != null)  {
            builderReader.append(s);
        }

        String[] line = builderReader.toString().split(" ");
        double[] digit = new double[line.length];
        for (int i = 0; i < digit.length; i++) {
            digit[i] = Double.parseDouble(line[i]);
        }

        for (int i = 0; i < digit.length; i++) {
            builderWriter.append(Math.round(digit[i]) + " ");
        }

        bufferedWriter.write(String.valueOf(builderWriter));

        reader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
