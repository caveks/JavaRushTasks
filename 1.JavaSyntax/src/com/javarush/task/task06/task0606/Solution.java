package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());

        while (digit > 0){
            int x = digit % 10;
                if (x % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            digit = digit / 10;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
