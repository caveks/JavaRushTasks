package com.javarush.task.task19.task1909;

/* 
Замена знаков
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

        FileReader file = new FileReader(fileName1);
        BufferedReader bufferedReader = new BufferedReader(file);
        StringBuilder text = new StringBuilder();

        while (bufferedReader.ready()){
            text.append(bufferedReader.readLine());
        }
        bufferedReader.close();

        String regex = "[.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        FileWriter writer = new FileWriter(fileName2);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        while (matcher.find()){
            bufferedWriter.write(matcher.replaceAll("!"));
        }
        bufferedWriter.close();
    }
}
