package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean one = true;
        int summa = 0;

        while (one){
            int digit = Integer.parseInt(reader.readLine());
            summa = summa + digit;
            if (digit == -1){
                one = false;
            }
        }
        System.out.println(summa);
    }
}
