package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);
        int n = 0;
        int space = 0;

        while (inputStream.available() > 0) {
            int b = inputStream.read();
            n++;
            if (b == 32) {
                space++;
            }
        }

        DecimalFormatSymbols s = new DecimalFormatSymbols();
        s.setDecimalSeparator('.');
        DecimalFormat f = new DecimalFormat("#,##0.00", s);
        System.out.println(f.format((double)space/n * 100));
        // 2-й вариант
        //System.out.println(String.format("%.2f",(double)space/n * 100).replace(',', '.'));
        inputStream.close();
    }
}
