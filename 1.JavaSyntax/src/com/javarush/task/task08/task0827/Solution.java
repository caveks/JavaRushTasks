package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date startYear = new Date(date);
        startYear.setDate(1);
        startYear.setMonth(0);
        long startTime = startYear.getTime();

        Date enterDate = new Date(date);
        long enterTime = enterDate.getTime();

        long year = enterTime - startTime;
        long t = 24 * 60 * 60 * 1000;
        int days = (int) (year/t) + 1;


        boolean day = days % 2 == 0 ? false : true;
        return day;

    }
}