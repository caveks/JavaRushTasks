package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputURL = reader.readLine();
        reader.close();

        URL url = new URL(inputURL);
        String s = url.getQuery();

        String[] m = s.split("&");
        for (int i = 0; i < m.length; i++) {
            String[] mass = m[i].split("=");
            System.out.print(mass[0] + " ");
        }
        System.out.println();

        for (int i = 0; i < m.length; i++) {
            String[] mass = m[i].split("=");
                if (mass[0].equals("obj")) {
                    try {
                        alert(Double.parseDouble(mass[1]));
                    } catch (NumberFormatException e) {
                        alert(mass[1]);
                    }
                }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}