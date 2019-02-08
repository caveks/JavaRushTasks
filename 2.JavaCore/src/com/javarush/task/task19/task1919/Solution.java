package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> startList = new ArrayList<>();
        TreeMap<String, Double> finalList = new TreeMap<>();

        while(bufferedReader.ready()) {
            String s = bufferedReader.readLine();
            startList.add(s);
        }

        for (int i = 0; i < startList.size(); i++) {
            String n = startList.get(i);
            String[] w = n.split(" ");
            String surname = w[0];
            double figure = Double.parseDouble(w[1]);
                for (int j = i + 1; j < startList.size(); j++) {
                    String n1 = startList.get(j);
                    String[] w1 = n1.split(" ");
                    String surname1 = w1[0];
                    double figure1 = Double.parseDouble(w1[1]);
                    if (surname.equals(surname1)){
                        figure = figure + figure1;
                        startList.remove(j);
                        j--;
                    }
                }
            finalList.put(surname, figure);
        }

        for (Map.Entry<String, Double> entry : finalList.entrySet()) {
            String n = entry.getKey();
            double d = entry.getValue();
            System.out.println(n + " " + d);
        }
        fileReader.close();
    }
}
