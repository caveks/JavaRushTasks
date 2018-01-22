package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listByte = new ArrayList<>();
        int n = 1;

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
                }
            }
            if (repeat > n){
                n = repeat;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int repeat = 1;
            int a = list.get(i);
            for (int m = i + 1; m < list.size(); m++) {
                int b = list.get(m);
                if (a == b) {
                    repeat++;
                }
            }
            if (repeat == n){
                listByte.add(a);
            }
        }

        for (Integer t : listByte) {
            System.out.print(t + " ");
        }
    }
}