package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int summa = 0;

        while (s.equals("сумма") == false) {
            summa = summa + Integer.parseInt(s);
            s = reader.readLine();
        }
        System.out.println(summa);
    }
}