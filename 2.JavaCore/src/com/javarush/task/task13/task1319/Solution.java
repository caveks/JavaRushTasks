package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        while (true){
            String s = reader.readLine();
            writer.write(s);
            writer.newLine();
            if (s.toLowerCase().equals("exit")){
                break;
            }
        }
        reader.close();
        writer.close();
    }
}