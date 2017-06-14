package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("One", new Cat("One"));
        map.put("Two", new Cat("Two"));
        map.put("Three", new Cat("Three"));
        map.put("Four", new Cat("Four"));
        map.put("Five", new Cat("Five"));
        map.put("Six", new Cat("Six"));
        map.put("Seven", new Cat("Seven"));
        map.put("Eight", new Cat("Eight"));
        map.put("Nine", new Cat("Nine"));
        map.put("Ten", new Cat("Ten"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> cat : map.entrySet()) {
            set.add(cat.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}