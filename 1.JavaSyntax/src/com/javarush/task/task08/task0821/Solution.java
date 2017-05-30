package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> peoples = new HashMap<>();

            peoples.put("A", "Huygk");
            peoples.put("B", "Fcvbc");
            peoples.put("C", "Huygk");
            peoples.put("D", "Yefdk");
            peoples.put("A", "Ndfcx");
            peoples.put("F", "Huygk");
            peoples.put("J", "Ecvbc");
            peoples.put("K", "Lbcvc");
            peoples.put("D", "Bdsd");
            peoples.put("M", "Bdfdc");

        return peoples;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
