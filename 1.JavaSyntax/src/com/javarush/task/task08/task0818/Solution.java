package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Goink", 7854);
        map.put("Htykf", 562);
        map.put("Wytf", 325);
        map.put("Nugu", 105);
        map.put("Arhly", 454);
        map.put("Nuyk", 3524);
        map.put("Pihhv", 9265);
        map.put("Hyyf", 352);
        map.put("Nmkuu", 1464);
        map.put("Mitf", 554);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}