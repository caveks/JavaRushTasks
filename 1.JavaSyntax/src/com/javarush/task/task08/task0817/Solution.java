package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("One", "A");
        map.put("Two", "B");
        map.put("Three", "C");
        map.put("Four", "D");
        map.put("Five", "E");
        map.put("Six", "B");
        map.put("Seven", "F");
        map.put("Eight", "K");
        map.put("Nine", "L");
        map.put("Ten", "F");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            String value = pair.getValue();
            int n = 0;
            for (Map.Entry<String, String> pair1 : copy.entrySet()) {
                String value1 = pair1.getValue();
                if (value.equals(value1)){
                    n++;
                }
            }
            if (n > 1){
                removeItemFromMapByValue(map, value);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
