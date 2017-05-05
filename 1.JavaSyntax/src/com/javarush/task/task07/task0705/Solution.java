package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[20];
        int[] small_1 = new int[10];
        int[] small_2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mass.length / 2; i++){
            small_1[i] = mass[i];
        }

        for (int i = mass.length / 2; i < mass.length; i++){
            int j = 0;
            small_2[j] = mass[i];
            System.out.println(small_2[j]);
            j++;
        }
    }
}
