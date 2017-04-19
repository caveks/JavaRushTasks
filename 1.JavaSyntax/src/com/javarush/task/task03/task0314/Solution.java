package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int m;
        while (i < 11){ 
            m = 1;
            while (m < 11) {
                System.out.print(i * m + " ");
                m = m + 1;
            }
        System.out.println();
        i = i + 1;
        }
    }
}
