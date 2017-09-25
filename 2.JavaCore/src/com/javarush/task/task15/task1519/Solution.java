package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        ArrayList<String> list = new ArrayList<>();

        while (!inputString.equals("exit")) {
            list.add(inputString);
            inputString = reader.readLine();
        }
        reader.close();

        for (int i = 0; i < list.size(); i++) {
            try {
                if (list.get(i).contains(".")) {
                    print(Double.parseDouble(list.get(i)));
                } else if ((Integer.parseInt(list.get(i)) > 0) && (Integer.parseInt(list.get(i)) < 128)) {
                    print(Short.parseShort(list.get(i)));
                } else if ((Integer.parseInt(list.get(i)) <= 0) || (Integer.parseInt(list.get(i)) >= 128)) {
                    print(Integer.parseInt(list.get(i)));
                }
            } catch (NumberFormatException e) {
                print(list.get(i));
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}