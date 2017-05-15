package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("жень-шень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");

        for (String s : fruits) {
            System.out.println(s);
        }

//        вывод с помощью итератора
//        Iterator<String> iterator = fruits.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            System.out.println(s);
//        }

    }
}