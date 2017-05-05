package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arrayS = new String[10];
        int[] arrayI = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            arrayS[i] = reader.readLine();
            arrayI[i] = arrayS[i].length();
        }
        for (int digit : arrayI) {
            System.out.println(digit);
        }
    }
}
