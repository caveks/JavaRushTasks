package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(inputFile);
        FileWriter fileWriter = new FileWriter(outputFile);
        int i = 1;
        while (fileReader.ready()){
            int s = fileReader.read();
            if (i % 2 == 0){
                fileWriter.write(s);
            }
            i++;
        }
        fileReader.close();
        fileWriter.flush();
        fileWriter.close();
    }
}
