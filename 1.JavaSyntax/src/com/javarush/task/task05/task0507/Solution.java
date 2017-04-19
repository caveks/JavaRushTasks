package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());
        double x = 0;
        int n = 1;

        while (digit != -1){
            x = x + digit;
            digit = Integer.parseInt(reader.readLine());
            if (digit != -1){
                n++;
            }
        }
        System.out.println(x / n);
    }
}

