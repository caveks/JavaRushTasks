package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enterDate = reader.readLine();
        Date date = new Date(enterDate);
        SimpleDateFormat formatDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(formatDate.format(date).toUpperCase());
    }
}
