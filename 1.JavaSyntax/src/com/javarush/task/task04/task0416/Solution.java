package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        double s = t % 5;

        if ((s >= 0) && (s < 3)){
            System.out.println("зелёный");
        } else if ((s >= 3) && (s < 4)){
            System.out.println("желтый");
        } else if((s >= 4) && (s < 5)){
            System.out.println("красный");
        }
    }
}