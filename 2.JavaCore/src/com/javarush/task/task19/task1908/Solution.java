package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileReader fileReader1 = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        BufferedReader reader1 = new BufferedReader(fileReader1);
        StringBuilder s = new StringBuilder();
        while (reader1.ready()){
            String c = reader1.readLine();
            s.append(c);
        }
        reader1.close();

        String regex = "\\b\\d+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);

        BufferedWriter writer = new BufferedWriter(fileWriter);
        while (matcher.find()){
            writer.write(s.substring(matcher.start(), matcher.end()) + " ");
        }
        writer.close();
    }
}
