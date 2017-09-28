package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (Exception e){

        }
    }

    public static Flyable result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().toLowerCase();

        if (s.equals("helicopter")){
            result = new Helicopter();
        } else if (s.equals("plane")){
            String numPassengers = reader.readLine();
            result = new Plane(Integer.parseInt(numPassengers));
        }
        reader.close();
    }
}