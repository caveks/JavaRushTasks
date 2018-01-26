package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sortList = new ArrayList<>();

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
                for (int m = i + 1; m < list.size(); m++){
                    int a = list.get(m);
                    if (a < min) {
                        int temp = min;
                        min = a;
                        list.set(m, temp);
                    }
                }
            sortList.add(min);
        }

        for (int i = 0; i < sortList.size(); i++) {
            int a = sortList.get(i);
            for (int m = i + 1; m < sortList.size(); m++){
                int b = sortList.get(m);
                if (a == b) {
                    sortList.remove(m);
                    m--;
                }
            }
        }

        for (Integer i : sortList) {
            System.out.print(i + " ");
        }

        // 2-й вариант //

//        TreeSet<Integer> set = new TreeSet<>();
//        while (fileInputStream.available() > 0) {
//            set.add(fileInputStream.read());
//        }
//        fileInputStream.close();
//
//        for (Integer i : set) {
//            System.out.print(i + " ");
//        }



    }
}