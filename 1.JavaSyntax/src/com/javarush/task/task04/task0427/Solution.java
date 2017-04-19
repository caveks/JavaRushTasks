package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

        if (x % 2 == 0 && (x >= 1 && x <= 9)){
            System.out.println("четное однозначное число");
        } else if (x % 2 != 0 && (x >= 1 && x <= 9)) {
            System.out.println("нечетное однозначное число");
        } else if (x % 2 == 0 && (x >= 10) && (x <= 99)) {
            System.out.println("четное двузначное число");
        } else if (x % 2 != 0 && (x >= 10) && (x <= 99)) {
            System.out.println("нечетное двузначное число");
        } else if (x % 2 == 0 && (x >= 100 && x <= 999)) {
            System.out.println("четное трехзначное число");
        } else if (x % 2 != 0 && (x >= 100 && x <= 999)) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
