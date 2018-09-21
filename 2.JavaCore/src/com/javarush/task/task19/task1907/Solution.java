package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        int i = 0;
        StringBuilder text = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        try {
            int c;
            while ((c = fileReader.read()) != -1){
                text.append(String.valueOf((char)c));
            }
        } catch(IOException ex){
        }

        String regex = "\\b[Ww][Oo][Rr][Ll][Dd]\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            i++;
        }
        System.out.println(i);
        fileReader.close();
    }
}
