package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();

        FileReader file = new FileReader(filename1);
        BufferedReader fileReader = new BufferedReader(file);
        StringBuilder text = new StringBuilder();
        while (fileReader.ready()){
            text.append(fileReader.readLine());
        }
        fileReader.close();

        String regex = "\\p{Punct}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        FileWriter fileWriter = new FileWriter(filename2);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        while (matcher.find()){
            writer.write(matcher.replaceAll(""));
        }
        writer.close();
    }
}
