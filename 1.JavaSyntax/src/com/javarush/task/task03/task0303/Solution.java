package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(54, 0.9));
        System.out.println(convertEurToUsd(35, 0.9));
    }

    public static double convertEurToUsd(int eur, double course) {
        return (double) eur * course;
    }
}
