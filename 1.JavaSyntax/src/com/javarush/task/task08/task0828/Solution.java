package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> number = new HashMap<>();
        number.put("january", 1);
        number.put("february", 2);
        number.put("march", 3);
        number.put("april", 4);
        number.put("may", 5);
        number.put("june", 6);
        number.put("july", 7);
        number.put("august", 8);
        number.put("september", 9);
        number.put("october", 10);
        number.put("november", 11);
        number.put("december", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        for (Map.Entry<String, Integer> n : number.entrySet()) {
            if (n.getKey().contains(month.toLowerCase())){
                System.out.println(month + " is " + n.getValue() + " month");
            }
        }
    }
}