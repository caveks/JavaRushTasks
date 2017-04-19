package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 2; i < 11; i++){
            x = x * i;
        }
        System.out.println(x);
    }
}
