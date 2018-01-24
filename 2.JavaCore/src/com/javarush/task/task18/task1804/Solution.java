package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listByte = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        for (int i = 0; i < list.size(); i++) {
            int repeat = 1;
            int a = list.get(i);
            for (int m = i + 1; m < list.size(); m++) {
                int b = list.get(m);
                if (a == b) {
                    repeat++;
                    list.remove(m);
                    m--;
                }
            }
            if (repeat == 1){
                listByte.add(a);
            }
        }

        for (Integer t : listByte) {
            System.out.print(t + " ");
        }
    }
}