package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        TreeMap<String, Double> list = new TreeMap<>();
        double max = 0;

        while (bufferedReader.ready()){
            String[] s = bufferedReader.readLine().split(" ");
            if (list.containsKey(s[0])) {
                list.put(s[0], list.get(s[0]) + Double.parseDouble(s[1]));
                if (list.get(s[0]) > max){
                    max = list.get(s[0]);
                }
            } else {
                list.put(s[0], Double.parseDouble(s[1]));
                if (list.get(s[0]) > max){
                    max = list.get(s[0]);
                }
            }
         }
//      double max = Collections.max(list.values()); - search max

        for (Map.Entry<String, Double> entry : list.entrySet()) {
            String surname = entry.getKey();
            double d = entry.getValue();
            if (d == max){
                System.out.println(surname);
            }
        }
        fileReader.close();
    }
}
