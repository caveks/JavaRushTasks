package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = 0;
        int minimum = 0;

        int[] mass = new int[20];
        for (int i = 0; i < 20; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }

        maximum = mass[0];
        for (int i = 1; i < mass.length; i++){
            if (maximum < mass[i]){
                maximum = mass[i];
            }
        }

        minimum = mass[0];
        for (int i = 1; i < mass.length; i++){
            if (minimum > mass[i]){
                minimum = mass[i];
            }
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}