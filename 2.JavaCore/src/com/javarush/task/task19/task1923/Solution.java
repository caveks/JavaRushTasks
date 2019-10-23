package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader file1 = new FileReader(args[0]);
        FileWriter file2 = new FileWriter(args[1]);
        Scanner scan = new Scanner(file1);
        while (scan.hasNextLine()){
            String s = scan.nextLine();
            String[] text = s.trim().split("[ ]");
            for (int i = 0; i < text.length; i++) {
                if (!text[i].matches("^\\D*$")){
                    file2.write(text[i] + " ");
                }
            }
        }
        file1.close();
        file2.close();
    }
}