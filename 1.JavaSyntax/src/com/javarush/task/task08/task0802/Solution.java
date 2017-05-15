package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> ftuitsVegetables = new HashMap<>();
        ftuitsVegetables.put("арбуз","ягода");
        ftuitsVegetables.put("банан", "трава");
        ftuitsVegetables.put("вишня", "ягода");
        ftuitsVegetables.put("груша", "фрукт");
        ftuitsVegetables.put("дыня", "овощ");
        ftuitsVegetables.put("ежевика", "куст");
        ftuitsVegetables.put("жень-шень", "корень");
        ftuitsVegetables.put("земляника", "ягода");
        ftuitsVegetables.put("ирис", "цветок");
        ftuitsVegetables.put("картофель", "клубень");

        for (Map.Entry<String, String> entry : ftuitsVegetables.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }

//        Iterator<Map.Entry<String, String>> iterator = ftuitsVegetables.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, String> entry = iterator.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " - " + value);
//        }

    }
}