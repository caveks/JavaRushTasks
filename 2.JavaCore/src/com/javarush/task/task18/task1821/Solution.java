package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> simbol = new ArrayList<>();
        TreeMap<Integer, Integer> count = new TreeMap<>();

        while (inputStream.available() > 0) {
            simbol.add(inputStream.read());
        }

        for (int i = 0; i < simbol.size(); i++) {
            int n = 1;
            int x = simbol.get(i);
            for (int j = i + 1; j < simbol.size(); j++) {
                if (x == simbol.get(j)){
                    n++;
                    simbol.remove(j);
                    j--;
                }
            }
            count.put(x, n);
        }

        for (Map.Entry<Integer, Integer> s : count.entrySet()) {
            int z = s.getKey();
            char n = (char) z;
            System.out.println(n + " " + s.getValue());
        }
        inputStream.close();
    }
}
