package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mass = new int[5];
        for (int i = 0; i < 5; i++){
            mass[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < mass.length; i++){
            int min = mass[i];
            for (int m = i + 1; m < mass.length; m++){
                if (mass[m] < mass[i]){
                    int temp = mass[i];
                    mass[i] = mass[m];
                    mass[m] = temp;
                }
            }
        }
        for (int s : mass) {
            System.out.println(s);
        }

    }
}