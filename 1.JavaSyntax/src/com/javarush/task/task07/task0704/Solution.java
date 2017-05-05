package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        // 1-й вариант
        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }


        // 2-й вариант
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            j--;
        }
        for (int mass : array) {
            System.out.println(mass);
        }

    }
}

