package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        LinkedList<Integer> list = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
            int digit = Integer.parseInt(reader.readLine());
            list.add(digit);
            }
        } catch (Exception e){
            for (Integer i : list) {
                System.out.println(i);
            }
        }
    }
}
