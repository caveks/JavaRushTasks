package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int x = 10 - a;
        int y = 10 - b;
        if(abs(x) < abs(y)){
            System.out.println(a);
        } else if (abs(x) > abs(y)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}