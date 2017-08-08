package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<StringBuilder> listEvenOdd = new ArrayList<StringBuilder>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char[] letter = s.toCharArray();
            StringBuilder builder = new StringBuilder();
            if (letter.length % 2 == 0){
                builder.append(s + " " + s);
            } else {
                builder.append(s + " " + s + " " + s);
            }

            listEvenOdd.add(builder);
        }

        for (int i = 0; i < listEvenOdd.size(); i++) {
            System.out.println(listEvenOdd.get(i));
        }
    }
}