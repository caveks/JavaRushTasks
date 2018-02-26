package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int count = 0;
        int m;
        ArrayList<Character> c = new ArrayList<>();

        while ((m = reader.read()) != -1) {
            c.add(Character.toLowerCase((char)m));
        }

        for (int i = 0; i < c.size(); i++) {
            if ((c.get(i) >= 'a') && (c.get(i) <= 'z')){
                count++;
            }
        }

        System.out.println(count);
        reader.close();
    }
}
