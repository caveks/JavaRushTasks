package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.TreeSet;


public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));
        TreeSet<Integer> set = new TreeSet<>();

        while (reader.ready()) {
            int digit = Integer.parseInt(reader.readLine());
            if (digit % 2 == 0) {
                set.add(digit);
            }
        }

        reader.close();

        for (Integer d : set) {
            System.out.println(d);
        }

    }
}