package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++){
            for (int m = 0; m < i; m++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}
