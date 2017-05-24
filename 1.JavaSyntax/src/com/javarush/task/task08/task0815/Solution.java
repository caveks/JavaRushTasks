package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("First", "dfdf");
        map.put("Second", "sdgdgfd");
        map.put("Three", "cvbc");
        map.put("Four", "trhfg");
        map.put("Five", "xcbv");
        map.put("Six", "rfgfg");
        map.put("Seven", "cvbc");
        map.put("Eight", "kjkh");
        map.put("Nine", "sdee");
        map.put("Ten", "iuyt");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)){
                n++;
            }
        }
        return n;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int n = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {

    }
}