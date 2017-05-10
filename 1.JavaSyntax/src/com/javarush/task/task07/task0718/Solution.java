package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        for (int i = 0; i < list.size(); i++){
            int min = list.get(i).length();
            for (int m = i + 1; m < list.size(); m++){
                if (list.get(m).length() < min){

                }
            }
        }
        for (String s:list) {
            System.out.println(s);
        }
    }
}

