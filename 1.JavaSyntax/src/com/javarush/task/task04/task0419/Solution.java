package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int x;
        int y;

        if(a >= b){
            x = a;
        } else {
            x = b;
        }
        if (c >= d){
            y = c;
        } else {
            y = d;
        }
        if (x > y){
            System.out.println(x);
        } else if (x < y){
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}
