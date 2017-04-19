package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word1 = reader.readLine();
        String word2 = reader.readLine();

        if(word1.equals(word2)){
            System.out.println("Имена идентичны");
        } else if (word1.length() == word2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
