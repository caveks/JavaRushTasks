package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());
        if (digit > 0){
            System.out.println(digit * 2);
        } else if (digit < 0){
            System.out.println(digit + 1);
        } else if (digit == 0) {
            System.out.println("0");
        }
    }
}